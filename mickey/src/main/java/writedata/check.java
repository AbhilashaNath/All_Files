package writedata;

import java.util.Scanner;

import org.testng.annotations.Test;
@Test
public class check {
void hello() {
		
		Scanner r=new Scanner(System.in);
		System.out.println("enter a string to count the number of words");
		String temp=r.next();
		int c=0;
		for(int i=0;i<temp.length();i++)
		{
			if(temp.charAt(i)==' ')
			{
				c++;
			}
				
				
			
		}
		
		System.out.println("enter a string to count the number of words is -"+c);
	}

}
