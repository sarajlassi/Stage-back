package tn.bfi.spring.entities;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;


@Entity
@Table(name="soldeCompte")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class SoldeCompte {
	
	private int idSoldeCompte;
	private Date datePosition;
	private Date dateFin;
	private double montBloq;
	private double montDecouv;
	private double montMoratoire;
	private double creditMvt;
	private double debitMvt;
	private ContratCompte contratCompte;
	
	@Id
	@GeneratedValue (strategy=GenerationType.AUTO)
	public int getIdSoldeCompte() {
		return idSoldeCompte;
	}
	public void setIdSoldeCompte(int idSoldeCompte) {
		this.idSoldeCompte = idSoldeCompte;
	}
	@Column (name="datePosition")
	public Date getDatePosition() {
		return datePosition;
	}
	public void setDatePosition(Date datePosition) {
		this.datePosition = datePosition;
	}
	@Column (name="dateFin")
	public Date getDateFin() {
		return dateFin;
	}
	public void setDateFin(Date dateFin) {
		this.dateFin = dateFin;
	}
	@Column (name="montBloq")
	public double getMontBloq() {
		return montBloq;
	}
	public void setMontBloq(double montBloq) {
		this.montBloq = montBloq;
	}
	@Column (name="montDecouv")
	public double getMontDecouv() {
		return montDecouv;
	}
	public void setMontDecouv(double montDecouv) {
		this.montDecouv = montDecouv;
	}
	@Column (name="montMoratoire")
	public double getMontMoratoire() {
		return montMoratoire;
	}
	public void setMontMoratoire(double montMoratoire) {
		this.montMoratoire = montMoratoire;
	}
	@Column (name="creditMvt")
	public double getCreditMvt() {
		return creditMvt;
	}
	public void setCreditMvt(double creditMvt) {
		this.creditMvt = creditMvt;
	}
	@Column (name="debitMvt")
	public double getDebitMvt() {
		return debitMvt;
	}
	public void setDebitMvt(double debitMvt) {
		this.debitMvt = debitMvt;
	}
	@ManyToOne
	public ContratCompte getContratCompte() {
		return contratCompte;
	}
	public void setContratCompte(ContratCompte contratCompte) {
		this.contratCompte = contratCompte;
	}


	

}