package streamApiEx;

import java.util.ArrayList;
import java.util.List;

public class StreamAPIThree {

	public static void main(String[] args) {
		//10,20,30,40
		List<Integer> marks=new ArrayList<Integer>();
		marks.add(10);
		marks.add(20);
		marks.add(30);
		marks.add(40);
		
		for(Integer mark:marks) {
			System.out.println(mark+1);
		}

	}

}
