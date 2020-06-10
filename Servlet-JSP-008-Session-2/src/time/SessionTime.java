package time;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/SessionTime")
public class SessionTime extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


		HttpSession session = request.getSession();
		Integer girisSay =(Integer) session.getAttribute("girdiSay");
		
		if (girisSay==null) 
		{
			girisSay=1;
		} 
		else 
		{
			girisSay++;
		}
		session.setAttribute("girdiSay", girisSay);
		
		
		PrintWriter yaz = response.getWriter();
		
		yaz.println("session ID : "+session.getId());
		yaz.println("girdiSay   : "+girisSay);
		yaz.println("session Olu�turma S�resi : "+new Date(session.getCreationTime()));
		yaz.println("session son eri�im S�resi : "+new Date(session.getLastAccessedTime()));
		session.setMaxInactiveInterval(-1);		//15 saniye sonra session silinecek
		yaz.println("MaxInactiveInterval : " +session.getMaxInactiveInterval()); 	//session ayakta tutma s�resi
		/*
		 * session.setMaxInactiveInterval(-1);		//session s�resinin s�n�rs�z oldu�u (saniye cinsinde yaz�l�r)
		 */
		
		yaz.close();
		
		
		//session.invalidate();
		//session s�resine bakmaks�z�n  session kapat�r
		
		
		/*		web.xml ile session s�resi tan�mlama 
		 * 
		 *   <session-config>
  		 *  	<session-timeout>30</session-timeout>30dk s�re ay�racak
  		 *	 </session-config>
		 */
	}

}
