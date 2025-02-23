package com.registerForm.service;

import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import jakarta.servlet.http.HttpSession;

@Component
public class sessionHelper {

	
	public void removeMessageFromSession()
	{
		try
		{
			System.out.println("Removing Message From Session");
				HttpSession session = ((ServletRequestAttributes)RequestContextHolder.getRequestAttributes()).getRequest().getSession();
				session.removeAttribute("message");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	
}
