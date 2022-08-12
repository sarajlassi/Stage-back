package tn.bfi.spring.entities;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;


@Entity
@Table(name="contrat")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "type_contrat", discriminatorType = DiscriminatorType.STRING)
@DiscriminatorValue("Contrat")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class Contrat {
	
	protected int idContrat;
	protected StatusContrat statusContrat;
	protected String reference;
	protected Boolean renevable;
	protected Date dateDebut;
	protected Date dateFin;
	protected Boolean active;
	protected String infoConvention;
	
	@Id
	@GeneratedValue (strategy=GenerationType.AUTO)
	public int getIdContrat() {
		return idContrat;
	}
	public void setIdContrat(int idContrat) {
		this.idContrat = idContrat;
	}
	@Column (name="status")
	public StatusContrat getStatusContrat() {
		return statusContrat;
	}
	public void setStatusContrat(StatusContrat statusContrat) {
		this.statusContrat = statusContrat;
	}
	@Column (name="reference")
	public String getReference() {
		return reference;
	}
	public void setReference(String reference) {
		this.reference = reference;
	}
	@Column (name="renevable")
	public Boolean getRenevable() {
		return renevable;
	}
	public void setRenevable(Boolean renevable) {
		this.renevable = renevable;
	}
	@Column (name="dateDebut")
	public Date getDateDebut() {
		return dateDebut;
	}
	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}
	@Column (name="dateFin")
	public Date getDateFin() {
		return dateFin;
	}
	public void setDateFin(Date dateFin) {
		this.dateFin = dateFin;
	}
	@Column (name="active")
	public Boolean getActive() {
		return active;
	}
	public void setActive(Boolean active) {
		this.active = active;
	}
	@Column (name="infoConvention")
	public String getInfoConvention() {
		return infoConvention;
	}
	public void setInfoConvention(String infoConvention) {
		this.infoConvention = infoConvention;
	}
	
	

}