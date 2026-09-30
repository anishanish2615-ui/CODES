package exceptionhandling;

public class finallys {
    public static void main(String[] args) {
        try{
            int result=10/0;
            System.out.println("result is "+result);
        }catch(Exception e){
            System.out.println("something went wrong:"+e.getMessage());
        }finally{
            System.out.println("program continues");
        }
    }
}
