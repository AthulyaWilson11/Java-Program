package finalKeyword;

public class Final_key_Class {

	int c=56;
	public Final_key_Class() {
		c=57;
		System.out.println(c);
	}
	public static void main(String[] args) {
		
		int a=12;
		a=23;
		final int b=13;
	// 	b=45;
		System.out.println(a);
		System.out.println(b);
		Final_key_Class o=new Final_key_Class();	//object //constructor
		System.out.println(o.c);	//instance
	}

}
