package com.company.solution.week05.bbahngju;

//410
//O(N)
// N is the longer of num1.length() or num2.length()
public class AddStrings {
    public String addStrings(String num1, String num2) {
        int idx = 0;
        int up = 0;
        int num1Int, num2Int;
        int num1Len = num1.length();
        int num2Len = num2.length();
        int temp = 0;

        String result = "";
        while(num1.length() > idx && num2.length() > idx) {
            num1Int = num1.charAt(num1Len-1-idx)-'0';
            num2Int = num2.charAt(num2Len-1-idx)-'0';
            temp = num1Int + num2Int + up;
            up = temp/10;
            result = temp%10 + result;
            idx++;
        }

        while(num1.length() > idx) {
            num1Int = num1.charAt(num1Len-1-idx)-'0';
            temp = num1Int + up;
            up = temp/10;
            result = temp%10 + result;
            idx++;
        }
        while(num2.length() > idx) {
            num2Int = num2.charAt(num2Len-1-idx)-'0';
            temp = num2Int + up;
            up = temp/10;
            result = temp%10 + result;
            idx++;
        }

        if(up != 0) return up+result;
        else return result;
    }


}
