public class _39Removespace 
{
    public static void main(String[] args) 
    {
        String str = "my name in nandani";
        String newstr = "";
        for(int i = 0; i<str.length();i ++)
    {
        if(str.charAt(i)!=' ')
        {
            newstr+=str.charAt(i);
        }
    }
       str = newstr;
       System.out.println(str);
    }
}
