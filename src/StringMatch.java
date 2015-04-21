
public class StringMatch {
	

	public static boolean match(String input1, String input2) {
		if(input1.length() == 0 && input2.length() == 0)
			return true;
		if(input2.length() == 0 && input1.charAt(0)!='*')
			return false;
		if(input1.length() ==0 && input2.length()!=0)
			return false;
		if (input1.charAt(0) == '*' && input1.length() != 1  && input2.length() == 0)
			return false;
		if(input1.charAt(0) == '*' && input1.length() ==1  && input2.length() == 0)
			return true;
		else if(input1.charAt(0) == '?'|| input1.charAt(0)==input2.charAt(0))
			return match(input1.substring(1),input2.substring(1));
		else if(input1.charAt(0) == '*'){
			return match(input1,input2.substring(1)) || match(input1.substring(1),input2.substring(0));
		}
		else if(input1.charAt(0) != input2.charAt(0))
			return false;
		return false;
	}
	
	
	public static void main(String args[])
	{
		String p="p*t*";
		String t="pattern";
		System.out.println(match(p,t));

	}
}
