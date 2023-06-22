interface DaoInterface{
    int status = 100; //all interface var - by default public, static, final
}
class DaoImpl implements DaoInterface{

}
class Test{
    public static void main(String[] args){
        System.out.println(DaoImpl.status);
        DaoImpl a=new DaoImpl();
        System.out.println(a.status);
    }
}