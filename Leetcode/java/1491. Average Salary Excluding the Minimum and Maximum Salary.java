class Solution {
    public double average(int[] salary) {
        double max = Integer.MAX_VALUE;
        double min = Integer.MIN_VALUE;
        double sum = 0;
        int i = 0;
for(;i<salary.length;i++){
    sum = sum+salary[i];
    if(max>salary[i])
    max = salary[i];
    if(min<salary[i])
    min = salary[i];  
    }
System.out.print(max+" "+min+" "+sum );
return ((sum-min-max)/(i-2));
    }
}