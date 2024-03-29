package in.ineuron.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="STDTAB")
public class Student {
	
	@Id
	@Column(name="stdId")
	private int sid;
	
	@Column(name="stdName", length=20)
	private String sname;
	
	@Column(name="stdAge")
	private int sage;
	
	@Column(name="stdAddress", length=20)
	private String saddress;
	
	

	public Student() {
		System.out.println("Zero Parameter Constructor used by hibernate");
	}
	
	public int getSid() {
		return sid;
	}




	public void setSid(int sid) {
		this.sid = sid;
	}




	public String getSname() {
		return sname;
	}




	public void setSname(String sname) {
		this.sname = sname;
	}




	public int getSage() {
		return sage;
	}




	public void setSage(int sage) {
		this.sage = sage;
	}




	public String getSaddress() {
		return saddress;
	}




	public void setSaddress(String saddress) {
		this.saddress = saddress;
	}




	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", sage=" + sage + ", saddress=" + saddress + "]";
	}
	
	
	
}
