package rentIt.Spring.BO;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "User_Master")
public class RegisterUserBO {
	@Id
	@Column(name="Mobile_no")
	private String mobileNumber;
	@Column(name="User_name")
	private String userName;
	@Column(name="email")
	private String emailId;
	@Column(name="State")
	private String state;
	@Column(name="district")
	private String district;
	@Column(name="Village")
	private String village;
	@Column(name="Pincode")
	private String pincode;
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}


}
