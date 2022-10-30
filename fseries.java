import java.util.*;
class fseries{
    public static void main(String arg[]) {
        int n = 100;
        int a = 0;
        int b = 1;
        System.out.println("Fibonacci Series upto"+n+":");
        while (a <= n){
            System.out.println(a+",");
            int c = a + b;
            a = b;
            b = c;

        }
    }
}