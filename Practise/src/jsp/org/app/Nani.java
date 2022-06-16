package jsp.org.app;
public class Nani 
{
	public static void a(int i,int j)
	{
		System.out.println(i+j);
	}
	private static void b(int m,double n)
	{
		System.out.println(m+n);
	}
	public static double c(double k,double l)
	{
		return(k+l);
	}
	public static void main(String[] args) 
	{
		double res= c(2.3,4.3);
		System.out.println(res);
	}
}
