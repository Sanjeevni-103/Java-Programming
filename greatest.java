//Write a java program to find the greatest among 3 numbers

class greatest{
    public static void main(String args[]){
       int a,b,c;
       a=56;
       b=98;
       c=15;
       if(a>=b & a>=c){
           System.out.println("greatest number is" +a);
       }
       else if(b>=a & b>=c){
           System.out.println("greatest number is" +b);
       }
       else{
           System.out.println("greatest number is" +c);
       }
    }
}