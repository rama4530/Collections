package demoOnCollections;

import java.util.SortedSet;

public class person {
	 private int id;
	 private String name;
	public person(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "person [id=" + id + ", name=" + name + "]";
	}
	@Override
	public int hashCode() {
		return this.id;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj!=null && obj instanceof person){
			int id=((person)obj).getId();
			if(id==this.id){
				return true;
			}
		}
		return false;
	}
	

}
