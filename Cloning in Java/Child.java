
public class Child implements Cloneable {
	
	private int id;


	@Override
	protected Child clone () throws CloneNotSupportedException {
		Child c0 = (Child) super.clone();
		return c0;
		
	}


	

	//auto generated code: 









	//getters and setters

	public Child (int id) {
		this.id = id;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
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
		Child other = (Child) obj;
		if (id != other.id)
			return false;
		return true;
	}




	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
