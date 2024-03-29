package com.inkubator.hrm.entity;
// Generated Aug 13, 2014 10:47:17 AM by Hibernate Tools 3.6.0


import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;
import javax.persistence.Version;

/**
 * BioBankAccount generated by hbm2java
 */
@Entity
@Table(name="bio_bank_account"
    ,catalog="hrm"
    , uniqueConstraints = {@UniqueConstraint(columnNames="swift_code"), @UniqueConstraint(columnNames="account_number")} 
)
public class BioBankAccount  implements java.io.Serializable {


     private long id;
     private Integer version;
     private BioData bioData;
     private Currency currency;
     private City city;
     private Bank bank;
     private String createdBy;
     private Date createdOn;
     private String updatedBy;
     private Date updatedOn;
     private String ownerName;
     private String accountNumber;
     private String branch;
     private String address;
     private Integer savingType;
     private String swiftCode;
     private Integer defaultAccount;

    public BioBankAccount() {
    }

	
    public BioBankAccount(long id, BioData bioData, Currency currency, City city) {
        this.id = id;
        this.bioData = bioData;
        this.currency = currency;
        this.city = city;
    }
    public BioBankAccount(long id, BioData bioData, Currency currency, City city, Bank bank, String createdBy, Date createdOn, String updatedBy, Date updatedOn, String ownerName, String accountNumber, String branch, String address, Integer savingType, String swiftCode, Integer defaultAccount) {
       this.id = id;
       this.bioData = bioData;
       this.currency = currency;
       this.city = city;
       this.bank = bank;
       this.createdBy = createdBy;
       this.createdOn = createdOn;
       this.updatedBy = updatedBy;
       this.updatedOn = updatedOn;
       this.ownerName = ownerName;
       this.accountNumber = accountNumber;
       this.branch = branch;
       this.address = address;
       this.savingType = savingType;
       this.swiftCode = swiftCode;
       this.defaultAccount = defaultAccount;
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
    @JoinColumn(name="bio_data_id", nullable=false)
    public BioData getBioData() {
        return this.bioData;
    }
    
    public void setBioData(BioData bioData) {
        this.bioData = bioData;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="currency_id", nullable=false)
    public Currency getCurrency() {
        return this.currency;
    }
    
    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="city_id", nullable=false)
    public City getCity() {
        return this.city;
    }
    
    public void setCity(City city) {
        this.city = city;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="bank_id")
    public Bank getBank() {
        return this.bank;
    }
    
    public void setBank(Bank bank) {
        this.bank = bank;
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

    
    @Column(name="owner_name", length=60)
    public String getOwnerName() {
        return this.ownerName;
    }
    
    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    
    @Column(name="account_number", unique=true, length=60)
    public String getAccountNumber() {
        return this.accountNumber;
    }
    
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    
    @Column(name="branch", length=60)
    public String getBranch() {
        return this.branch;
    }
    
    public void setBranch(String branch) {
        this.branch = branch;
    }

    
    @Column(name="address", length=65535, columnDefinition="Text")
    public String getAddress() {
        return this.address;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }

    
    @Column(name="saving_type")
    public Integer getSavingType() {
        return this.savingType;
    }
    
    public void setSavingType(Integer savingType) {
        this.savingType = savingType;
    }

    
    @Column(name="swift_code", unique=true, length=60)
    public String getSwiftCode() {
        return this.swiftCode;
    }
    
    public void setSwiftCode(String swiftCode) {
        this.swiftCode = swiftCode;
    }

    
    @Column(name="default_account")
    public Integer getDefaultAccount() {
        return this.defaultAccount;
    }
    
    public void setDefaultAccount(Integer defaultAccount) {
        this.defaultAccount = defaultAccount;
    }




}


