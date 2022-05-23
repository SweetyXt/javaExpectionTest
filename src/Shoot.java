public class Shoot {
    public static void pop() throws NegativeArraySizeException{
        int [] arr=new int[-3];
    }
    public static void main(String[] args) {
        try{
            pop();
        }catch (NegativeArraySizeException e){
            System.out.println("pop方法抛出异常");
        }
    }
}
