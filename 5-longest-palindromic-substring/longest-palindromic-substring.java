class Solution {
    public String longestPalindrome(String s) {
        int resLen = 0;
        String res = "";
        for(int i = 0; i < s.length(); i++){
            int start = i;
            int end = i;
            while(start >= 0 && end < s.length() && s.charAt(start) == s.charAt(end)){
                if((end - start +1) > resLen){
                    res = s.substring(start,end + 1);
                    resLen = end - start + 1;
                }
                start--;
                end++;
            }
            start = i;
            end = i + 1;
            while(start >= 0 && end < s.length() && s.charAt(start) == s.charAt(end)){
                if((end - start +1) > resLen){
                    res = s.substring(start,end + 1);
                    resLen = end - start + 1;
                }
                start--;
                end++;
            }
        }
        return res;
    }
}