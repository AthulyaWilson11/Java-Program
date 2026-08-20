package abstraction;

public class Class2 extends Class1 {
	

	public static void main(String[] args) { 		//call
		Class2 ob =new Class2();
		ob.get();
		ob.add(1,2);
		ob.method(13);

	}

	@Override
	public void method(int x) {			//ab to give essential details
		System.out.print(x);	
	}
public void get() {					//insm
	System.out.println("anu");
}
}
