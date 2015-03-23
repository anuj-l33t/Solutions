// Returns the longest substring of non repeated characters
import java.util.*;
public class LongestSubstring {
	 public static String lengthOfLongestSubstring(String word) {
		 String ans="";
		 //List<Character> st=new LinkedList<Character>();
		 Set<Character> st=new LinkedHashSet<Character>();
		   String longestSoFar ="";
           int count = 0;
           int longestSize=0;
           for(int i=0;i<word.length();i++)
           {
        	   char c=word.charAt(i);
        	   if(!st.contains(c))
        	   {
        		   st.add(c);
        		   count++;
        	   }
        	   else
        	   {
        		   if(count>longestSize)
        		   {
        			   longestSize=count;
        			   longestSoFar=getString(st);
        			  
        		   }
        		   count=0;
        		   st.clear();
        		   i--;
        	   }
           }
           if(longestSoFar.isEmpty())//If the input string had all unique chars
        	   longestSoFar=getString(st);
         System.out.println(longestSoFar);
		 return ans;
				 
	 }
	 public static String getString(Set<Character> st){
		 StringBuffer sb=new StringBuffer();
		 for(Character c: st)
			 sb.append(c);
		 
		 return sb.toString();
	 }

	 public static void main(String args[])
	 {
		String s="dasf";
		 System.out.println(s.length());
		 System.out.println(lengthOfLongestSubstring(s));
	 }

}
