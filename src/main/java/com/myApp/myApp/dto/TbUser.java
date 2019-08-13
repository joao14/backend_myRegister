package com.myApp.myApp.dto;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author JOAO
 */
@Entity
@Table(name = "tb_user")
@XmlRootElement
public class TbUser implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name = "user_identification")
	private String userIdentification;
	@Basic(optional = false)
	@Column(name = "user_typeiden")
	private Character userTypeiden;
	@Basic(optional = false)
	@Column(name = "user_name")
	private String userName;
	@Basic(optional = false)
	@Column(name = "user_lastname")
	private String userLastname;
	@Basic(optional = false)
	@Column(name = "user_email")
	private String userEmail;
	@Basic(optional = false)
	@Column(name = "user_phone")
	private String userPhone;
	@Column(name = "user_cellphone")
	private String userCellphone;
	@Column(name = "user_address")
	private String userAddress;
	@Basic(optional = false)
	@Column(name = "user_gender")
	private Character userGender;
	@Column(name = "user_birthday")
	@Temporal(TemporalType.DATE)
	private Date userBirthday;
		

	public TbUser() {
	}	

	public TbUser(String userIdentification, Character userTypeiden, String userName, String userLastname,
			String userEmail, String userPhone, String userCellphone, String userAddress, Character userGender,
			Date userBirthday) {
		super();
		this.userIdentification = userIdentification;
		this.userTypeiden = userTypeiden;
		this.userName = userName;
		this.userLastname = userLastname;
		this.userEmail = userEmail;
		this.userPhone = userPhone;
		this.userCellphone = userCellphone;
		this.userAddress = userAddress;
		this.userGender = userGender;
		this.userBirthday = userBirthday;
	}





	public String getUserIdentification() {
		return userIdentification;
	}



	public void setUserIdentification(String userIdentification) {
		this.userIdentification = userIdentification;
	}



	public Character getUserTypeiden() {
		return userTypeiden;
	}



	public void setUserTypeiden(Character userTypeiden) {
		this.userTypeiden = userTypeiden;
	}



	public String getUserName() {
		return userName;
	}



	public void setUserName(String userName) {
		this.userName = userName;
	}



	public String getUserLastname() {
		return userLastname;
	}



	public void setUserLastname(String userLastname) {
		this.userLastname = userLastname;
	}



	public String getUserEmail() {
		return userEmail;
	}



	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}



	public String getUserPhone() {
		return userPhone;
	}



	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}



	public String getUserCellphone() {
		return userCellphone;
	}



	public void setUserCellphone(String userCellphone) {
		this.userCellphone = userCellphone;
	}



	public String getUserAddress() {
		return userAddress;
	}



	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}



	public Character getUserGender() {
		return userGender;
	}



	public void setUserGender(Character userGender) {
		this.userGender = userGender;
	}



	public Date getUserBirthday() {
		return userBirthday;
	}



	public void setUserBirthday(Date userBirthday) {
		this.userBirthday = userBirthday;
	}



	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	
	
	

	

}

