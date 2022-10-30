import java.util.*;
 class Restmenu{
      public static void main(String args[]){
        int n1;
        Scanner sc= new Scanner(System.in);
        System.out.println("Please select the menu :");
        System.out.println("1 biryani");
        System.out.println("2 quorma");
        System.out.println("3 pizza");
        System.out.println("4 Zinger ");
        System.out.println("5 coffee");
        n1= sc.nextInt();
        switch (n1) {
            case 1:{
                System.out.println("Rs : 200");
            }
            break;
            case 2:{
                System.out.println("Rs : 300");
            }
            break;
            case 3:{
                System.out.println("Rs : 500");
            }
            break;
            case 4:{
                System.out.println("Rs : 250");
            }
            break;
            case 5:{
                System.out.println("Rs : 120");
            break;
            }
            default:
            System.out.println("Sorry this item is not in our menu");
        }
      }
 }