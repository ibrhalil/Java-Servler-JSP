package rewriting;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/SessionURL")
public class SessionURL extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	/*
	 * Baz� kullan�c�lar taray�c�lar�nda cookie leri kapatt�g� i�in session id tan�mlanamamaktad�r
	 * bunun i�inde session id url ile ta��yacag�z
	 */
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


		HttpSession session = request.getSession();
		session.setAttribute("name", "Halil �brahim");
		
		//yap�lan bu de�i�iklikle �erezleri kapatm�� olsada y�nlendirilen sayfaya session id gitmi� olur
		String url = "Rewriting;jsessionid="+request.getSession().getId();
		
		
		PrintWriter yaz = response.getWriter();
		
		yaz.println("<html>");
		yaz.println("<body>");
		yaz.println("<a href=\""+url+"\">Y�nlendir</a>");
		yaz.println("<br>Session Id : "+session.getId());
		yaz.println("</body>");
		yaz.println("</html>");
		
		
		yaz.close();
	}

}
