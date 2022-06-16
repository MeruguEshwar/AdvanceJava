package com.org.jsp;

import java.io.IOException;
import java.util.Random;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/BackendCodeForGenerationOTP")
public class BackendCodeForGenerationOTP extends GenericServlet
{

	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException 
	{
		// TODO Auto-generated method stub
		
		Random random = new Random();
		int otp=random.nextInt(10000);
		
		if(otp<0)
		{
			otp = otp*-1; 
		}
		
		if(otp<1000)
		{
			otp=otp+1000;
		}
		System.out.println("otp is : "+otp);
	}
	
}
