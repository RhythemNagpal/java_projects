import java.util.*;
public class reverse_stack{
    static Stack<Integer> st=new Stack<>();

	public static void main(String[] args) {
	initial();
	}
	
	static void initial()
	{
	st.push(1);
	st.push(2);
	st.push(3);
	
	System.out.println(st);
	reverse();
	System.out.println(st);
	
	}
	
static	void reverse()
	{
	if(st.isEmpty())
	{
	return;
	}
	int m=st.peek();
	st.pop();
 	reverse();
	push_at_bottom(m);
	}
	
	static void push_at_bottom(int n)
	{
	if(st.isEmpty())
	{
	st.push(n);
	return ;
	}
	int m=st.peek();
	st.pop();
	push_at_bottom(n);
	st.push(m);
	}
	
}
	
	