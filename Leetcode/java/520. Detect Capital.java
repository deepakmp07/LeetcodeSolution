package com.deepak;
import java.util.Arrays;
=================================================================================================================
class Solution {
    public static boolean detectCapitalUse(String word) {
        boolean flag = false;
        if (word.length() == 1) {
            return true;
        } else if (word.length() == 2) {
            flag = true;
            if ((int) word.charAt(0) >= 97 && (int) word.charAt(0) <= 122) {
                if ((int) word.charAt(1) >= 65 && (int) word.charAt(1) <= 90) {
                    flag = false;
                }
            }
        } else if (word.length() == 3) {
            if ((int) word.charAt(0) >= 97 && (int) word.charAt(0) <= 122) {
                flag = true;
                if ((int) word.charAt(1) >= 97 && (int) word.charAt(1) <= 122) {
                    flag = true;
                    if ((int) word.charAt(2) >= 97 && (int) word.charAt(2) <= 122) {
                        flag = true;
                    } else
                        flag = false;
                } else
                    flag = false;
            }
                else if ((int) word.charAt(0) >= 65 && (int) word.charAt(0) <= 90) {
                    flag = true;
                    if ((int) word.charAt(1) >= 97 && (int) word.charAt(1) <= 122) {
                        flag = true;
                        if ((int) word.charAt(2) >= 97 && (int) word.charAt(2) <= 122)
                            flag = true;
                        else
                            flag = false;
                    }
                else if ((int) word.charAt(1) >= 65 && (int) word.charAt(1) <= 90) {
                    flag = true;
                        if ((int) word.charAt(2) >= 65 && (int) word.charAt(2) <= 90) {
                            flag = true;
                        } else
                            flag = false;
                }
//               
            } }else {
                if ((int) word.charAt(0) >= 65 && (int) word.charAt(0) <= 90) {
                    if ((int) word.charAt(1) >= 65 && (int) word.charAt(1) <= 90) {
                        for (int i = 2; i < word.length(); i++) {
                            if ((int) word.charAt(i) >= 65 && (int) word.charAt(i) <= 90) {
                                flag = true;
                            } else {
                                return false;
                            }
                        }
                    } else if ((int) word.charAt(1) >= 97 && (int) word.charAt(1) <= 122) {
                        for (int i = 1; i < word.length(); i++) {
                            if ((int) word.charAt(i) >= 97 && (int) word.charAt(i) <= 122) {
                                flag = true;
                            } else {
                                return  false;
                            }
                        }
                    }
                } else if ((int) word.charAt(0) >= 97 && (int) word.charAt(0) <= 122) {
                    for (int i = 2; i < word.length(); i++) {
                        if ((int) word.charAt(i) >= 97 && (int) word.charAt(i) <= 122) {
                            flag = true;
                        } else {
                            return false;
                        }
                    }
                }
            }
            return flag;
        }
=================================================================================================================
    public static void main(String args[]){
        String word = "QmO";
        System.out.print(detectCapitalUse(word));
    }
}
