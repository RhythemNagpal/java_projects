import java.util.*;
public class push_at_bootom_stack_recursive{
    
	public static void main(String[] args) {
	Stack <Integer> st=new Stack<>();
	st.push(1);
	st.push(2);
	st.push(3);
	System.out.println(st);
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
push_at_bootom_stack_recursive obj=new push_at_bootom_stack_recursive();
	System.out.println(obj.Stacker(st,n));
	}
	
	Stack<Integer> Stacker(Stack<Integer> st,int n)
	{
	
	if(st.isEmpty())
	{
	st.push(n);
	return st;
	}
	int m=st.peek();
	st.pop();
	Stacker(st,n);
	st.push(m);
	return st;
	}
	
	}
	
	