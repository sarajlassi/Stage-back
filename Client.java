package tn.bfi.spring.entities;

import java.util.Collection;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "type_client", discriminatorType = DiscriminatorType.STRING)
@DiscriminatorValue("Client")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class Client {

	protected int idClient;
	protected Collection<Contact> contact;
	protected Collection<CompteBancaire>compteBancaire;
	protected Collection<Agence> agence;
	protected Pays pays;
	@Id
	@GeneratedValue (strategy=GenerationType.IDENTITY)
	public int getIdClient() {
		return idClient;
	}

	public void setIdClient(int idClient) {
		this.idClient = idClient;
	}
	@JsonIgnore
	@OneToMany(mappedBy = "client")
	public Collection<Contact> getContact() {
		return contact;
	}

	public void setContact(Collection<Contact> contact) {
		this.contact = contact;
	}
	@JsonIgnore
	@OneToMany(mappedBy = "client")
	public Collection<CompteBancaire> getCompteBancaire() {
		return compteBancaire;
	}

	public void setCompteBancaire(Collection<CompteBancaire> compteBancaire) {
		this.compteBancaire = compteBancaire;
	}
	@JsonIgnore
	@ManyToMany
	public Collection<Agence> getAgence() {
		return agence;
	}

	public void setAgence(Collection<Agence> agence) {
		this.agence = agence;
	}
	@ManyToOne
	public Pays getPays() {
		return pays;
	}

	public void setPays(Pays pays) {
		this.pays = pays;
	}
	
	
}
