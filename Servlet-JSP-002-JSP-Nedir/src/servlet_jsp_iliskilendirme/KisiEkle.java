package servlet_jsp_iliskilendirme;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class KisiEkle
 */
@WebServlet("/KisiEkle")
public class KisiEkle extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public KisiEkle() {
        super();
       
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		RequestDispatcher goster = request.getRequestDispatcher("jspSayfa01.jsp");
		goster.forward(request, response);
		
		/*
		 * request nesnesinden 'getRequestDispatcher' metodunu kullanarak 'WebContent' de olu�turulmu� jsp sayfas�n� 'RequestDispatcher' referans�na e�itleyip
		 * servlete gelen request ve responselar� jsp sayfan�na y�nlendiriyoruz.
		 */
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//doGet(request, response);
		
		
		String ad = request.getParameter("kisiAd");
		ad = ad.trim();	//verini ba��ndaki ve sonundaki bo�lu�u silmektedir.
		//jsp sayfas�nda input name olrak tan�mlanmi� degeri yaz�lmal�
		
		
		request.setAttribute("gelenAdDegeri", ad);
		//gelenAdDegeri ad�nda bir �zellik tan�mlay�p requset nesnesine ekledik.
		
		if(ad.length()==0)
		{
			request.getRequestDispatcher("jspSayfa03.jsp").forward(request, response);
			//gelen ismi ba�ka bir jsp sayfan�na g�ndermekteyiz
		}
		else
		{
			request.getRequestDispatcher("jspSayfa02.jsp").forward(request, response);
		}
			
	}

}
