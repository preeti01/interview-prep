import java.util.*;
import java.lang.*;
import java.io.*;

class node
{
	int data;
	node left;
	node right;
	public node(int d)
	{
		this.data=d;
		this.left=null;
		this.right=null;
	}
}

class BinarySearchTree
{
    public node insert(node root,int d)
    {
    	node n = new node(d);
    	if(root==null)
    	{
    		root=n;
    		return root;
    	}
    	else
    	{
    		if(d<=root.data)
    		{
    			root.left=insert(root.left,d);
    		}
    		else
    		{
    			root.right=insert(root.right,d);
    		}
    		return root;
    	
    	}
    }
    
    public boolean isbalanced(node root)
    {
        if(root==null || (root.left==null && root.right==null) )
        return true;
    
        node current=root;
        int heightdiff=getheight(root.left)-getheight(root.right);
        if(Math.abs(heightdiff)>1)
        {
            return false;
        }
        else
        {
            return true;
        }
    }

    public int getheight(node root)
    {
        if(root==null)
        return 0;
        else
        {
            int height=	Math.max(getheight(root.left),getheight(root.right))+1;
            return height;
        }
    }

   public boolean checkbst(node n)
   {
        return checkbst(n,Integer.MIN_VALUE,Integer.MAX_VALUE);
   }
                                
   public boolean checkbst(node n, int min,int max)
   {
        if(n==null)
        return true;
    
        if(n.data<min || n.data>max)
        return false;
    
        if(!checkbst(n.left,min,n.data)|| !checkbst(n.right,n.data,max))
        return false;
    
        return true;
    }
    
    public node createbst(int[] array)
    {
	   return createbst(array,0,array.length-1);
    }
    
   public node createbst(int[] array, int start, int end)
   {
	   if(end>start)
		   return null;
	   
	   int mid = (start+end)/2;
	   System.out.println(mid);
	   node n = new node(array[mid]);
	   n.left=createbst(array,start,mid-1);
	   n.right=createbst(array,mid+1,end);
	   return n;
   }
   
    public void inorder(node root)
    {
    	if(root!=null)
    	{
    		inorder(root.left);
    		System.out.println(root.data);
    		inorder(root.right);
    	}
    }
}

class BST
{
	public static void main (String[] args) throws java.lang.Exception
	{
	   
	   tree t1= new tree();
	   
	   root=t.insert(root,5);
	   root=t.insert(root,4);
	   root=t.insert(root,8);
       root=t.insert(root,2);
       root=t.insert(root,1);
       root=t.insert(root,7);
	   t.inorder(root);
	   boolean b= t.isbalanced(root);
	   System.out.println(b);
	   boolean s=t.checkbst(root);
	   System.out.println(s);
	   int[] array={3,4,5,6,7};
	   node root1=null;
	   root1=t1.createbst(array);
	   t1.inorder(root1);
	}
}
