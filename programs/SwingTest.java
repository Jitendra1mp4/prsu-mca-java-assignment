import java.awt.* ;
import javax.swing.* ;
import javax.swing.border.Border ;

public class SwingTest {
    public static void main(String[] args) {
			
		MyJavaFrame jf = new MyJavaFrame() ;
		
		Border br = BorderFactory.createLineBorder(Color.green, 4) ;
		
		JLabel label = new JLabel("Yanha pe label ke text put kar sakte hain!")  ;
		
		label.setForeground(Color.white) ;
		label.setHorizontalAlignment(JLabel.CENTER) ;
		label.setVerticalAlignment(JLabel.CENTER) ;
		
		label.setText("Jo bhi text dalna hai, Yanha put mere mitra") ;
		
		ImageIcon image = new ImageIcon("labelImage.png") ;
		label.setIcon(image) ;
		label.setVerticalTextPosition(JLabel.BOTTOM) ;
		label.setHorizontalTextPosition(JLabel.CENTER) ;
		
		label.setBorder(br) ;
		
		jf.add(label) ;
		jf.setSize(600,600) ;
		//jf.pack() ;
		
    }

}
