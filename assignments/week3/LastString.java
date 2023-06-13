package assignments.week3;

public class LastString {

	public static void main(String[] args) 
	{
//Testcase 1:
     String s1="Hello World";
     String[] split = s1.split(" ");
     int len=split.length;
     System.out.println("Length of the last word is"+split[len-1].length());

	
	//Testcase 2:
    String s2="   fly me   to   the moon  ";
    String[] split1 = s2.split(" ");
    int len1=split1.length;
    System.out.println("Length of the last word is"+split1[len1-1].length());
    
  //Testcase 3:
    String s3="luffy is still joyboy";
    String[] split2 = s3.split(" ");
    int len2=split2.length;
    System.out.println("Length of the last word is"+split2[len2-1].length());


	}
}
