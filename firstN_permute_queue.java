import java.util.*;
public class firstN_permute_queue{
public static void main(String args[])
{
	Queue<Integer> q=new LinkedList<>();
	q.add(1);
	q.add(2);
	q.add(3);
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	
int c=3;
	System.out.print("1 "+"2 "+"3 ");
	
while(c<n)
{
	int a=q.peek();
	q.remove();
	q.add(a*10+1);
	System.out.print((a*10+1)+" ");
	c++;
	q.add(a*10+2);
	System.out.print((a*10+2)+" ");
	c++;
	q.add(a*10+3);
	System.out.print((a*10+3)+" ");
	c++;
	
	}
	//System.out.println(q);
}
}