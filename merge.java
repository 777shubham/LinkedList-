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
public class merge
{

node insert(int num,node start)
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
				temp=start;
			}
			return start;
		
	}
	node insert2(int num1,node start2)
	{
		node temp=new node(num1);
		if(start2==null)
		{
			start2=temp;
		}
		else
		{
			node ptr=start2;
				while(ptr.next!=null)
				{
					ptr=ptr.next;
				}
				ptr.next=temp;
				temp=start2;
		}
		return start2;
	}
	void display(node start)
	{
		node ptr=start;
		while(ptr!=null)
		{
			System.out.print(ptr.data+" ");
			ptr=ptr.next;
		
		}
		
	}
	public static node merge(node start,node start2)
	{
		node temp;
		node ptr=start;
		if(start==null&&start2==null)
		{
		  return null;
		}
		else if(start!=null&&start2==null)
		{
		  return start;
		}
		else if(start==null && start2!=null)
		{
		  return start2;
		}
		else
		{
		  ptr=start;
		while(ptr.next!=null)
		{
		  ptr=ptr.next;
		}
		ptr.next=start2;
		return start;
		}
		
	}
	public static void main(String ars[])
	{
		merge r=new merge();
		Scanner s=new Scanner(System.in);
		node start=null;
		node start2=null;
		System.out.println("Enter size for 1 linked list");
		int n=s.nextInt();
		System.out.println("Enter elements of 1 Linked List");
		for(int i=0;i<n;i++)
		{
			int num=s.nextInt();
			start=r.insert(num,start);
		}
		System.out.println("Enter size for 2 linked list");
		int n1=s.nextInt();
		System.out.println("Enter elements of 2 Linked List");
		for(int i=0;i<n1;i++)
		{
			int num1=s.nextInt();
			start2=r.insert2(num1,start2);
		}
		r.merge(start,start2);
		if(start==null)
		r.display(start2);
	
	else
		r.display(start);
	}
	




}