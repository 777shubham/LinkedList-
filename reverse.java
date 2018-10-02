import java.util.*;
class node
{
	int data;
	node next;
	node(int num)
	{
		data=num;
	}
}
public class reverse
{
	node start;
	void insert(int num)
	{
		node temp=new node(num);
		if(start==null)
		{
			start=temp;
		}
		else
		{
			node ptr=start;
			while(ptr.next!=null)
			{
				ptr=ptr.next;
			}
			ptr.next=temp;
		}
	}
	
	
	
	void display()
	{
		node ptr=start;
		while(ptr!=null)
		{
			System.out.print(ptr.data+" ");
			ptr=ptr.next;
		}
	}
	
	
	void reverse()
	{
		node ptr=start;
		node pre=null;
		node next=null;
		while(ptr!=null)
		{
			next=ptr.next;
			ptr.next=pre;
			pre=ptr;
			ptr=next;
		}
		start=pre;
	}
	
	public static void main(String ars[])
	{
		
		Scanner s=new Scanner(System.in);
		reverse l=new reverse();
		System.out.println("Enter size of linked list");
		int n=s.nextInt();
		System.out.println("Enter number in linked list");
		for(int i=0;i<n;i++)
		{
			int num=s.nextInt();
			l.insert(num);
		}
		l.display();
		
		
		System.out.println("\nAfter reverse the linked List ");
		l.reverse();
		l.display();
		
	
		
	}
}