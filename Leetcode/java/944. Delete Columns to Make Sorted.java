package com.deepak;
import java.util.Arrays;
=================================================================================================================
class Solution {
    public static int minDeletionSize(String[] strs) {
        boolean flag = false;
        int value = 0;
        for (int i = 0; i < strs[0].length(); i++) {
            for (int j = 0; j < strs.length; j++) {
                for (int k = j; k < strs.length; k++) {
                    if ((strs[j].charAt(i) + "").compareTo(strs[k].charAt(i) + "") <= 0) {
                    } else {
                       flag = true;
                    }
                }
            }
                if (flag) {
                    value++;
                }
                flag = false;
        }
            return value;
    }
=================================================================================================================
    public static void main(String args[]){
        String strs[] = new String[] {"zyx","wvu","tsr"};
        System.out.print(minDeletionSize(strs));
    }
}
