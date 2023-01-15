package com.deepak;
import java.util.Arrays;
=================================================================================================================
public class Solution {
    public static boolean wordPattern(String pattern, String s) {
        String res1[] = new String[pattern.length()];
        int resp[] = new int[pattern.length()];
        String[] res2 = s.split(" ");
        
        int ress[] = new int[res2.length];
        for (int i = 0; i < pattern.length(); i++) {
            resp[i] = 0;
            res1[i] = pattern.charAt(i)+"";
        }
        for (int i = 0; i < res2.length; i++) {
            ress[i]=0;
        }
        int id = 1;
        for (int i = 0; i < res2.length; i++) {
            for (int j = 0; j < res2.length; j++) {
               
                if (ress[j] == 0) {
                    if (res2[i].equals(res2[j])) {
                        ress[j] = id;
                      
                    }
                }
            }
            id++;
            for(int k=0;k<pattern.length();k++){
            }
        }
        id=1;
        for (int i = 0; i < res1.length; i++) {
            for (int j = 0; j < res1.length; j++) {
                
                if (resp[j] == 0) {
                    if (res1[i].equals(res1[j])){
                        resp[j] = id;
                       
                    }
                }
            }
            id++;
        }
             for(int i=0;i<pattern.length();i++){
                System.out.print(resp[i]);
             }
         System.out.println();

        for(int i=0;i<res2.length;i++){
            System.out.print(ress[i]);
        }
       System.out.println();

        if(Arrays.equals(ress, resp)){
                 return true;
             }
        else {
                 return false;
             }
    }
=================================================================================================================
    public static void main(String args[]){
        String pattern = "abba";
        String s = "dog cat cat dog";
        System.out.print(wordPattern(pattern,s));
    }
}
