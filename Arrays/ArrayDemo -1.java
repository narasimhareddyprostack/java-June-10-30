class ArrayDemo{
		public static void main(String[] args){
			int[] ids;
			ids=new int[4];
			
			System.out.println(ids[0]);
			System.out.println(ids[1]);
			System.out.println(ids[2]);
			System.out.println(ids[3]);
			ids[0] =101;
			ids[1] = 102;
			ids[2] = 103;
			System.out.println(ids[0]);
			System.out.println(ids[1]);
			System.out.println(ids[2]);
			System.out.println(ids[3]);
		}
}