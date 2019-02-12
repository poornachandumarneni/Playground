import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in= new Scanner(System.in);
    int n=in.nextInt();
    int s=0;
    
    for(int c=1;c<=n;c++)
    {
      
    //Try out your code here
        s=s+c;
   
    }
    System.out.println(s);
  }
}