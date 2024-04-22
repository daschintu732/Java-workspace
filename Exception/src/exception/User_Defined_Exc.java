package exception;

public class User_Defined_Exc {

	public static void main(String[] args) throws Exception {

		User_Defined_Exc exception = new User_Defined_Exc();
		exception.getData(104);
	}

	public void getData(int a) throws Exception{
		
		if(a<100)
			System.out.println("Get Data From DB");
		else
			throw new Exception("Invalid ID");
	}

}
