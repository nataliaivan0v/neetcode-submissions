class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for (String str : strs) {
            sb.append(str);
            sb.append("ñ");
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> strs = new ArrayList<String>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != 'ñ') {
                sb.append(str.charAt(i));
            } else {
                strs.add(sb.toString());
                sb = new StringBuilder();
            }
        }
        return strs;
    }
}
