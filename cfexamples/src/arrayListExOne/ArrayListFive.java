package arrayListExOne;

import java.util.ArrayList;

public class ArrayListFive {

	public static void main(String[] args) {
		
		ArrayList<String> al1=new ArrayList<String>();
		
		al1.add("Vignesh");
		al1.add("Mano");
		al1.add("Naveen");
		System.out.println(al1); //[Vignesh, Mano, Naveen]
								  //0          1      2
		
		System.out.println(al1.get(0));
		
		al1.set(0, "Vasu");
		System.out.print(al1);
		
	}

}
