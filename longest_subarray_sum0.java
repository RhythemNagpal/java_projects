import java.util.*;
public class longest_subarray_sum0{
    
	public static void main(String[] args) {
 Scanner sc=new Scanner(System.in);
 int n=sc.nextInt();
 int x;
//System.out.println(n);
 
 int [] arr=new int[n];
 int [] arr1=new int[n];
 Hashtable <Integer,Integer> ht=new Hashtable<>();
 int ar[]=new int[2];
 for(int i=0;i<n;i++)
 {
 arr[i]=sc.nextInt(); 
 }
 ht.put(0,0);
 arr1[0]=arr[0];
 int m1[]=new int[2];
 int m=0;
 for(int i=1;i<n;i++)
 {
 arr1[i]=arr1[i-1]+arr[i];
//System.out.print( arr1[i] +" ");
 }
 for(int i=0;i<n;i++)
 {
if(ht.containsKey(arr1[i]))
{if(arr1[i]==0)
	{
	ar[0]=ht.get(arr1[i]);
	ar[1]=i;
	if(m<ar[1]-ar[0])
	{	
	m1[0]=ar[0];
		m1[1]=ar[1];
		m=ar[1]-ar[0];
		}
	ht.replace(arr1[i],i+1);
		}
		else{
		ar[0]=ht.get(arr1[i])+1;
	ar[1]=i;
	if(m<ar[1]-ar[0])
	{	
	m1[0]=ar[0];
		m1[1]=ar[1];
		m=ar[1]-ar[0];
		}
	ht.replace(arr1[i],i);
	
		}
	System.out.println(ar[0]+" "+ar[1]);
}
else
	ht.put(arr1[i],i);
 }
 System.out.println(m1[0]+" "+m1[1]);
  }
}