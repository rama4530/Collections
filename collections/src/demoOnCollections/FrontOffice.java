package demoOnCollections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FrontOffice {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Empoyee1> l=new ArrayList<Empoyee1>();
		System.out.println("Enter the number of New Employees");
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		System.out.println(n);
		for(int i=0;i<n;i++){
			System.out.println("Enter employee"+(i+1)+"Empno,Name,JOB,SALAry in order");
			Empoyee1 e=new Empoyee1();
			e.empno=input.nextInt();
			e.ename=input.next();
			e.job=input.next();
			e.sal=input.nextDouble();
			l.add(e);
		}
		MainOffice M=new MainOffice();
		M.addEmployees(l);
	}
}
