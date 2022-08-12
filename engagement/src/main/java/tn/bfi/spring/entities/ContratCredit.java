package tn.bfi.spring.entities;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;


@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "type_credit", discriminatorType = DiscriminatorType.STRING)
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
@DiscriminatorValue("ContratCredit")
public class ContratCredit extends Contrat {
	
	protected double riskInterneEncouru;
	protected double riskLegalEncouru;
	protected String ribCompte;
	protected double montantAffecte;
	protected boolean changeClasse;
	protected Date dateSituation;
	protected boolean reclassementManuel;
	
	
	@Column (name="riskInterneEncouru")
	public double getRiskInterneEncouru() {
		return riskInterneEncouru;
	}
	public void setRiskInterneEncouru(double riskInterneEncouru) {
		this.riskInterneEncouru = riskInterneEncouru;
	}
	
	@Column (name="riskLegalEncouru")
	public double getRiskLegalEncouru() {
		return riskLegalEncouru;
	}
	public void setRiskLegalEncouru(double riskLegalEncouru) {
		this.riskLegalEncouru = riskLegalEncouru;
	}
	
	@Column (name="ribCompte")
	public String getRibCompte() {
		return ribCompte;
	}
	public void setRibCompte(String ribCompte) {
		this.ribCompte = ribCompte;
	}
	
	@Column (name="montantAffecte")
	public double getMontantAffecte() {
		return montantAffecte;
	}
	public void setMontantAffecte(double montantAffecte) {
		this.montantAffecte = montantAffecte;
	}
	
	@Column (name="changeClasse")
	public boolean isChangeClasse() {
		return changeClasse;
	}
	public void setChangeClasse(boolean changeClasse) {
		this.changeClasse = changeClasse;
	}
	
	@Column (name="dateSituation")
	public Date getDateSituation() {
		return dateSituation;
	}
	public void setDateSituation(Date dateSituation) {
		this.dateSituation = dateSituation;
	}
	
	@Column (name="reclassementManuel")
	public boolean isReclassementManuel() {
		return reclassementManuel;
	}
	public void setReclassementManuel(boolean reclassementManuel) {
		this.reclassementManuel = reclassementManuel;
	}
	
	

}