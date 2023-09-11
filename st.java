import java.util.*;
class stack extends Exception{
	public stack(String str)
	{
		super(str);
	}
}
class st
{
	
		int a[],sz,top;
		public st(int size)
		{
			top=-1;
			sz=size;
			a=new int[sz];
		}
		void push(int num)
		{
			if(top==sz-1)
			{
				 System.out.println("Stack is full");
			}
			else
			{
				top++;
				a[top]=num;
			}
		}
		void pop()
		{
			if(top==-1)
			{
				 System.out.println("Stack is empty");
			}
			else
			{
				top--;
				System.out.println("popped");
			}
		}
		void peek()
		{
			if(top==-1)
			{
				 System.out.println("Stack is empty");
			}
			else
			{
			System.out.println("Stack top elements="+a[top]);
			}
		}
		void display()
		{
			if(top==-1)
			{
				 System.out.println("Stack is empty");
			}
			else
			{
				for(int i=top;i>=0;i--)
				{
				System.out.println("Stack elements="+a[i]);
				}
			}
		}
	public static void main(String args[])
{
	int ch=0,size,so;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter size");
	size=sc.nextInt();
	st s=new st(size);
	
	while(ch !=5)
	{
		System.out.println("1.push");
		System.out.println("2.pop");
		System.out.println("3.peek");
		System.out.println("4.display");
		System.out.println("5.exit");
		System.out.println("Choice");
		ch=sc.nextInt();
		switch(ch)
		{
			case 1:
			
			System.out.println("element to be inserted");
			int num=sc.nextInt();
			s.push(num);
			break;
			case 2:
			s.pop();
			s.display();
			break;
			case 3:
			s.peek();
			
			break;
			case 4:
			s.display();
			
			break;
			case 5:
			System.exit(0);
		}
	}
}	
}