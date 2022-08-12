package tn.bfi.spring.entities;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("ContratCreditPret")
public class CreditPret extends ContratCredit {
	
	private double tauxProgression;
	private Date datePremiereTranche;
	private boolean estReporte;
	private boolean estRenouvelable;
	private Date dateEmission;
	private Date dateExpiration;
	private boolean calAssurance;
	
	@Column (name="tauxProgression")
	public double getTauxProgression() {
		return tauxProgression;
	}
	public void setTauxProgression(double tauxProgression) {
		this.tauxProgression = tauxProgression;
	}
	
	@Column (name="datePremiereTranche")
	public Date getDatePremiereTranche() {
		return datePremiereTranche;
	}
	public void setDatePremiereTranche(Date datePremiereTranche) {
		this.datePremiereTranche = datePremiereTranche;
	}
	
	@Column (name="estReporte")
	public boolean isEstReporte() {
		return estReporte;
	}
	public void setEstReporte(boolean estReporte) {
		this.estReporte = estReporte;
	}
	
	@Column (name="estRenouvelable")
	public boolean isEstRenouvelable() {
		return estRenouvelable;
	}
	public void setEstRenouvelable(boolean estRenouvelable) {
		this.estRenouvelable = estRenouvelable;
	}
	
	@Column (name="dateEmission")
	public Date getDateEmission() {
		return dateEmission;
	}
	public void setDateEmission(Date dateEmission) {
		this.dateEmission = dateEmission;
	}
	
	@Column (name="dateExpiration")
	public Date getDateExpiration() {
		return dateExpiration;
	}
	public void setDateExpiration(Date dateExpiration) {
		this.dateExpiration = dateExpiration;
	}
	
	@Column (name="calAssurance")
	public boolean isCalAssurance() {
		return calAssurance;
	}
	public void setCalAssurance(boolean calAssurance) {
		this.calAssurance = calAssurance;
	}
	
	

}