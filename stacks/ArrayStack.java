
/**
 *
 * @author Anurag
 *
 *
 */
public class ArrayStack{

	private int array[];
	private int top;
	private int capacity;

ArrayStack(int capacity)
{
	this.capacity=capacity;
	this.array=new int[capacity];
	top=-1;
}
public boolean isEmpty()
{
	return top==-1?true:false;
}
public boolean isFull()
{
	return top==capacity-1?true:false;
}
public int Top()
{
	if (top==-1)
	{
		System.out.println("Stack is Empty");
	return -1;
}
	return array[top];
}

public void push(int e)
{
	if (top==capacity-1)
	{
		System.out.println("Stack is Full !");
		return;
	}
	array[++top]=e;
	return;
}

public int pop()
{
	if (top==-1)
	{
		System.out.println("Stack is Empty !");
		return -1;
	}
	return array[top--];
}
	public static void main(String[] args) {
		ArrayStack stack = new ArrayStack(5);
		stack.push(1);stack.push(2);stack.push(3);stack.push(4);stack.push(5);stack.push(6);
		System.out.println("Stack is Full :: "+stack.isFull());
		while(!stack.isEmpty())
		{
			System.out.println(""+stack.pop());
		}
		System.out.println("Stack is Empty :: "+stack.isEmpty());

	}
}
