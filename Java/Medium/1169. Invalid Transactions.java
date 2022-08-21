// Approach 1 : HashMap

class Solution {
    public List<String> invalidTransactions(String[] transactions) {     
        // map transaction name to all transactions with that name
        Map<String, List<String[]>> map = new HashMap<String, List<String[]>>(); 

        for (String currTransaction : transactions) {
            String[] splitTransaction = currTransaction.split(",");
            map.putIfAbsent(splitTransaction[0], new ArrayList<String[]>());    // add list for the name if it doesn't exist
            map.get(splitTransaction[0]).add(splitTransaction);     // add current transaction to appropriate list
        }

        List<String> result = new ArrayList<String>();

        // every loop checks if the currTransaction is invalid 
        for (String currTransaction : transactions) {
            String[] splitTransaction = currTransaction.split(",");
            
            if (Integer.parseInt(splitTransaction[2]) > 1000) {
                result.add(currTransaction);
            } 
            else {
                // iterate through all transactions with the same name, check if within 60 minutes and different city
                for (String[] curr : map.get(splitTransaction[0])) {
                    if (Math.abs(Integer.parseInt(splitTransaction[1]) - Integer.parseInt(curr[1])) <= 60 && !splitTransaction[3].equals(curr[3])) {
                        result.add(currTransaction);
                        break;
                    }
                }
            }
        }
        return result;
    }
}



// Approach 2 : Array

class Solution {
    public List<String> invalidTransactions(String[] transactions) {
        List<String> ans = new ArrayList<String>();
        int n = transactions.length;
        if (n == 0) return ans;
        String[] name = new String[n];
        int[] time = new int[n];
        int[] money = new int[n];
        String[] city = new String[n];
        boolean[] add = new boolean[n];
        for (int i = 0; i < n; i++) {
            String[] items = transactions[i].split(",");
            name[i] = items[0];
            time[i] = Integer.parseInt(items[1]);
            money[i] = Integer.parseInt(items[2]);
            city[i] = items[3];
        }
        
        for (int i = 0; i < n; i++) {
            if (money[i] > 1000)
                add[i] = true;
            for (int j = i + 1; j < n; j++) {
                if (name[i].equals(name[j]) && Math.abs(time[i] - time[j]) <= 60 && !city[i].equals(city[j])) {
                    add[i] = true;
                    add[j] = true;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            if (add[i])
                ans.add(transactions[i]);
        }
        return ans;
    }
}
