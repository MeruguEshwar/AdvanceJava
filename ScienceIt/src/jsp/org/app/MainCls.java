//WAP to find the largest and smallest numbers in a given unsorted array
package jsp.org.app;
public class MainCls 
{
	public static void main(String[] args) 
	{
		int arr[] = new int[] {1,2,3,4,5,6,7,8,9};
		int smallest = arr[0];
		int biggest = arr[0];
		
		for(int i=0;i < arr.length;i++)
		{
			if(arr[i] > biggest)
			{
				biggest=arr[i];
			}
			else if(arr[i] < smallest)
			{
				smallest=arr[i];
			}
		}
		System.out.println("largest Number is "+biggest);
		System.out.println("smallest Number is "+smallest);
	}
}
