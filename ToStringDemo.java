package chapter17;
class Box{
	double width,height,depth;
	Box(double w,double h, double d)
	{
		width=w;
		height=h;
		depth=d;
	}
	public String toString() {
		return "Demensions are " +width+" by "+depth+" by "+height+" . ";
	}
}
public class ToStringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Box b=new Box(2,8,10);
		String s="Box b : "+b;
		System.out.println(b);
		System.out.println(s);
		System.out.println("Example charAt Method....: "+s.charAt(10));

	}

}
