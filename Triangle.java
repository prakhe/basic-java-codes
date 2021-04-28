

import java.util.*;
public class Triangle
{
	int side,a,b,m,n,p;
	double s,area1,area2,area3;
	Triangle()
	{
		side=0;
		a=0;
		b=0;
		m=0;
		n=0;
		p=0;
		s=0.0d;
		area1=0.0d;
		area2=0.0d;
		area3=0.0d;
	}
	public void equilateral()
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter side of a equilateral triangle=");
		side=sc.nextInt();
		area1=((Math.sqrt(3))/4)*side*side;
	}
	public void isoceles()
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter two sides of isoceles triangle=");
		a=sc.nextInt();
		b=sc.nextInt();
		area2=(b/4)*Math.sqrt((4*a*a)-(b*b));
	}
	public void scalene()
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter all sides of scalene triangle=");
		m=sc.nextInt();
		n=sc.nextInt();
		p=sc.nextInt();
		s=(m+n+p)/2;
		area3=Math.sqrt(s*(s-m)*(s-n)*(s-p));
	}
	public void display()
	{
		System.out.println("AREA OF EQUILATERAL TRIANGLE="+area1);
		System.out.println("AREA OF ISOCELES TRIANGLE="+area2);
		System.out.println("AREA OF SCALENE TRIANGLE="+area3);
	}
	public static void main(String args[])
	{
		Triangle obj=new Triangle();
		obj.equilateral();
		obj.isoceles();
		obj.scalene();
		obj.display();
	}
}