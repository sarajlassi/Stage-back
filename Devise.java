package tn.bfi.spring.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class Devise {

	private int idDevise;
	private int decimale;
	private String nomDecimal;
	private String nom;
	private String nomTraduit;
	private int quotite;
	private Boolean certain;
	private String nomInternal;
	private CompteBancaire compteBancaire;
	
	@Id
	@GeneratedValue (strategy=GenerationType.IDENTITY)
	public int getIdDevise() {
		return idDevise;
	}
	public void setIdDevise(int idDevise) {
		this.idDevise = idDevise;
	}
	@Column(name="decimale")
	public int getDecimale() {
		return decimale;
	}
	public void setDecimale(int decimale) {
		this.decimale = decimale;
	}
	@Column(name="nomDecimal")
	public String getNomDecimal() {
		return nomDecimal;
	}
	public void setNomDecimal(String nomDecimal) {
		this.nomDecimal = nomDecimal;
	}
	@Column(name="nom")
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	@Column(name="nomTraduit")
	public String getNomTraduit() {
		return nomTraduit;
	}
	public void setNomTraduit(String nomTraduit) {
		this.nomTraduit = nomTraduit;
	}
	@Column(name="quotite")
	public int getQuotite() {
		return quotite;
	}
	public void setQuotite(int quotite) {
		this.quotite = quotite;
	}
	@Column(name="certain")
	public Boolean getCertain() {
		return certain;
	}
	public void setCertain(Boolean certain) {
		this.certain = certain;
	}
	@Column(name="nomInternal")
	public String getNomInternal() {
		return nomInternal;
	}
	public void setNomInternal(String nomInternal) {
		this.nomInternal = nomInternal;
	}
	@ManyToOne
	public CompteBancaire getCompteBancaire() {
		return compteBancaire;
	}
	public void setCompteBancaire(CompteBancaire compteBancaire) {
		this.compteBancaire = compteBancaire;
	}
	

}
