import java.util.*;
class calculation{
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        int n1,n2 = 0;
        char operator;
        double answer = 0.0;
        System.out.println("Enter first number:");
        n1 = sc.nextInt();
        System.out.println("Enter second number:");
        n2 = sc.nextInt();
        System.out.println("which operation ?");
        operator = sc.next().charAt(0);
        switch (operator) {
            case '+': answer = n1 + n2;
                break;
            case '-': answer = n1 - n2;
                break;
            case '*': answer = n1 * n2;
                break;
            case '/': answer = n1 / n2;
                break;    
        } 
        System.out.println(n1+" "+operator+" "+n2+" = "+answer);
    }
}