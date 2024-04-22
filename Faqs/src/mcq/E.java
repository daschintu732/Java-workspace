package mcq;

public class E {

	public static void main(String[] args) {
		System.out.println("start ");
		meth1();
		System.out.println("end");
	}

	static void meth1() {
		int p;

		try {
			p = 10;
			System.out.println(p);
			p = 20;
			
		} catch (Exception e) {
			//System.out.println(p);//CE because local variable not initialize
		}
	}
}