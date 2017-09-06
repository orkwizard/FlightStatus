package pojo;

public class UpdatedDateField {

	private String field;
	private String originalDateLocal;
	private String newDateLocal;
	
	public UpdatedDateField() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getField() {
		return field;
	}

	public void setField(String field) {
		this.field = field;
	}

	public String getOriginalDateLocal() {
		return originalDateLocal;
	}

	public void setOriginalDateLocal(String originalDateLocal) {
		this.originalDateLocal = originalDateLocal;
	}

	public String getNewDateLocal() {
		return newDateLocal;
	}

	public void setNewDateLocal(String newDateLocal) {
		this.newDateLocal = newDateLocal;
	}

	@Override
	public String toString() {
		return "UpdatedDateField [field=" + field + ", originalDateLocal=" + originalDateLocal + ", newDateLocal="
				+ newDateLocal + "]";
	}
	
	
	
}
