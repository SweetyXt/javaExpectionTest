public class MyExpection extends Exception{
    String Message;
    public MyExpection(String ErrorMessage){
        Message=ErrorMessage;
    }
    public String getMessage(){
        return Message;
    }
}
