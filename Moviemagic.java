/*Define a class named movieMagic with the following description: 
Instance variables/data members: 
int year to store the year of release of a movie 
String title to store the title of the movie 
float rating  to store the popularity rating of the movie (minimum rating = 0.0 and maximum rating = 5.0) 
Member methods:  
movieMagic() constructor datamembers to 0 
String data members to To input and store year, title and rating  
void accept() To display the title of a movie and a message based on the rating as per the table below.
	Rating            Message to be displayed 
	0.0 to 2.0		  Flop
	2.1 to 3.4 		  Semi-hit	
	3.5 to 4.5		  Hit	
	4.6 to 5.0		  Super Hit*/

import java.util.*;
public class Moviemagic
{
	int year;
	String title;
	double rating;
	Moviemagic()
	{
		year=0;
		title=" ";
		rating=0.0d;
	}
	public void accept()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter year, rating(out of 5.0)=");
		year=sc.nextInt();
		rating=sc.nextDouble();
		title=sc.nextLine();
	}
	public void display()
	{
		if(rating>=0.0 && rating<=2.0)
		{
			System.out.println("Flop");
		}
		if(rating>=2.1 && rating<=3.4)
		{
			System.out.println("Semi-hit");
		}
		if(rating>=3.5 && rating<=4.5)
		{
			System.out.println("Hit");
		}
		if(rating>=4.6 && rating<=5.0)
		{
			System.out.println("Super Hit");
		}
	}
		public static void main(String args[])		
		{
			Moviemagic obj=new Moviemagic();
			obj.accept();
			obj.display();
		} 
	}
		
																																																																																																																																																															