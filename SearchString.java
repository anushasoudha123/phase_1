import java.util.Scanner;

public class SearchString 
{
    public static void main(String[] args) 
    {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter string array size");
		int s=scanner.nextInt();
		String[] data=new String[s];
		System.out.println("Enter data into string array");
		for (int i = 0; i < data.length; i++)
		{
			data[i]=scanner.next();
		}
		
		System.out.println("Enter string to be search");
		String value=scanner.next();
		int reference=0;
		for (int i = 0; i < data.length; i++)
		{
			if(data[i].equals(value))
			{
				System.out.println(value+" is found in string array at position "+i);
				reference++;
				break;
			}
		}
		
		     if(reference==0)
			 System.out.println(value+" is not found in string array ");
			
	}
}