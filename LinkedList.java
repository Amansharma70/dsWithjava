import java.util.*;
public class LinkedList {
	//Create the node Class------------------------------------------
	public class Node{
		int data;
		Node next;
		public Node(int data)
		{
			this.data=data;
		}
		
	}
	Node head;
	Node tail;
	int size;
	// Insert the elements in a linkedlist  in a starting-------------------------- 
	public void firstAdd(int item)
	{
		System.out.println("insert the elemnts in a Staring--------");
		Node nm=new Node(item);
		if(this.size==0)
		{
		this.head=nm;
		this.tail=nm;
		this.size++;
		}
		else
		{
			nm.next=this.head;
			this.head=nm;
			this.size++;
		}
	}
	//Insert the elements in a linkedlist  in a Last-------------------------- 
	public void addLast(int item)
	{
		System.out.println("Insert the elements in a linkedlist  in a Last-------------------------- ");
		if(this.size==0)
		{
			firstAdd(item);
		}
		else {
			Node nn=new Node(item);
			tail.next=nn;
			tail=nn;
			this.size++;
		}
	}
	// insert the elements in a linkedlist at the specific positions--------------------------------------------------------
	 public void inserAtPosition(int item,int k) throws Exception
	    {
		 System.out.println(" insert the elements in a linkedlist at the specific positions--------------------------------");
	    	if(k<0 || k>size)
	    	{
	    		throw new Exception(" You can't insert the elements please provide the valid index");
	    	}
	    	if(k==0)
	    	{
	    		firstAdd(item);
	    	}
	    	else if(k==size-1)
	    	{
	    		addLast(item);
	    	}
	    	else
	    	{
	    		Node nn=new Node(item);
	    		Node kth=getNode(k-1);
	    		nn.next=kth.next;
	    		kth.next=nn;
	    		this.size++;
	    		
	    	}
	    }
	//get the First elements   From the  linkedlist ----------------------------------
	public int getFirst() throws Exception
	{
		 System.out.println(" get the First elements   From the  linkedlist ---------------");
		if(head==null)
		{
			throw new Exception(" pls provide the valid the index---------");
		}
		return head.data;
		
	}
	//get the last ---elements  From the  linkedlist ----------------------------------
	public int getLast() throws Exception
	{

		 System.out.println(" get the last ---elements  From the  linkedlist -----------------");
		
		if(head==null)
		{
			throw new Exception(" pls provide the valid the index---------");
		}
		return tail.data;
		
	}
	//get the ---elements  From the specific position ----------------------------------
	
	
	public int getIndex(int k) throws Exception
	{ System.out.println("get the ---elements  From the specific position ------------------");
		
		return getNode(k).data;
	}
	public Node getNode(int k) throws Exception
	{
		if(k<0 || k>=size)
		{
			throw new Exception(" pls provide the valid the index---------");
		}
		Node temp=head;
		for(int i=1;i<=k;i++)
		{
			temp=temp.next;
		}
		return temp;
	}
	//Remove the elements  From the  starting----------------------------------
	
    public int removeFirst()
    { 
    	System.out.println("Remove the elements  From the  starting-----------");
    	Node temp=head;
    	head=head.next;
    	temp.next=null;
    	this.size--;
    	return head.data;
    	
    }
  //Remove the last   elements  From the  linkedlist ----------------------------------
    public int removeLast() throws Exception
    {
    	System.out.println("Remove the last   elements  From the  linkedlist ------------------");
    	if(this.size==1)
    	{
    		int t= removeFirst();
    		return t;
    	} 
    	Node temp=getNode(this.size-2);
    	int rv=tail.data;
    	tail=temp;
    	tail.next=null;
    	return rv;
    	
    }
  //Remove   the  elements  From the  Specific Position ----------------------------------
    public int specificPosition(int k) throws Exception
    {
    	System.out.println("/Remove   the  elements  From the  Specific Position -");
    	if(k<0 || k>=size)
    	{
    		throw new Exception(" You can't remove the elements pls insert the valid index-----");
    	}
    	if(k==0)
    	{
    		return removeFirst();
    	}
    	else if(k==size-1)
    	{
    		return removeLast();
    	}
    	
    		Node kth=getNode(k);
    		Node kth_1=getNode(k-1);
    		kth_1=kth.next;
    		kth.next=null;
    		this.size--;
    		return kth.data;
    		
    	
    }
   
	public void Display() throws Exception
	{ 
		System.out.println("Display the linkedList------");
		Node temp=head;

	if(head==null)
	{
		throw new Exception("LinkedList is a Blank------");
	}
	else {
		while(temp.next!=null)
		{
			System.out.print(temp.data+"-->");
			temp=temp.next;
			
		}
		System.out.println(temp.data);
	}

}
}
