import java.util.*;
import java.lang.*;
import java.io.*;


class Node
{
	
    int data;
    Node next;

    public Node(int data)
    {
        this.data=data;
    }
    void display()
    {
	   System.out.println("value"+data);
    }
}
class Linklist
{
	Node head= null;
	void insertat( int x)
    {
        Node newnode = new Node(x);
        newnode.next=head;
        head=newnode;
    }

    void displaylist()
    {
        Node current =head;
        while(current!= null)
        {
            current.display();
            current=current.next;
        }
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		
        Linklist l1 = new Linklist();
        l1.insertat(5);
        l1.displaylist();
	}
}
