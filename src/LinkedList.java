
public class LinkedList {
	public static Link add(Link root,int i)
	{
		if(root==null)
		{
			root=new Link(i);
			return root;
		}
		else
		{
			Link t=root;
			while(t.next!=null)
			{
				t=t.next;
			}
			t.next=new Link(i);
			return root;
		}
		
	}
	public static void print (Link root)
	{
		if(root==null)
			System.out.println("Root is empty");
		else
		{
			Link t=root;
			while(t!=null)
			{
				System.out.print(t.v+"  ");
				t=t.next;
			}
		}
	}
	public static void main(String args[])
	{
		int a[]={1,2,3,4,5};
		Link root=null;
		for(int i=0;i<a.length;i++)
		root=add(root,a[i]);
		print(root);
	}
}
