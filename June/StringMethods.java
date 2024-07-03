class StringMethods
{
	public static void main(String[] args) 
	{
		String name1="karthik";
		String name2="kanchana";
		String name3="komal";
		String name4="";

		String convertedCaps=name1.toUpperCase();
		int length=name3.length();
		char singleCharacter=name1.charAt(2);
		String mergedNames=name1.concat(name2);
		String multipleChars=name2.substring(6,7);
		String singleChar=name3.substring(0,1);
		boolean emptyOrNot=name4.isEmpty();

		System.out.println(convertedCaps);
		System.out.println(length);
		System.out.println(singleCharacter);
		System.out.println(mergedNames);
		System.out.println(multipleChars);
		System.out.println(singleChar);
		System.out.println(emptyOrNot);

	}
}