package paket01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//>>>>>>>>>>	0	<<<<<<<<<<
/*
 * Servletler Bir Sunucuda �al��mak zorundad�r.
 * Projemizi olu�turduktan sonra bir sunucu ile birlikte �al��t�r�r�z.
 */

//>>>>>>>>>>	3	<<<<<<<<<<
/*
 * ' @WebServlet ' Annottunu kullanarak bu s�n�f�n hangi URL adresini kullan�l�nca �al��aca��n� belirtiriz.
 * 2. bir y�ntem de : web.xml tan�mlama yaparakta kullanabiliriz.
 */
@WebServlet("/Servlet01")
public class BasitBirJavaSinifi extends HttpServlet
{
	//>>>>>>>>>>	1	<<<<<<<<<<
	/*
	 * Servlet HTTP protokol�n� kullanabilen bir java s�n�f�d�r.
	 * Bir Java s�n�f�n�n SERVLET olabilmesi i�in ' HttpServlet ' s�n�f�n� miras almas� gerekmektedir.
	 * Art�k s�n�f�m�z http protokollerini anlayabilecektir. Bunun i�in ilgili metotlar� Override etmesi gerekmektedir.
	 */
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		//>>>>>>>>>>	2	<<<<<<<<<<
		/*
		 * Bu metot kullan�c�dan gelen GET istekleri alabildi�imiz ve kar�� cevap g�nderebilece�imiz bir metotdur.
		 */
		PrintWriter yaz = resp.getWriter();
		yaz.append("Merhaba D�nya...");
		//>>>>>>>>>>	4	<<<<<<<<<<
		/*
		 * PrintWriter s�n�f�ndan bir nesne olu�turuyoruz.
		 * response daki getWrite metodundan �a�r�lm��t�r.
		 */
		
	}
}
