package tn.bfi.spring.entities;

import java.sql.Date;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class CompteBancaire {
	
	private String numCpt;
	private Boolean cloture;
	private Date dateCLoture;
	private String rib;
	private String description;
	private double soldeReel;
	private TypeCompte typeCompte;
	private Client client;
	private Collection<Agence> agence;
	private Collection<Devise> devise;
	
	@Id
	public String getNumCpt() {
		return numCpt;
	}
	public void setNumCpt(String numCpt) {
		this.numCpt = numCpt;
	}
	
	@Column(name="cloture")
	public Boolean getCloture() {
		return cloture;
	}
	public void setCloture(Boolean cloture) {
		this.cloture = cloture;
	}
	@Column(name="dateCloture")
	public Date getDateCLoture() {
		return dateCLoture;
	}
	public void setDateCLoture(Date dateCLoture) {
		this.dateCLoture = dateCLoture;
	}
	
	@Column(name="rib")
	public String getRib() {
		return rib;
	}
	public void setRib(String rib) {
		this.rib = rib;
	}
	@Column(name="description")
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Column(name="soldeReel")
	public double getSoldeReel() {
		return soldeReel;
	}
	public void setSoldeReel(double soldeReel) {
		this.soldeReel = soldeReel;
	}
	@Column(name="typeCompte")
	public TypeCompte getTypeCompte() {
		return typeCompte;
	}
	public void setTypeCompte(TypeCompte typeCompte) {
		this.typeCompte = typeCompte;
	}
	@ManyToOne
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}
	@JsonIgnore
	@ManyToMany
	public Collection<Agence> getAgence() {
		return agence;
	}
	public void setAgence(Collection<Agence> agence) {
		this.agence = agence;
	}
	@JsonIgnore
	@OneToMany(mappedBy = "compteBancaire")
	public Collection<Devise> getDevise() {
		return devise;
	}
	public void setDevise(Collection<Devise> devise) {
		this.devise = devise;
	}
	

}
