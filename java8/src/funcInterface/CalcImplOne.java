package funcInterface;

@FunctionalInterface
interface CalcInterface{
		int sum(int a, int b);
		//int multi(int c,int d);
}
public class CalcImplOne {

	public static void main(String[] args) {
	CalcInterface obj=(a,b)->a+b;
	System.out.println(obj.sum(10, 20));

	}

}
