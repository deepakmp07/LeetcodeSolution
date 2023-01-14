package com.deepak;
import java.util.*;
=================================================================================================================
    class Solution {
        public static boolean canConstruct(String ransomNote, String magazine) {
            int ptrlen = magazine.length();
            int strlen = ransomNote.length();
            String alt = "";
            boolean found = false;
            for(int i=0;i<ransomNote.length();i++){
                for(int j=0;j<magazine.length();j++){
                    if(magazine.charAt(j) == ransomNote.charAt(i)){
                        magazine = magazine.substring(0,j)+magazine.substring(j+1);
                        found = true;
                        break ;
                        }
                    }
                if(!found){
                    return false;
                }
                found = false;
            }
            return true;
        }
=================================================================================================================
        public static void main(String args[]){
            String ransomNote = "aa";
            String magazine = "ab";
            System.out.print(canConstruct(ransomNote, magazine));
        }
    }
