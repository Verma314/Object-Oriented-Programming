package packaged;


public class A {
	int value;
	B b; // = new B();
	C c; // = new C();
	public A(B b, C c){
		this.b = b;
		this.c = c;
		
	}
	
	
	public void execute(){
		b.execute();
		c.execute();
		System.out.println("config from beans: " + value);
		System.out.println("Executing A");
	}


	public int getValue() {
		return value;
	}


	public void setValue(int value) {
		this.value = value;
	}
	
}