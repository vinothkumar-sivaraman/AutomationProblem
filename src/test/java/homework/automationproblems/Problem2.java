package homework.automationproblems;

public class Problem2 extends Problem1{
	
	int asnaldf;
	int b;
	
	public Problem2()
	{
		
		System.out.println("constructor invoked.");
	}
	
	
	public Problem2(int a)
	{
		this();
	}
	
	public Problem2(String a)
	{
		this(7);
	}
	
	public void method1(String a)
	
	
	{
		
		this.method1(a);
		super.C(a, asnaldf);
		System.out.println("method override");
	}
	
	public static void main(int a)
	{
		System.out.println("method override main");
	}

	public static void main(String[] ar) {
		// TODO Auto-generated method stub
		
		
		Problem2 obj = new Problem2();
		obj.method1("hex");
		obj.method1("hex");
		main(67);
	

	}

}
