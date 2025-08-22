import java.util.*;
public class maxsumprefixapproach{
    public static void main(String args[]){
        int nums[]={1, -2,6, -1,3};
        subarraysum(nums);
    }
    public static void subarraysum(int nums[]){
        int prefix[]= new int[nums.length];
        int maxsum=Integer.MIN_VALUE;
        prefix[0]=nums[0];
        for(int i=1;i<prefix.length;i++){
            prefix[i] = prefix[i-1] + nums[i];
        }
        int sum=0;
        for(int i=0;i<nums.length;i++){
             int start=i;
            for(int j=i;j<nums.length;j++){
                int end=j;
                sum=start==0? prefix[end] : prefix[end] -prefix[start-1];
                if (maxsum<sum){
                    maxsum= sum;
                }


            }
        }
        System.out.print(maxsum);
    }

}