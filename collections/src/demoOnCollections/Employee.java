package demoOnCollections;

import java.util.Comparator;

public class Employee {
    private String name;
    private int age;
    private double salary;
    private long mobile;
 
    public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public Employee(String name, int age, double salary, long mobile) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.mobile = mobile;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
}
