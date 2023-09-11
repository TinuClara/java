import java.util.Scanner;
class stack
{
    int number[];
    int top;
    int limit;

    // constructor
    public stack(int size){
        top =-1;
        limit =size;
        number=new int[size];
    }
    // insert an element
    void push(int num)
    {
        if(isFull())
            System.out.println("Stack is full");
        else
        {
            top=top+1;
            number[top]=num;
        }

    }
    // popping out the element that is at the top of stack
    void pop(){
        if(isEmpty())
            System.out.println("Stack is Empty");
        else{
            top=top-1;
            System.out.println("Element popped out");
        }
    }
    void peek()
    {
        System.out.println("Top most element in Stack ="+number[top]);

    }
    // check stack, is it full or not?
    boolean isFull(){
        return top >=limit-1;
    }
    boolean isEmpty(){
        return top==-1;
    }

    void print(){
        System.out.println("Elements in Stack:-");
        for(int i=top;i>=0;i--)
            System.out.println(number[i]);
    }


    public static void main(String[] args) 
	{
        Scanner input =new Scanner(System.in) ;
        int size,option=0,element;
        char chr;
        System.out.print("Enter the maximum size that a stack can have = ");
        size=input.nextInt();
        stack obj= new stack(size);
        while(option !=4)
		{
            System.out.println("Please press any number from the following operations:-"
                    + "\n 1. Insert an element "
                    + "\n 2. Pop an element"
                    + "\n 3. Peek of the stack"
                    + "\n 4. Display the elements of the stack");
            option=input.nextInt();

            switch(option)
			{
                case 1:
                    System.out.print("Please enter the element to insert = ");
                    element=input.nextInt();
                    obj.push(element);
                    break;
                case 2:
                    obj.pop();
                    break;
                case 3:
                    obj.peek();
                    break;
                case 4:
                    obj.print();
                    break;
                default:
                    System.out.println("Choose wrong option ");

            }
            
        }
			
    }
}