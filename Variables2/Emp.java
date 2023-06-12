class Emp{
            int emp_Id=101;
            String emp_Name="Rahul";
    static String emp_Org ="TCS";

    public static void main(String[] args){

        Emp e1 =new Emp();
        Emp e2 =new Emp();
        System.out.println(emp_Org);
        System.out.println(Emp.emp_Org);
        System.out.println(e1.emp_Org);
        System.out.println(e2.emp_Org);

    }
}