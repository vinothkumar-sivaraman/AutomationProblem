package homework.automationproblems;

public class Problem1 {
	
	public Problem1()
	{
		System.out.println("constructor invoked from problem1");
		
		System.out.println("constructor point");
	}
	
	public void method1(String a)
	{
		a ="method overloading";
		System.out.println(a);
	}
	
	public void C(String b, int a)
	{
		a = 7;
		System.out.println("method overloading" + a);
	}

}
