//3rd one WAP to find the unique element in a given array,assuming all elements have duplicates except one
package jsp.org.app;
public class Maincls1 
{
	public static void main(String[] args) 
	{
		int n=6;
		int arr[] ={1,2,3,4,4,3};
		int i,j,count;
		for(i=0;i<arr.length;i++)
		{
			count=0;
			for(j=0;j<i;j++)
			{
				if(arr[i]!=arr[j])
				{
					count++;
				}
			}
			if(count==1)
			{
				System.out.println(arr[j]);
			}
			else
			{
				System.out.println(" ");
			}
		}
	}
}

			
