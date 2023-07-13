package arrayListExOne;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListEightDel {

	public static void main(String[] args) {
		
		ArrayList<String> enames=new ArrayList<String>();
		
		enames.add("Vignesh");//0
		enames.add("Mano"); //1
		enames.add("Naveen");//2
		enames.add("Vasu");//3
		enames.add("Praveen");
		enames.add("Sumanth");
		enames.add("AB");
		
		System.out.println(enames);
		enames.remove("AB");
		System.out.println(enames);
		enames.remove(2);
		enames.clear();
		System.out.println(enames);
	}

}
