import java.util.*;
class SentenceToWord
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Sentence : ");

		String sen= sc.nextLine();

		int cnt=1;
		int i=0;
		for (; ;) 
		{
			String word="";
			for (;i<sen.length();i++) 
			{
				char ch = sen.charAt(i);
				if (ch==' ') 
				{
					i=i+1;
					cnt++;
					break;	
				}
				word +=ch;
			}
			if(i==sen.length())
				break;
		}
		String [] words=stringToStringArray(cnt,sen);
		System.out.println(Arrays.toString(words));
	}
	public static String[] stringToStringArray(int cnt ,String sen)
	{
		String [] words=new String[cnt];
		int indx=0;
		int i=0;
		for (; ;) 
		{
			String word="";
			for (;i<sen.length();i++) 
			{
				char ch=sen.charAt(i);
				if(ch==' ')
				{
					i=i+1;
					break;
				}
				word +=ch;
			}
			words[indx++]=word;
			if(i==sen.length())
				break;
		}
		return words;
	}	
}