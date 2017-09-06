package pojo;

public class UpdatedTextField {

	private String field;
	private String originalText;
	private String newText;
	
	public UpdatedTextField() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getField() {
		return field;
	}

	public void setField(String field) {
		this.field = field;
	}

	public String getOriginalText() {
		return originalText;
	}

	public void setOriginalText(String originalText) {
		this.originalText = originalText;
	}

	public String getNewText() {
		return newText;
	}

	public void setNewText(String newText) {
		this.newText = newText;
	}

	@Override
	public String toString() {
		return "UpdatedTextField [field=" + field + ", originalText=" + originalText + ", newText=" + newText + "]";
	}
	
	
	
}
