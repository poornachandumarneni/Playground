import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in= new Scanner(System.in);
    int n=in.nextInt();
    
    for(int c=1;c<=n;c++)
    {
      if(c%2 != 0)
      {
    //Try out your code here
    System.out.println(c);
      }
    }
  }
}