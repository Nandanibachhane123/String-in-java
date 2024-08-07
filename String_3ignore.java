//compare and ignore the diffrent
public class String_3ignore 
{
   public static void main(String[] args)
   {
    String s1 = "This is exercise";
    String s2 = "this is Exercise";
    boolean result = s1.equalsIgnoreCase(s2);
    System.out.println("After compare:"+result);
    if(result==true)
    {
        System.out.println(s1+"is equal to"+s2);
    }
    else
    {
        System.out.println(s1+"not equal"+s2);
    }
   }
}
   