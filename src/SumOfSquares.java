import java.util.*;


public class SumOfSquares {
	public static ArrayList<ArrayList<Integer>> returnPairs(int x)
	{
		ArrayList<ArrayList<Integer>> ans=new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> pairs=new ArrayList<Integer>();
		HashSet<Integer> st=new HashSet<Integer>();
		for(int i =0;i<6;i++)
		{
			double k=Math.sqrt(x-(i*i));
			int z=-1;
			if(k%(int)k==0 || k==0.0){
				
				 z=(int)k;
			}
			if(z!=-1 && st.contains(z))
			{
				pairs.add(i);
				pairs.add(z);
				ans.add(pairs);
			}
			else
				st.add(i);
			if(pairs.size()!=0)
				pairs=new ArrayList<Integer>();
		}
		return ans;
		

	}
	public static void main(String args[])
	{
		int x=11;
		System.out.println(returnPairs(x));
		
	}
}
