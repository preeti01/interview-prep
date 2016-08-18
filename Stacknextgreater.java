import java.util.*;
public class Stacknextgreater 
{

	public void nextgreater(int[] a)
	{
		int i=0;
		int len=a.length;
		int next;

		Stack<Integer> st= new Stack<Integer>();
		st.push(a[i]);
		for(i=1;i<len;i++)
		{
		     next=a[i];
		     if(next<st.peek())
		     {
		    	 st.push(next);
		    	 continue;
		     }
		     else
		     {
		    	 while(!st.isEmpty())
		    	 {
		    	    System.out.println(next);
		    	    st.pop();
		    	 }
		    	 st.push(next);
		     }
		  
		  }
		
		          
	     while(!st.isEmpty())
		 {
             next=-1;
             System.out.println(next);
             st.pop();
		 }
	
	  }
	
	  public static void main(String[] args) 
	  {
			
        Scanner in = new Scanner(System.in);
		System.out.println("enter size of array");
		int n= in.nextInt();
		int[] a= new int[5];
		System.out.println("enter array elements:");
        for(int i=0;i<n;i++)
		{
		  a[i]=in.nextInt();
		}
	 
		Stacknextgreater e=new ();
		e.nextgreater(a);

	   }
}
