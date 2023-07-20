package setex;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SortEx {
		public static void main(String[] args) {
		    List marks=new ArrayList();
		    marks.add(96);
		    marks.add(97);
		    marks.add(37);
		    marks.add(36);
		    marks.add(1);
		    marks.add(3);
		    //before sorting
		    System.out.println(marks);
		    //after soring
		    Collections.sort(marks);
		    System.out.println(marks);
		    
			Set grades = new HashSet();
			grades.add(96);
			grades.add(97);
			grades.add(37);
			grades.add(36);
			grades.add(1);
			grades.add(3);
			
			System.out.println(grades);
			Collections.sort(grades);
		}
}
