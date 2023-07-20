package funcInterface;


interface Calc{
	public abstract		int sum(int a, int b);
}

public class CalcImpl  implements Calc {
	
	public int sum(int a, int b) {
		
		return a+b;
	}
	public static void main(String[] args) {
		Calc	ref=new CalcImpl();
			System.out.println(ref.sum(10,20));
	}

	

}
