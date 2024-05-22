import myPack.Intro;

public class TryAndCatch{
	public static void main(String args[]){
		Intro.print("Try catch statement") ;
        
        int arr[] = {3,4,5,7,8} ;

        try{
            for (int i = 0; i <= 5; i++) {
                System.err.print(arr[i]+" ");
            }
        }catch (IndexOutOfBoundsException e){
            System.err.println("\nException caught : ") ;
            e.printStackTrace() ;
        }
	
	}
}