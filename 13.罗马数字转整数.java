/*
 * @lc app=leetcode.cn id=13 lang=java
 *
 * [13] 罗马数字转整数
 */
class Solution {
    public int romanToInt(String s) {
        int sum = 0;
        int current = 0;
        int pre = 0;
        for(int i = s.length() - 1; i >= 0; i--){
            pre = current;
            current = getValue(String.valueOf(s.charAt(i)));
            if(pre > current){
                sum = sum - current;
            } else {
                sum = sum + current;
            }
        }
        return sum;
    }

    private int getValue(String s) {
        switch(s) {
            case "I" : return 1;
            case "V" : return 5;
            case "X" : return 10;
            case "L" : return 50;
            case "C" : return 100;
            case "D" : return 500;
            case "M" : return 1000;
            default: return 0;
        }
    }
}

