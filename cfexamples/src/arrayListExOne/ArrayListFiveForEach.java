package arrayListExOne;

import java.util.ArrayList;

public class ArrayListFiveForEach {

	public static void main(String[] args) {
		
		ArrayList<String> enames=new ArrayList<String>();
		
		enames.add("Vignesh");
		enames.add("Mano");
		enames.add("Naveen");
		enames.add("Vasu");
		enames.add("Praveen");
		enames.add("Sumanth");
		
		for(String ename:enames) {
			System.out.println(ename);
		}
		
	}

}
