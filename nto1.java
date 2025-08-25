import java.util.*;

public class nto1 {
    public static void main(String[] args) {
        int n=10;
        numbers(n);
    }
    public static void numbers(int n){
        if(n==1){
            System.out.println(1);
            return;
        }
        System.out.println(n +" ");
        numbers(n-1);
    }
}
