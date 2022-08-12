package tn.bfi.spring.entities;

import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="agence")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class Agence {
	
	private int idAgence;
	private String codeInterne;
	private String libCou;
	private String libLong;
	private Collection<Contact> contact;
	private Collection<Client> client;
	private Collection<CompteBancaire> compteBancaire;
	
	@Id
	@GeneratedValue
	public int getIdAgence() {
		return idAgence;
	}
	public void setIdAgence(int idAgence) {
		this.idAgence = idAgence;
	}
	
	@Column (name="codeInterne")
	public String getCodeInterne() {
		return codeInterne;
	}
	public void setCodeInterne(String codeInterne) {
		this.codeInterne = codeInterne;
	}
	
	@Column (name="libCou")
	public String getLibCou() {
		return libCou;
	}
	public void setLibCou(String libCou) {
		this.libCou = libCou;
	}
	
	@Column (name="libLong")
	public String getLibLong() {
		return libLong;
	}
	public void setLibLong(String libLong) {
		this.libLong = libLong;
	}
	@JsonIgnore
	@OneToMany(mappedBy = "agence")
	public Collection<Contact> getContact() {
		return contact;
	}
	public void setContact(Collection<Contact> contact) {
		this.contact = contact;
	}
	@JsonIgnore
	@ManyToMany(mappedBy = "agence")
	public Collection<Client> getClient() {
		return client;
	}
	public void setClient(Collection<Client> client) {
		this.client = client;
	}
	@JsonIgnore	
	@ManyToMany(mappedBy = "agence")
	public Collection<CompteBancaire> getCompteBancaire() {
		return compteBancaire;
	}
	public void setCompteBancaire(Collection<CompteBancaire> compteBancaire) {
		this.compteBancaire = compteBancaire;
	}
	
	

}
