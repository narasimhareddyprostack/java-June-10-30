import java.util.ArrayList;

public class OptionalEx {

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		al.add("Rahul");
		al.add("Sonai");
		
		al.add("Priya");
		al.add(null);
		
		String ename = null;
		//System.out.println(ename.length());
		
		for(String ele:al) {
			
			System.out.println(ele.toUpperCase());
		}

	}

}
