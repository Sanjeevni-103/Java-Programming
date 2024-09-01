public class stringPalindromeCheck {
	static boolean stringChkPalindrome(String s) {
		boolean rlt=false;
		char rev;
		for(int i=s.length()-1;i>0;i--) {
			rev=s.charAt(i);
			
			for(int j=1;j<s.length()-1;j++) {
				
				if(rev==s.charAt(j))
				{
					rlt=true;
				}
				else
				{
					rlt=false;
				}
			}
		}
		return rlt;
	}
	

	public static void main(String[] args) {
		String value="kkjk";
		stringPalindromeCheck chk=new stringPalindromeCheck();
		boolean result= chk.stringChkPalindrome(value);
		if(result==true) {
		System.out.println("The following String: "+value+" is a palindrome!");}
		else
		{
			System.out.println("The following String: "+value+" is not a palindrome");
		}
	}
}