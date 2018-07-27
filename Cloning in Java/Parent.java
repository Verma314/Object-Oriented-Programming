import java.util.ArrayList;
import java.util.List;

public class Parent implements Cloneable {
	
	private String name;
	private Child child;
	private List<Child> childList;
	
	public Parent (String name, int id) {
		this.name = new String(name); 
		this.child = new Child(id);
		
		childList = new ArrayList<>();
		
		int i = 1000;
		while ( i --> 0 ) {
			childList.add(new Child(i));
		}
	}
	
	
	
	
	
	
	public List<Child> getChildLists() {
		return childList;
	}


	public void setChildLists(List<Child> childLists) {
		this.childList = childLists;
	}


	public Parent (Parent p1) {
		this.name = p1.getName();
		this.child = p1.getChild();
		this.childList = p1.getChildLists();
		
	}
	
	


	@Override
	protected Parent clone () throws CloneNotSupportedException {
		Parent p0 = (Parent) super.clone();
		
		ArrayList<Child> childList = (ArrayList<Child>)p0.getChildLists();
		ArrayList<Child> clonedChildList =(ArrayList<Child>)childList.clone();
		
		p0.setChildLists(clonedChildList );
		p0.setChild(child.clone());
		return p0;
		
	}


	
	
	//auto generated code: 
	public String getName() {
		return name;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((child == null) ? 0 : child.hashCode());
		result = prime * result + ((childList == null) ? 0 : childList.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}






	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Parent other = (Parent) obj;
		if (child == null) {
			if (other.child != null)
				return false;
		} else if (!child.equals(other.child))
			return false;
		if (childList == null) {
			if (other.childList != null)
				return false;
		} else if (!childList.equals(other.childList))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}






	public void setName(String name) {
		this.name = name;
	}


	public Child getChild() {
		return child;
	}


	public void setChild(Child child) {
		this.child = child;
	}

	
}
