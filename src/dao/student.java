package dao;


public class student {
	private int id;
	private String name;
	private String sex;
	private String xuehao;
	private String phone;
	private String xueyuan;
	private String major;
	private String zubie;
	 
	
	public student(int id,String name, String sex, String xuehao,String phone,String xueyuan,String major,String zubie) {
		super();
		this.id = id;
	    this.name = name;
	    this.sex = sex;
	    this.xuehao = xuehao;
	    this.phone = phone;
	    this.xueyuan = xueyuan;
	    this.major = major;
	    this.zubie = zubie;
	}
   
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public student() {
	    super();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getXuehao() {
		return xuehao;
	}
	public void setXuehao(String xuehao) {
		this.xuehao = xuehao;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getXueyuan() {
		return xueyuan;
	}
	public void setXueyuan(String xueyuan) {
		this.xueyuan = xueyuan;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public String getZubie() {
		return zubie;
	}
	public void setZubie(String zubie) {
		this.zubie = zubie;
	}
}
