package armstrong;
import java.util.*;
public class Armstrong {
	public static void main(String args[])
	{
		int a=0;
		int result=0;
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		int num=a;
		while(a!=0)
		{
			int rem=a%10;
			result+=(rem*rem*rem);
			a=a/10;
		}
		if(result==num)
		{
			System.out.print("True");
		}
		else
		{
			System.out.print("False");
		}
	}
}