public class String_5charcomp 
 {
    public static void main(String[] args) 
    {
        String s1 = "example.com";
        String s2 = "Example.com";
        char ch ;
        char ch2 ;
        for(int i = 0;i<s1.length();i++)
        {
            ch = s1.charAt(i);
            ch2 = s2.charAt(i);
            if(ch==ch2)
            {
                System.out.println("true");
                break;
            }
            else
            {
               System.out.println("False");
               break;
            }
        }

    }
}
