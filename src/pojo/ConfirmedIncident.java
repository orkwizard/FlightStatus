package pojo;

public class ConfirmedIncident {

	private String 	publishedDate;
	private String message;
	public ConfirmedIncident() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getPublishedDate() {
		return publishedDate;
	}
	public void setPublishedDate(String publishedDate) {
		this.publishedDate = publishedDate;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	@Override
	public String toString() {
		return "ConfirmedIncident [publishedDate=" + publishedDate + ", message=" + message + "]";
	}
	
	
}
