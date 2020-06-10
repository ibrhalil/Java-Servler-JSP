package session;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/SessionOrnek")
public class SessionOrnek extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


		PrintWriter yaz = response.getWriter();
		
			HttpSession session = request.getSession(); //true, bo� ile ayn�
			
			//HttpSession session = request.getSession(false);	= session id yoksa yeni olu�turma !!	
		
			//session nesnesinin yeni mi oldu�unu kontrol eder
			if(session.isNew())
			{
				yaz.println("yeni bir session nesnesi olu�turuldu.");
			}
			else
			{
				yaz.println("bu session (eski) �nceden vard� !");
			}
			
			
			
		yaz.close();
	}

}
