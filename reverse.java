//Write a java program to reverse a number

class reverse{
    public static void main(String args[]){
         int n=103,lastDigit;
         int reverse=0;
         while(n>0){
         lastDigit=n%10;
         reverse=reverse*10+lastDigit;
         n=n/10;
         }
         System.out.println("reverse of the number is: "+reverse);
    }
}