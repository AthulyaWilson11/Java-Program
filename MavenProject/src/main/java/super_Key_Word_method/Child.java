package super_Key_Word_method;

public class Child extends Parent {

public void parent() {
	String name="rose";
	System.out.println(name);
}
public void get() {
	super.parent();
}
	public static void main(String[] args) {
		Child ob=new Child();
		ob.parent();
		ob.get();

	}

}
