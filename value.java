import java.io.*;
class Value
{
 public static void main(String args[]) throws IOException
 {
      int a,b,e;
      InputStreamReader isr=new InputStreamReader(System.in);
      BufferedReader br=new BufferedReader(isr);
      System.out.println("Enter the value of a");
      a=Integer.parseInt(br.readLine());
      System.out.println("Enter the value of b");
      b=Integer.parseInt(br.readLine());
      e=a;
      a=b;
      b=e;
      System.out.println("a="+a);
      System.out.println("b="+b);
 }
} 