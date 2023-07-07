class Test{
        public static void main(String[] args){

            int a = 10;

            Integer i1 = a; //auto-boxing

            
            System.out.println(i1.byteValue());  //10
            System.out.println(i1.shortValue()); //10
            System.out.println(i1.intValue());   //10
            //System.out.println(i1.booleanValue()); //true
            System.out.println(i1.floatValue());    //10.0




        }

}