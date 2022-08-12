package tn.bfi.spring.entities;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;



@Entity
@DiscriminatorValue("ClientMor")
public class ClientMoral extends Client {
	
	private String matricule;
	private Date dateCreation;
	private String libLong;
	private String libCou;
	
	@Column(name="matricule")
	public String getMatricule() {
		return matricule;
	}
	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}
	
	@Column(name="dateCreation")
	public Date getDateCreation() {
		return dateCreation;
	}
	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}
	
	@Column(name="libLong")
	public String getLibLong() {
		return libLong;
	}
	public void setLibLong(String libLong) {
		this.libLong = libLong;
	}
	@Column(name="libCou")
	public String getLibCou() {
		return libCou;
	}
	public void setLibCou(String libCou) {
		this.libCou = libCou;
	}
	
	

}
