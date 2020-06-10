package servlet.context.ornek;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletContextClass extends HttpServlet{

	/*
	 *�necelikle Servlet config = servletimiz olu�turulurken belirli (veritaban� �ifresi gibi)parametre tan�mlamam�z� sa�lamaktadir
	 *Servlet Context te ise olay t�m uygulama baz�nda olmas�d�r.
	 *
	 */
	
	/*web.xml i�eri�i
	 * 
	 *  <context-param>
		  	<param-name>website</param-name>
		  	<param-value>ibrhalil.com</param-value>
		  </context-param>
		  
		  <context-param>
		  	<param-name>mail</param-name>
		  	<param-value>ibhalilaydn@gmail.com</param-value>
		  </context-param>
		  
		  <servlet>
		  	<servlet-name>ContextClass</servlet-name>
		  	<servlet-class>servlet.context.ornek.ServletContextClass</servlet-class>
		  </servlet>
		  
		  <servlet-mapping>
		  	<servlet-name>ContextClass</servlet-name>
		  	<url-pattern>/context</url-pattern>
	 *	</servlet-mapping>
	 * 
	 * 
	 */
	
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		ServletContext contxt = getServletContext();
		String site = contxt.getInitParameter("website");
		
		PrintWriter yazPrintWriter = resp.getWriter();
		yazPrintWriter.write(site+" --- ");
		
		
		
		Enumeration<String> liste = contxt.getInitParameterNames();
		while (liste.hasMoreElements()) {
			String deger = (String) liste.nextElement();
			yazPrintWriter.write(deger+" - "+contxt.getInitParameter(deger)+" , ");
			System.out.println(deger);
			
		}
		
		
		
		
		yazPrintWriter.close();
	}
}
