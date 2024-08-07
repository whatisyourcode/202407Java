package webProject;

public class UserDTO {
	private int id;
	private String name;
	private String password;
	private String tel;
	private String gender;
	private String address;
	
	public UserDTO(int id, String name, String password, String tel, String gender, String address) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
		this.tel = tel;
		this.gender = gender;
		this.address = address;
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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getGender() {
		return gender;
	}

	public void setgender(String gender) {
		this.gender = gender;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "UserDTO [id=" + id + ", name=" + name + ", password=" + password + ", tel=" + tel + ", gender=" + gender
				+ ", address=" + address + "]";
	}
}
