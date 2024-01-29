package firstSpringApplication;

public class SimpleBean {

	private long id;
	private String name;
	private String eMail;

	public SimpleBean() {

	}

	public SimpleBean(long id, String name, String eMail) {

		this.id = id;
		this.name = name;
		this.eMail = eMail;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String geteMail() {
		return eMail;
	}

	public void seteMail(String eMail) {
		this.eMail = eMail;
	}

	@Override
	public String toString() {
		return "SimpleBean [id: " + id + ", name: " + name + ", E-mail: " + eMail + "]";
	}

}
