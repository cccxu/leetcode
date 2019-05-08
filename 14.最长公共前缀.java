/*
 * @lc app=leetcode.cn id=14 lang=java
 *
 * [14] 最长公共前缀
 */
class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0){
            return "";
        }
        String base = strs[0];
        int lengthOfSame = 0;
        for (String s : strs){
            int length = 0;
            if(base.length() <= s.length()){
                length = base.length();
            } else {
                length = s.length();
            }
            for (int i = 0; i < length; i++){
                if(base.charAt(i) == s.charAt(i)){
                    lengthOfSame++;
                } else {
                    break;
                }
            }
            if(lengthOfSame==0){
                return "";
            }
            base = base.substring(0, lengthOfSame);
            lengthOfSame = 0;
    }
        return base;
    }
}

