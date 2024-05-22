import myPack.Intro;
import java.text.SimpleDateFormat ;
import java.util.Date ;

public class CurrentDateInVariousFormat{
	public static void main(String args[]){
		Intro.print("Printing current date in defferent formates") ;
		
		Date currentDate = new Date() ;
		
		SimpleDateFormat f1 = new SimpleDateFormat("dd/MM/yyyy") ;
		SimpleDateFormat f2 = new SimpleDateFormat("dd-MMM-yyyy") ;	
		SimpleDateFormat f3 = new SimpleDateFormat("MMM dd yyyy") ;	
		
		System.out.println("Current date in format1 : "+f1.format(currentDate)) ;
		System.out.println("Current date in format2 : "+f2.format(currentDate)) ;
		System.out.println("Current date in format3 : "+f3.format(currentDate)) ;
	}
}