package demoOnCollections;

import java.util.ArrayList;
import java.util.List;

public class MainOffice {
	static List<Empoyee> AllEmployees=new ArrayList<Empoyee>();
	void addEmployees(List l){
		for (Object object : l) {
			AllEmployees.add((Empoyee) object);
		}
		System.out.println();
		for (Empoyee nareshAssiEmpoyee : AllEmployees) {
			System.out.println("In main Office");
			System.out.println(nareshAssiEmpoyee.empno+" "+nareshAssiEmpoyee.ename+" "+nareshAssiEmpoyee.job+" "+nareshAssiEmpoyee.sal);
		}
	}
}
