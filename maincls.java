import java.util.Scanner;

interface a
{
	abstract void num(int a);
}
class b implements a
{
	public void num(int a)
	{
		System.out.println(" Value = "+a);
	}
}
class c implements a
{

	public void num(int a) {
		
		System.out.println("Square of Value is "+(a*a));
	}
	
}

public class maincls {
public static void main(String args[])
{
	Scanner s = new Scanner(System.in);
	System.out.println("enter the value: ");
	int val = s.nextInt();
	b  obj1 = new b();
    obj1.num(val);
    c obj2 = new c();
    obj2.num(val);

	
}
}
