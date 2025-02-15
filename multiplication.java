//Write a java program to take a number from user and print its multiplication table
import java.util.Scanner;
class multiplication{
    public static void main (String args[]){
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter the number:");
          int n = sc.nextInt();
          int i;
          System.out.println("multiplication table of " +n+ " is : ");
          for(i=1; i<=10; i++){
              int mul = n*i;
              System.out.println(n + "*" + i +" = " + mul);
          }
    }
}