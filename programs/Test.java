import javax.swing.* ;
import java.awt.event.KeyEvent; 
import java.awt.event.KeyListener ;

public class Test extends JFrame{
	Test(){
		this.setSize(400,500) ;
		this.setVisible(true) ;
		this.setDefaultCloseOperation(EXIT_ON_CLOSE) ;
		
	}
	
	public static void main(String args[]){
		new Test() ;   
    }
}