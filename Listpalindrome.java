class node
{
    int data;
    public node next;
    public node(int data)
    {
        this.data=data;
    }
}



class Listpalindrome
{
	node head=null;
    void insert(node head,int x)
    {
        node newnode =new node(x);
        newnode.next=head;
        head=newnode;
    }

    void display(node n)
    {
        node current=n;
        while(current!=null)
        {
            System.out.println("value:"+current.data);
            current=current.next;
        }
    }

    public boolean ispalindrome(node head)
    {
        node slow=null;
        node fast=null;
        Stack<Integer> stack= new Stack<Integer>();
        while(fast!=null && fast.next!=null)
        {
            stack.push(slow.data);
            slow=slow.next;
            fast=fast.next;
        }
        
        if(fast!=null)
            slow=slow.next;
            
        while(slow!=null)
        {
            int top=stack.pop().intValue();
            if(top!=slow.data)
            return false;
            else
                slow=slow.next;
        }
        return true;
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		boolean b;
        Listpalindrome l =new Listpalindrome();
        node head=null;
        l.insert(head,0);
        l.insert(head,1);
        l.insert(head,2);
        l.insert(head,1);
        l.insert(head,0);
        b=l.ispalindrome(head);
        System.out.println("result:"+b);
	}
}
