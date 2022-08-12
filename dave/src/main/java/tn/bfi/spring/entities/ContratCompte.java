package tn.bfi.spring.entities;


import java.sql.Date;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@DiscriminatorValue("ContratCompte")
public class ContratCompte extends Contrat {
	private String numCompte;
	private Date dateCloture;
	private String typeSignature;
	private Date dateActivation;
	private Boolean renouvelable;
	private Boolean confirme;
	private Date dateCreation;
	private Collection<SoldeCompte> soldeCompte;
	private Collection<CompteBank> compteBank;


	public String getNumCompte() {
		return numCompte;
	}
	public void setNumCompte(String numCompte) {
		this.numCompte = numCompte;
	}
	@Column (name="dateCloture")
	public Date getDateCloture() {
		return dateCloture;
	}
	public void setDateCloture(Date dateCloture) {
		this.dateCloture = dateCloture;
	}
	@Column (name="typeSignature")
	public String getTypeSignature() {
		return typeSignature;
	}
	public void setTypeSignature(String typeSignature) {
		this.typeSignature = typeSignature;
	}
	@Column (name="dateActivation")
	public Date getDateActivation() {
		return dateActivation;
	}
	public void setDateActivation(Date dateActivation) {
		this.dateActivation = dateActivation;
	}
	@Column (name="renouvelable")
	public Boolean getRenouvelable() {
		return renouvelable;
	}
	public void setRenouvelable(Boolean renouvelable) {
		this.renouvelable = renouvelable;
	}
	@Column (name="confirme")
	public Boolean getConfirme() {
		return confirme;
	}
	public void setConfirme(Boolean confirme) {
		this.confirme = confirme;
	}
	@Column (name="dateCreation")
	public Date getDateCreation() {
		return dateCreation;
	}
	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}
	@JsonIgnore
	@OneToMany(mappedBy = "contratCompte")
	public Collection<SoldeCompte> getSoldeCompte() {
		return soldeCompte;
	}
	public void setSoldeCompte(Collection<SoldeCompte> soldeCompte) {
		this.soldeCompte = soldeCompte;
	}
	@JsonIgnore
	@OneToMany(mappedBy = "contratCompte")
	public Collection<CompteBank> getCompteBank() {
		return compteBank;
	}
	public void setCompteBank(Collection<CompteBank> compteBank) {
		this.compteBank = compteBank;
	}
	
}