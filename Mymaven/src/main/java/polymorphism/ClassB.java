package polymorphism;

public class ClassB extends ClassA {

	public static void main(String[] args) {
		ClassB obj=new ClassB();
		obj.display(3,2);
		
		
	}
	public void display(int a,int b)
	{
		super.display(3,4);
		int c=a+b;
		System.out.println(c);
		System.out.println("Method of ClassB");
		
	}

}
