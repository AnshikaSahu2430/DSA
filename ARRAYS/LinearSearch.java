import java.util.*;
public class LinearSearch {

    public static void main(String args[]){
        int nums[]={4,5,1,6,2,3};
        Scanner sc =new Scanner(System.in);
        System.out.println("enter your key :");
        int key=sc.nextInt();
        int result=Search(nums, key);
        System.out.println(result);
    }
    public static int Search(int nums[],int key){
        for(int i=0;i<nums.length;i++){
            if(nums[i] == key){
                return i;
            }
        }
        return -1;
    }
}