public class _39replacestring 
{
   public static void main(String[] args) 
   {
    String str = "My name is string";
    String[]strArray = str.split("\\s+");
    for(int i = 0;i<strArray.length;i++)
    {
        if(strArray[i].equalsIgnoreCase("string"))
        {
            strArray[i] = "java";
        }
    }
    
    String newstr = "";
    for(int i = 0; i<strArray.length;i++)
    {
        newstr+=strArray[i];
    }
    System.out.println(newstr);

   } 
}
