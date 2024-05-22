import java.awt.Color ;
import javax.swing.ImageIcon ;
import javax.swing.JFrame ;
public class MyJavaFrame extends JFrame{
	
	MyJavaFrame(){
		this.setSize(600,400) ;
		this.setTitle("wtf Java") ;
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE) ;
		
		
		ImageIcon image = new ImageIcon("logo.png") ;
		this.setIconImage(image.getImage()) ;
		this.setVisible(true) ;
	
		this.getContentPane().setBackground(new Color(0x321123)) ;
	}

}