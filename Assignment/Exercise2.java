import java.util.*;  
public class Exercise2  
{  
  public static void main(String args[])  
  {  
    int i, sum=0, z;  
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the numbers: ");
    for(i=0;i<5;i++)   //loop executes n times  
    {  
  
      z = sc.nextInt(); //reads integer from the user  
      sum=sum+z;       //calculates sum  
    }  
    System.out.println("The sum of the numbers is: "+sum);  
  }  
}  
