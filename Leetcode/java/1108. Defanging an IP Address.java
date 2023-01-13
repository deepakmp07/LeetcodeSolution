package com.deepak;
import java.util.*;
=================================================================================================================
    class Solution {
        public static String defangIPaddr(String address) {
          String result = address.replace(".","[.]");
          return result;
        }
=================================================================================================================
        public static void main(String args[]){
            String ransomNote = "aa";
            String magazine = "ab";
            System.out.print(defangIPaddr("1.1.1"));
        }
    }


