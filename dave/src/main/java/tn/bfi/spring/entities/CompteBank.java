package tn.bfi.spring.entities;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@Table(name="compteBank")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class CompteBank {
	
	private String numCompte;
	private String rib;
	private TypeCompte typeCompte;
	private String codeProduit;
	private String codeCategoryProduit;
	private Boolean active;
	private Date dateActivation;
	private Boolean ribInternal;
	private ContratCompte contratCompte;
	
	@Id
	public String getNumCompte() {
		return numCompte;
	}
	public void setNumCompte(String numCompte) {
		this.numCompte = numCompte;
	}
	@Column (name="rib")
	public String getRib() {
		return rib;
	}
	public void setRib(String rib) {
		this.rib = rib;
	}
	@Column (name="typeCompte")
	public TypeCompte getTypeCompte() {
		return typeCompte;
	}
	public void setTypeCompte(TypeCompte typeCompte) {
		this.typeCompte = typeCompte;
	}
	@Column (name="codeProduit")
	public String getCodeProduit() {
		return codeProduit;
	}
	public void setCodeProduit(String codeProduit) {
		this.codeProduit = codeProduit;
	}
	@Column (name="codeCategoryProduit")
	public String getCodeCategoryProduit() {
		return codeCategoryProduit;
	}
	public void setCodeCategoryProduit(String codeCategoryProduit) {
		this.codeCategoryProduit = codeCategoryProduit;
	}
	@Column (name="active")
	public Boolean getActive() {
		return active;
	}
	public void setActive(Boolean active) {
		this.active = active;
	}
	@Column (name="dateActivation")
	public Date getDateActivation() {
		return dateActivation;
	}
	public void setDateActivation(Date dateActivation) {
		this.dateActivation = dateActivation;
	}
	@Column (name="ribInternal")
	public Boolean getRibInternal() {
		return ribInternal;
	}
	public void setRibInternal(Boolean ribInternal) {
		this.ribInternal = ribInternal;
	}
	@ManyToOne
	public ContratCompte getContratCompte() {
		return contratCompte;
	}
	public void setContratCompte(ContratCompte contratCompte) {
		this.contratCompte = contratCompte;
	}
	
	

}