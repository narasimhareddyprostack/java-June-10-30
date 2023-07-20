package funcInterface;

@FunctionalInterface
interface DaoInteface{
	public abstract void login();
	//void logout();
	
}

public class DaoImpl implements DaoInteface {
	@Override
	public void login() {
		System.out.println("Login Successfull");
		
	}
	public static void main(String[] args) {
		DaoImpl	dao=new DaoImpl();
		dao.login();
	}

	

}
