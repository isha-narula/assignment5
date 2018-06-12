
public class ComplexNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		complex c1 = new complex();
		c1.display();

	}

}
class complex{
	
	int r;
	int i;
    complex()
	{
		r=10;
		i=20;
	}
	void display()
	{
		System.out.print(r);
		System.out.print("+");
		System.out.print(i);
		System.out.print("i");
		
	}
}
	

