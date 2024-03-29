package com.inkubator.hrm.entity;
// Generated Jun 17, 2014 4:36:40 PM by Hibernate Tools 3.6.0


import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;
import javax.persistence.Version;

/**
 * GolonganJabatan generated by hbm2java
 */
@Entity
@Table(name="golongan_jabatan"
    ,catalog="hrm"
    , uniqueConstraints = @UniqueConstraint(columnNames="code") 
)
public class GolonganJabatan  implements java.io.Serializable {


     private long id;
     private Integer version;
     private Pangkat pangkat;
     private String code;
     private Boolean overtime;
     private String createdBy;
     private Date createdOn;
     private String updatedBy;
     private Date updatedOn;
     private Set<Jabatan> jabatans = new HashSet<Jabatan>(0);
     private Set<TravelComponentCostRate> travelComponentCostRates = new HashSet<TravelComponentCostRate>(0);

    public GolonganJabatan() {
    }

	
    public GolonganJabatan(long id) {
        this.id = id;
    }
    public GolonganJabatan(long id, Pangkat pangkat, String code, Boolean overtime, String createdBy, Date createdOn, String updatedBy, Date updatedOn, Set<Jabatan> jabatans, Set<TravelComponentCostRate> travelComponentCostRates) {
       this.id = id;
       this.pangkat = pangkat;
       this.code = code;
       this.overtime = overtime;
       this.createdBy = createdBy;
       this.createdOn = createdOn;
       this.updatedBy = updatedBy;
       this.updatedOn = updatedOn;
       this.jabatans = jabatans;
       this.travelComponentCostRates = travelComponentCostRates;
    }
   
    @Id 
    @Column(name="id", unique=true, nullable=false)
    public long getId() {
        return this.id;
    }
    
    public void setId(long id) {
        this.id = id;
    }

    @Version
    @Column(name="version")
    public Integer getVersion() {
        return this.version;
    }
    
    public void setVersion(Integer version) {
        this.version = version;
    }

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="pangkat_id")
    public Pangkat getPangkat() {
        return this.pangkat;
    }
    
    public void setPangkat(Pangkat pangkat) {
        this.pangkat = pangkat;
    }

    
    @Column(name="code", unique=true, length=4, nullable=false)
    public String getCode() {
        return this.code;
    }
    
    public void setCode(String code) {
        this.code = code;
    }
    
    @Column(name="overtime")
    public Boolean getOvertime() {
        return this.overtime;
    }
    
    public void setOvertime(Boolean overtime) {
        this.overtime = overtime;
    }

    
    @Column(name="created_by", length=45)
    public String getCreatedBy() {
        return this.createdBy;
    }
    
    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="created_on", length=19)
    public Date getCreatedOn() {
        return this.createdOn;
    }
    
    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }

    
    @Column(name="updated_by", length=45)
    public String getUpdatedBy() {
        return this.updatedBy;
    }
    
    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="updated_on", length=19)
    public Date getUpdatedOn() {
        return this.updatedOn;
    }
    
    public void setUpdatedOn(Date updatedOn) {
        this.updatedOn = updatedOn;
    }

    @OneToMany(fetch=FetchType.LAZY, mappedBy="golonganJabatan")
    public Set<Jabatan> getJabatans() {
        return this.jabatans;
    }
    
    public void setJabatans(Set<Jabatan> jabatans) {
        this.jabatans = jabatans;
    }

    @OneToMany(fetch=FetchType.LAZY, mappedBy="golonganJabatan")
	public Set<TravelComponentCostRate> getTravelComponentCostRates() {
		return travelComponentCostRates;
	}

	public void setTravelComponentCostRates(Set<TravelComponentCostRate> travelComponentCostRates) {
		this.travelComponentCostRates = travelComponentCostRates;
	}
	
}


