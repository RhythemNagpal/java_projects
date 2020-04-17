import java.util.*;
public class prefix_sum_array{
    
	public static void main(String[] args) {
 Scanner sc=new Scanner(System.in);
 int n=sc.nextInt();
 int x;
//System.out.println(n);
 
 int [] arr=new int[n];
 int [] arr1=new int[n];
 
 for(int i=0;i<n;i++)
 {
 arr[i]=sc.nextInt(); 
 }
 arr1[0]=arr[0];
 for(int i=1;i<n;i++)
 {
 arr1[i]=arr1[i-1]+arr[i];
//System.out.print( arr1[i] +" ");
 }
 int q=sc.nextInt();
for(int j=0;j<q;j++)
{
int n1=sc.nextInt();
int m=sc.nextInt();
x=arr1[m]-arr1[n1]+arr[n1];
System.out.println(x);
} 
 
 }}