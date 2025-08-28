import java.util.*;
public class maxSumBruteApproach {
    public static void main(String args[]){
        int nums[]={1, -2,6, -1,3};
        subarraysum(nums);
    }
    public static void subarraysum(int nums[]){
        
        int maxsum=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            for(int j=i;j<nums.length;j++){
                int sum=0;
                for(int k=i;k<=j;k++){
                    
                    sum=sum+nums[k];
                    if(sum>maxsum){
                        maxsum=sum;
                    }
                    
                }
            }
        }
        System.out.print(maxsum);
    }

}
