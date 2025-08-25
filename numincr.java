import java.util.*;
public class numincr {
    


    public static void main(String[] args) {
        int n=5;
        System.out.print(numbers(n));
    }
    public static int numbers(int n){
        if(n==0){
            return 1;
        }
       int  fact=numbers(n-1);
       int fn = n*fact;
        return fn;
        
        
    }
}

