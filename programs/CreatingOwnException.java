import myPack.Intro;
class myOwnException extends Exception {
    myOwnException(){
        super("your own exception occurred >_<");
    }
}


public class CreatingOwnException{
    public static void main(String[] args) {
        Intro.print("Creating my own exception");
        try{
            throw new myOwnException() ;
        }catch(myOwnException e){
            System.err.println(e);
        }
    }
}