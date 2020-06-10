package paket1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/AttributeOkuma")
public class AttributeOkuma extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter yaz = response.getWriter();
		
		//context -- farkl� taray�c�larda da bu de�ere bula��labilir...
		yaz.println(getServletContext().getAttribute("ayar1"));
		yaz.println(getServletContext().getAttribute("ayar2"));
		
		
		//session -- her taray�c�da farkl� bir thrade m�� gibi
		yaz.println(request.getSession().getAttribute("ayar3"));
		yaz.println(request.getSession().getAttribute("ayar4"));
		
		//request -- istek zaman�nda olu�ur ve hemen silinir
		yaz.println(request.getAttribute("ayar5"));
		yaz.println(request.getAttribute("ayar6"));
		
		
		
		yaz.close();
	}

}
