package listener1.servlet.context.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import javax.swing.JOptionPane;

//i�aretleme ile

@WebListener
public class ServletContextListener1 implements ServletContextListener{

	@Override
	public void contextInitialized(ServletContextEvent sce) {

		// �lk Ba�lat�ld���nda �al��an metot
		
		//JOptionPane.showMessageDialog(null, "ServletContextListener1 S�n�f�nda - contextInitialized Metodu �al��t�");
		
	}
	
	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		
		//JOptionPane.showMessageDialog(null, "ServletContextListener1 S�n�f�nda - contextDestroyed Metodu �al��t�");
		
		// Kapat�ld���nda �al��an metot
	}
}
