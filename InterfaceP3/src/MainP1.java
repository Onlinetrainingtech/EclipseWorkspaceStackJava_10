
public class MainP1 {

	public static void main(String[] args) {
		
		EmployeeDAOImpl obj=new EmployeeDAOImpl();
		EmployeeModel   e1=new EmployeeModel();
		e1.setEmpid(1001);
		obj.addEmployee(e1.getEmpid());

	}

}
