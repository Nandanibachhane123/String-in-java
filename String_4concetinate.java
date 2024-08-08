public class String_4concetinate 
{
   public static void main(String[] args) 
   {
     String s1 = "PHP Exercise";
     String s2 = "Pythol Exercise";

     char [] arr1 = s1.toCharArray();
     char [] arr2 = s2.toCharArray();

     char [] concatentedArray = new char[arr1.length + arr2.length];
     for(int i = 0;i<arr1.length;i++)
     {
        concatentedArray[i] = arr1[i];
     }
     for(int j = 0;j<arr2.length;j++)
     {
        concatentedArray[arr1.length + j] = arr2[j];
     }
     String concatstring = new String(concatentedArray);
     System.out.println("concatenet String " + concatstring);
   } 
}
