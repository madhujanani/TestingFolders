package org.sample;

import jakarta.servlet.http.HttpSessionEvent;
import jakarta.servlet.http.HttpSessionListener;

public class SessionListeners  implements HttpSessionListener{
	
	@Override
	public void sessionCreated(HttpSessionEvent sse){
		System.out.println("Session Started");
	}
	@Override
	public void sessionDestroyed(HttpSessionEvent sse){
		System.out.println("Session closed");
	}

}
