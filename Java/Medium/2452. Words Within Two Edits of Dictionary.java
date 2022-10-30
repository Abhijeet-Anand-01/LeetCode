class Solution {
    public List<String> twoEditWords(String[] queries, String[] dictionary) {
        int len = queries.length;
        List<String> list = new ArrayList<>();
        
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < dictionary.length; j++) {
                int count = 0;
                for(int k = 0; k < Math.min(dictionary[j].length(), queries[i].length()); k++)
                {
                    if(dictionary[j].charAt(k) != queries[i].charAt(k))
                        count++;
                }
                if(count <= 2)
                {
                    list.add(queries[i]);
                    break;
                }
            }
        }
        return list;
    }
}
