import java.util.*;
public class troublesort{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
int t=sc.nextInt();
for(int i=0;i<t;i++)
{
    int n=sc.nextInt();
 long arr[]=new long[n];
    for(int j=0;j<n;j++)
    {
        arr[j]=sc.nextInt();
    }
    troublesort obj=new troublesort();
   int c= obj.troublesorting(arr);
   if(c==-1)
   System.out.println("OK");
   else
   System.out.println(c);
}
}

int troublesorting(long[] arr)
{ 
    long [] arr1=new long[arr.length];
	for(int i=0;i<arr.length;i++)
	{
		arr1[i]=arr[i];
	}
    for(int i=0;i<arr.length;i++)
    {
    boolean done=false;
    for(int j=0;j<arr.length-2;j++)
    {
        if (arr[j] > arr[j+2])
        {
         long temp=arr[j];
         arr[j]=arr[j+2];
         arr[j+2]=temp;
          done=true;
        }
   
	}
	        
    if(!done)
    break;
    }
	 //System.out.println(arr[0]+" "+arr[1]+" "+arr[2]);
	
        Arrays.sort(arr1);
        for(int i=0;i<arr1.length;i++)
        {
            System.out.println(arr[i]);
			if(arr1[i]!=arr[i])
            return i;
        }
        return -1;
}
}