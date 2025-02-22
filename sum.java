//Write a java program to find the sum of digists of a number

class sum{
    public static void main(String args[]){
         int n=103;
         int sum=0;
         while(n>0){
              int temp = n%10;
              sum=sum+temp;
              n=n/10;
         }
         System.out.println("sum of the digits of the number is: " +sum);
    }
}