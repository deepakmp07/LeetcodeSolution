package com.deepak;
import java.util.*;
=================================================================================================================
class Solution {
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
            List<Boolean> ls = new ArrayList<Boolean>();
            int max=candies[0];
            for(int i=1;i<candies.length;i++){
                if(max<candies[i]){
                    max=candies[i];
                }
            }
            for(int i=0;i<candies.length;i++){
                if(candies[i]+extraCandies>=max){
                    ls.add(true);
                }
                else{
                    ls.add(false);
                }
            }
            return ls;
    }
=================================================================================================================
        public static void main(String args[]){
        int[] candies = new int[]{2,3,5,1,3};
        int extraCandies = 3;
        System.out.print(kidsWithCandies(candies,extraCandies));
        }
    }
