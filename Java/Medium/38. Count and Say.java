class Solution {
    public String countAndSay(int n) {
        String s = "1";
        for (int i = 1; i < n; i++){
            s = count(s);
        }
        return s;
    }
    public String count(String s) {      
		StringBuilder res = new StringBuilder(); 
		int i = 0;

		while (i < s.length()) {
			int count = 0;
			char temp = s.charAt(i);
			while (i < s.length() && s.charAt(i) == temp) {
				count++;
				i++;
			}
      res.append(count).append(temp);
		}
		return res.toString();
	}
}
