package tn.bfi.spring.entities;

import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class Pays {
	
	private int idPays;
	private String codeTelephoniqueRegional;
	private String nom;
	private String codeNumerique;
	private String nomTraduit;
	private String nationalite;
	private Boolean conventionFiscale;
	private Boolean embargo;
	private Collection<Client> client;
	
	@Id
	@GeneratedValue (strategy=GenerationType.IDENTITY)
	public int getIdPays() {
		return idPays;
	}
	public void setIdPays(int idPays) {
		this.idPays = idPays;
	}
	@Column(name="codeTelephoniqueRegional")
	public String getCodeTelephoniqueRegional() {
		return codeTelephoniqueRegional;
	}
	public void setCodeTelephoniqueRegional(String codeTelephoniqueRegional) {
		this.codeTelephoniqueRegional = codeTelephoniqueRegional;
	}
	@Column(name="nom")
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	@Column(name="codeNumerique")
	public String getCodeNumerique() {
		return codeNumerique;
	}
	public void setCodeNumerique(String codeNumerique) {
		this.codeNumerique = codeNumerique;
	}
	@Column(name="nomTraduit")
	public String getNomTraduit() {
		return nomTraduit;
	}
	public void setNomTraduit(String nomTraduit) {
		this.nomTraduit = nomTraduit;
	}
	@Column(name="nationalite")
	public String getNationalite() {
		return nationalite;
	}
	public void setNationalite(String nationalite) {
		this.nationalite = nationalite;
	}
	@Column(name="conventionFiscale")
	public Boolean getConventionFiscale() {
		return conventionFiscale;
	}
	public void setConventionFiscale(Boolean conventionFiscale) {
		this.conventionFiscale = conventionFiscale;
	}
	@Column(name="embargo")
	public Boolean getEmbargo() {
		return embargo;
	}
	public void setEmbargo(Boolean embargo) {
		this.embargo = embargo;
	}
	@JsonIgnore
	@OneToMany(mappedBy = "pays")
	public Collection<Client> getClient() {
		return client;
	}
	public void setClient(Collection<Client> client) {
		this.client = client;
	}
	

}
