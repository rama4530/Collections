package demoOnCollections;

import java.util.ArrayList;
import java.util.List;

public class NareshAssiMainOffice {
	static List<NareshAssiEmpoyee> AllEmployees=new ArrayList<NareshAssiEmpoyee>();
	void addEmployees(List l){
		for (Object object : l) {
			AllEmployees.add((NareshAssiEmpoyee) object);
		}
		System.out.println();
		for (NareshAssiEmpoyee nareshAssiEmpoyee : AllEmployees) {
			System.out.println("In main Office");
			System.out.println(nareshAssiEmpoyee.empno+" "+nareshAssiEmpoyee.ename+" "+nareshAssiEmpoyee.job+" "+nareshAssiEmpoyee.sal);
		}
	}
}
