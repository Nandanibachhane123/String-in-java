//compare two string :
public class String_2comoaretwo
{
   public static void main(String[] args) 
    {
    String s1 = "This is Exercise 1";
    String s2 = "This is Exercise 2";
    int result = s1.compareTo(s2);
    System.out.println(result);
    if(result < 0)
    {
        System.out.println("\"" +s1+"\"is less than\""+s2+"\"");
    }else if(result>0)
    {
        System.out.println("\"" +s1+"\"is Greater than\""+s2+"\"");
    }
    else
    {
        System.out.println("\"" +s1+"\"is Equal to the\""+s2+"\"");
    }
}
}
    /*char ch;
    int i,j = 0;
    for(i = 0;i<s1.length();i++)
    {
        for(j = 0;j<s2.length();j++ )
        {
            ch = s1.charAt(i);
            ch = s2.charAt(j);
        }
    }

   */
    


