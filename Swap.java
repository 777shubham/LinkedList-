import java.util.*;
class node
{
	int data;
	node next;
	node (int num)
	{
		data=num;
	}
}
class Swap
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
				//temp=start;
			}
			
		
	}
	void swap(int s1,int s2)
	{
		int c=1;
		node p1=start;
		node p2=start;
		node ptr=start;
		while(ptr!=null)
		{
			if(c==s1)
			{
				p1=ptr;
			}
			if(c==s2)
				{
					p2=ptr;
				}
			c++;
			ptr=ptr.next;
		}
			int temp=p1.data;
			p1.data=p2.data;
			p2.data=temp;
			
	
		
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
	public static void main(String ars[])
	{
		Swap r=new Swap();
		Scanner s=new Scanner(System.in);
		node start=null;
		System.out.println("Enter Size");
		int n=s.nextInt();
		System.out.println("Enter Numbers");
		for(int i=0;i<n;i++)
		{
			int num=s.nextInt();
			r.insert(num);
		}
		System.out.println("Enter index which u want to swap between 0 to "+n+" ");
		int s1=s.nextInt();
		System.out.println("Enter index with which u want to swap  between 0 to "+n+" ");
		int s2=s.nextInt();
		r.swap(s1,s2);
		System.out.println("After Swapping "+s1+" to "+s2);
		r.display();
	}
	
}