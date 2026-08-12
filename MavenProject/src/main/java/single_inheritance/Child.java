package single_inheritance;

public class Child extends Parent{
	public void demo(String name,int age) {
		System.out.println(name);
		System.out.println(age);
		
	}

	public static void main(String[] args) {
		Child o=new Child();
		o.method(10,12);
		o.demo("anu", 12);
		
	}

}
