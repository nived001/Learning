package learning;

public class Cons {
	
	double h,l,w;
	public Cons() {
		h=-1;
		l=-1;
		w=-1;
	}
	public Cons(double l) {
		this.h=l;
		this.w=l;
		this.l=l;
	}
	public Cons(double l, double w, double h) {
		this.h=h;
		this.w=w;
		this.l=l;
	}
	public void volume() {
		System.out.println("-1.0");
	}
public void volume(double le) {
		System.out.println(le*le*le);
	}
public void volume(double he,double wi,double le) {
	System.out.println(he*le*wi);
}

	public static void main(String[] args) {
		
		if(args.length==0) {
		Cons b0 = new Cons();
		b0.volume();
		}if(args.length==1) {
			double a=Double.parseDouble(args[0]);
		Cons b1 = new Cons(a);
		b1.volume(a);}
		if(args.length==3) {
			double a=Double.parseDouble(args[0]);
			double b=Double.parseDouble(args[1]);
			double c=Double.parseDouble(args[2]);
		Cons b2 = new Cons(a,b,c);
		b2.volume(a, b, c);}
		
		/*java.util.Date cu = new java.util.Date();
		StringBuilder s = new StringBuilder("Hello hava");

		System.out.println(s.delete(0, 6));*/
		/*Integer i = new Integer(1)+ new Integer(2);
		switch(i) {
		case 3:
			System.out.println("three");
			break;
			default:
				System.out.println("other");
				break;
		}*/
	}
	/*
	 * private String name; private int age; public Cons(String n, int a) {
	 * this.name=n; this.age=a; } public void setName(String name) { this.name=name;
	 * } public String getName() { return name; } public void setAge(int age) {
	 * this.age=age; } public void display() { System.out.println(name);
	 * System.out.println(age); } public int getAge() { return age; }
	 * 
	 * public static void main(String[] args) { // TODO Auto-generated method stub
	 * Cons c= new Cons("test",12); Cons c1=new Cons("t",34); c.display();
	 * c1.display(); c.getAge(); System.out.println(c1.getName()); }
	 */
}
