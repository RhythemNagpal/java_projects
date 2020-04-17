import java.util.*;
public class next_greater_element{
public static void main(String args[])
{
Stack<Integer> st=new Stack<>();
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int arr[]=new int[n];
int ans[]=new int[n];
for (int i=0;i<n;i++)
{
arr[i]=sc.nextInt();
}
for (int i=0;i<n;i++)
{
if(!st.isEmpty() || arr[st.peek()]>arr[i])
{
	ans[i]=st.pop();
	
}
else
	st.push(i);
}
for(int i=0;i<n;i++)
{
System.out.println(arr[i] +" "+ans[i]);
}
}}