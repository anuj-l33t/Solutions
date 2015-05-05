package src;

import java.util.ArrayList;
import java.util.Collections;

/*
 * Given a Stream of numbers as input decode them into Strings such that 1->A, 2->B.. and so on
 * if the input is something like 12 The answer will have [AB,L] and for something like 
 * 123 [ABC,L,W]
 * */
public class DecodeNumbersToString {

	public static char decode(int n) {
		return (char) (n - 1 + 'A');
	}

	public static ArrayList<String> intToString(String s) {
		ArrayList<String> ans = new ArrayList<String>();
		if (s == "0" || s.length() == 0)
			return ans;
		StringBuffer ip = new StringBuffer();
		StringBuffer sb = new StringBuffer();
		for (int i = 1; i <= s.length(); i++) {
			String cur = s.substring(i - 1, i);
			if (!cur.equals("0"))
				ip.append(decode(Integer.parseInt(cur)));
			sb.append(cur);
			if (sb.length() == 2) {
				int z = Integer.parseInt(sb.toString());
				if (z < 26) {
					char c = decode(z);
					ans.add(c + "");
				}
				sb.replace(0, 1, "");
			}

		}
		ans.add(ip.toString());
		Collections.sort(ans);// If lexicographic sorting of strings is required
		return ans;
	}

	public static void main(String args[]) {
		String input = "123";
		System.out.println(intToString(input));
	}
}
