package Final;



public class Final_Key {

	int c=56;
	public Final_Key() {
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
		Final_Key o=new Final_Key();	//object //constructor
		System.out.println(o.c);	//instance
	}

}
