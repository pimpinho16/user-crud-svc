package com.service.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="svc_usr_user")
public class SvcUsrUser implements java.io.Serializable{
	
	@Id
	@GeneratedValue
	private Integer usrId;
	private String usrFirstName;
	private String usrLastName;
	private Integer usrAge;
	private Date usrCreateDate;
	@Column(name="usrId")
	public Integer getUsrId() {
		return usrId;
	}
	public void setUsrId(Integer usrId) {
		this.usrId = usrId;
	}
	@Column(name="usrFirstName")
	public String getUsrFirstName() {
		return usrFirstName;
	}
	public void setUsrFirstName(String usrFirstName) {
		this.usrFirstName = usrFirstName;
	}
	@Column(name="usrLastName")
	public String getUsrLastName() {
		return usrLastName;
	}
	public void setUsrLastName(String usrLastName) {
		this.usrLastName = usrLastName;
	}
	@Column(name="usrAge")
	public Integer getUsrAge() {
		return usrAge;
	}
	public void setUsrAge(Integer usrAge) {
		this.usrAge = usrAge;
	}
	@Column(name="usrCreateDate")
	public Date getUsrCreateDate() {
		return usrCreateDate;
	}
	public void setUsrCreateDate(Date usrCreateDate) {
		this.usrCreateDate = usrCreateDate;
	}
	
	
	

}
