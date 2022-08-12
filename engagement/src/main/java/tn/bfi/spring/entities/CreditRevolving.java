package tn.bfi.spring.entities;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;


@Entity
@DiscriminatorValue("ContratCreditRevolving")
public class CreditRevolving extends ContratCredit{
	
	private Date dateFin;
	private double apport;
	
	@Column (name="dateFin")
	public Date getDateFin() {
		return dateFin;
	}
	public void setDateFin(Date dateFin) {
		this.dateFin = dateFin;
	}
	
	@Column (name="apport")
	public double getApport() {
		return apport;
	}
	public void setApport(double apport) {
		this.apport = apport;
	}
	

}