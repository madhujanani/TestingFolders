package org.demo;
import java.io.IOException;
import java.util.Date;
import jakarta.servlet.jsp.JspException;
import jakarta.servlet.jsp.JspWriter;
import jakarta.servlet.jsp.tagext.TagSupport;

public class Mydate extends TagSupport {
	@Override
	public int doStartTag() throws JspException{
		Date dt =new Date();
		JspWriter out = pageContext.getOut();
		try {
			out.println(dt);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return SKIP_BODY;
		
	}

}
