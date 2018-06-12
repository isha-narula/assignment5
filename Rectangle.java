
public class Rectangle {

	public static void main(String[] args) {
		
		Rect r1 = new Rect();
		r1.display();
		

	}
}
	class Rect{
		int l;
		int b;
		
		Rect()
		{
			l=10;
			b=20;
		}
		void display()
		{
			System.out.print(l*b);
		}
	}
