class Solution {
    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for (String str : strs) {
            sb.append(str.length()).append("#").append(str);
        }

        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> decoded = new ArrayList<>();
        int i = 0;
        
        while (i < str.length()) {
            int delimiterPos = str.indexOf('#', i);
            int length = Integer.parseInt(str.substring(i, delimiterPos));
            
            i = delimiterPos + 1;
            
            String originalStr = str.substring(i, i + length);
            decoded.add(originalStr);
            
            i += length;
        }
        return decoded;
    }
}
