import java.util.Scanner;  
class Main{  
public static void main(String args[]){  
String str="     the screen is so bad m and many      ";
  for(int i=0;i<str.length();i++)
    {  char ch= str.charAt(i);
        if(ch!=' ')
        {
          System.out.println(ch);
        }
    
    }
}
}