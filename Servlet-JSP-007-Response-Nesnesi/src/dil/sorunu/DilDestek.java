package dil.sorunu;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/DilDestek")
public class DilDestek extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");

		PrintWriter yaz = response.getWriter();
		yaz.write("<html><head>");
		
		yaz.write("<meta charset='utf-8'></head>");
		
		yaz.write("<body>");
		
		yaz.write("Tu�ra ��n���l�<br>");
		yaz.write("q w e r t y u � o p � � a s d f g h j k l � i z x c v b n m � � <br>");
		yaz.write("Q W E R T Y U I O P � � A S D F G H J K L � � Z X C V B N M � � <BR>");
				
		yaz.write("</body></html>");
		
		
		
	}

}
