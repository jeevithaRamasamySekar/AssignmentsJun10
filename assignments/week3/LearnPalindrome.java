package assignments.week3;

public class LearnPalindrome {

	public static void main(String[] args) 
	{
		String s="race a car";
        //String s="A man, a plan, a canal: Panama ";
		//String s="";
boolean flag=false;

//string to lowercase;
System.out.println(s.toLowerCase());

//removing alphanumeric and getting reverse string

String newstring=s.replaceAll("[^a-z A-Z]", "");
System.out.println(newstring);
int len=newstring.length();
String reverse="";

for(int i=len-1 ;i>=0;i--)
{
	//char c=newstring.charAt(i);
	if(newstring.charAt(i)!=' ')
	reverse=reverse+newstring.charAt(i);
}//comparing
System.out.println(reverse);
if(reverse.equalsIgnoreCase(newstring))
{
	flag=true;
	System.out.println("Palindrome"+flag);
}
else
{
System.out.println("Not Palindrome"+flag);

}	}

}
