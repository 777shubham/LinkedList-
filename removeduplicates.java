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
public class removeduplicates
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
	
	void remove_dup()
	{
		node ptr=start;
		//node preptr;
		while(ptr!=null&&ptr.next!=null)
		{
			
			if(ptr.data==ptr.next.data)
				{
					ptr.next=ptr.next.next;
				}
			else	
			ptr=ptr.next;	
		}
		
	}
	
	public static void main(String ars[])
	{
		
		Scanner s=new Scanner(System.in);
		removeduplicates l=new removeduplicates();
		System.out.println("Enter n for size of linked list");
		int n=s.nextInt();
		System.out.println("Enter number in linked list in sorted order");
		for(int i=0;i<n;i++)
		{
			int num=s.nextInt();
			l.insert(num);
		}
		l.display();
		
		System.out.println("After removing duplicates");
		l.remove_dup();
		l.display();
		
		
	}
}