package listener1.servlet.context.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.swing.JOptionPane;

//web.xml i�aretleme
public class ServletContextListener2 implements ServletContextListener {



    public void contextDestroyed(ServletContextEvent sce)  { 
    	
    	JOptionPane.showMessageDialog(null, "ServletContextListener2 S�n�f�nda - contextDestroyed Metodu �al��t�");
    }


    public void contextInitialized(ServletContextEvent sce)  { 
    	
    	JOptionPane.showMessageDialog(null, "ServletContextListener2 S�n�f�nda - contextInitialized Metodu �al��t�");
    }
	
}
