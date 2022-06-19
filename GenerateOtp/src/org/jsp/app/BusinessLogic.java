package org.jsp.app;

import java.util.Random;

public class BusinessLogic 
{
	public static void generateOTP()
	{
		Random random = new Random();
		int otp=random.nextInt(1000);
	
		if(otp < 0)
		{
			otp = otp*-1;
		}
		if(otp < 1000)
		{
			otp= otp+1000;
		}
		System.out.println(otp);
	}
	
}
