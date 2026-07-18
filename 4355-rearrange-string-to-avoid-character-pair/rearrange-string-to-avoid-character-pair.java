class Solution {
    public String rearrangeString(String s, char x, char y) {
        int[] count = new int[26];
        for (int i =0; i<s.length(); i++){
            count[s.charAt(i) - 'a'] ++;
        }
        StringBuilder sb = new StringBuilder();
        int yCount = count[y - 'a'];
        for (int i =0; i<yCount; i++){
            sb.append(y);
        }
        count[y - 'a'] = 0;
        int xIdx = x - 'a';
        for(int i =0; i< 26; i++){
            if(i!= xIdx){
                for(int j =0; j<count[i]; j++){
                    sb.append((char)(i + 'a'));
                }
            }
        }
        int xCount = count[xIdx];
        for(int i =0; i<xCount; i++){
            sb.append(x);
        }
        return sb.toString();
    }
}