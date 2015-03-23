// Returns the longest substring of non repeated characters

public class LongestSubstring {
	 public static String lengthOfLongestSubstring(String word) {

		    int start = 0;

		    int end = 0;

		    int maxStart = 0;

		    int maxEnd = 0;

		    int[] seen = new int[256];

		    for (int i = 0; i < 256; i++) {

		        seen[i] = -1;

		    }

		    for (int i = 0; i < word.length(); i++) {

		        char c = word.charAt(i);

		        if (seen[c] != -1 && seen[c] >= start) {

		            start = seen[c] + 1;

		        }

		        end++;
	
		        seen[c] = i;

		        if (end - start > maxEnd - maxStart) {

		            maxEnd = end;

		            maxStart = start;

		        }

		    }

		   return word.substring(maxStart, maxEnd);// for actual substring

		    //return maxEnd - maxStart; 


		    }
	 
	 public static void main(String args[])
	 {
		String s="lalamamakaka";
		 System.out.println(s.length());
		 System.out.println(lengthOfLongestSubstring(s));
	 }

}
