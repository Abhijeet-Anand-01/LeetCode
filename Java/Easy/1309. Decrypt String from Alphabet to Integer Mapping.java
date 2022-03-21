class Solution {
    public String freqAlphabets(String s) {
        StringBuilder sb = new StringBuilder();
		int size = s.length();
		for (int i = 0; i < size; i++) {
			if (i + 2 < size && s.charAt(i + 2) == '#') {
				sb.append((char) (Integer.parseInt(s.substring(i, i + 2)) + 'a' - 1));
				i = i + 2;
			} else
				sb.append((char) (Integer.parseInt(String.valueOf(s.charAt(i))) + 'a' - 1));
		}
		return sb.toString();
    }
}
