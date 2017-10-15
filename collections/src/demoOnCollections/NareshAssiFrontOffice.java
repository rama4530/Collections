package demoOnCollections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NareshAssiFrontOffice {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<NareshAssiEmpoyee> l=new ArrayList<NareshAssiEmpoyee>();
		System.out.println("Enter the number of New Employees");
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		System.out.println(n);
		for(int i=0;i<n;i++){
			System.out.println("Enter employee"+(i+1)+"Empno,Name,JOB,SALAry in order");
			NareshAssiEmpoyee e=new NareshAssiEmpoyee();
			e.empno=input.nextInt();
			e.ename=input.next();
			e.job=input.next();
			e.sal=input.nextDouble();
			l.add(e);
		}
		NareshAssiMainOffice M=new NareshAssiMainOffice();
		M.addEmployees(l);
	}
}
