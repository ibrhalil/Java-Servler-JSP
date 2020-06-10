package header;

import java.io.IOException;
import java.util.Collection;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Header")
public class Header extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//header ekleme
		response.setHeader("isim", "Hakan");
		response.setHeader("isim", "Murat");
		//setHeader() metodu ayn� 'isim' de�erinde ekleme yaparsak son girilen ilkin �st�ne yazar !!
		
		//header varm� kontrolu
		boolean kontrol = response.containsHeader("isim");
		
		//var olan header alma (ilkini al�r)
		String isim = response.getHeader("isim");
		
		//header ekleme (yan�na) 
		response.addHeader("isim", "Ramazan");
		response.addHeader("isim", "Bayram");
		
		Collection<String> isimHeadere = response.getHeaders("isim");
		System.out.println(isimHeadere.toString());
		
		//header'a int deger ekleme
		response.setIntHeader("yas", 24);
		response.addIntHeader("yil", 2020);
		
		response.setDateHeader("tarih", System.currentTimeMillis());
		
		
		//ayn� name sahip olan de�erlerin hepsini g�r�nt�leme
		Collection<String> varOlanHeaderIsimleri = response.getHeaderNames();
		for (String headerIsim : varOlanHeaderIsimleri) {
			System.out.println(headerIsim);
		}
	
	}
	
	 
}
