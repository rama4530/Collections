package demoOnCollections;

import java.util.ArrayList;
import java.util.List;

public class MainOffice {
	static List<Empoyee1> AllEmployees=new ArrayList<Empoyee1>();
	void addEmployees(List l){
		for (Object object : l) {
			AllEmployees.add((Empoyee1) object);
		}
		System.out.println();
		for (Empoyee1 nareshAssiEmpoyee : AllEmployees) {
			System.out.println("In main Office");
			System.out.println(nareshAssiEmpoyee.empno+" "+nareshAssiEmpoyee.ename+" "+nareshAssiEmpoyee.job+" "+nareshAssiEmpoyee.sal);
		}
	}
}
