import java.util.*;
public class maxsumkadansalgo {
    public static void main(String[] args) {
        int arr[]={-2,-3,4,-1,-2,1,5,-3};
        maxsum(arr);
    }
    public static void maxsum(int arr[]){
        int ms=Integer.MIN_VALUE;
        int currsum=0;
        for(int i=0;i<arr.length;i++){
            
                currsum=currsum+arr[i];
                if(currsum<0){
                    currsum=0;
                }
                ms=Math.max(currsum,ms);
            }
            System.out.println("max :" +  ms);
        }
    }
