package com.inkubator.hrm.entity;
// Generated Sep 3, 2014 7:05:37 PM by Hibernate Tools 3.6.0

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;
import javax.persistence.Version;

/**
 * BenefitGroup generated by hbm2java
 */
@Entity
@Table(name = "benefit_group", catalog = "hrm", uniqueConstraints = @UniqueConstraint(columnNames = "code")
)
public class BenefitGroup implements java.io.Serializable {

    private long id;
    private Integer version;
    private String createdBy;
    private Date createdOn;
    private String updatedBy;
    private Date updatedOn;
    private String code;
    private String name;
    private Date validDate;
    private String description;
    private Set<BenefitGroupRate> benefitGroupRates = new HashSet<BenefitGroupRate>(0);

    public BenefitGroup() {
    }

    public BenefitGroup(long id) {
        this.id = id;
    }

    public BenefitGroup(long id, String createdBy, Date createdOn, String updatedBy, Date updatedOn, String code, String name, Date validDate, String description, Set<BenefitGroupRate> benefitGroupRates) {
        this.id = id;
        this.createdBy = createdBy;
        this.createdOn = createdOn;
        this.updatedBy = updatedBy;
        this.updatedOn = updatedOn;
        this.code = code;
        this.name = name;
        this.validDate = validDate;
        this.description = description;
        this.benefitGroupRates = benefitGroupRates;
    }

    @Id

    @Column(name = "id", unique = true, nullable = false)
    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Version
    @Column(name = "version")
    public Integer getVersion() {
        return this.version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    @Column(name = "created_by", length = 45)
    public String getCreatedBy() {
        return this.createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "created_on", length = 19)
    public Date getCreatedOn() {
        return this.createdOn;
    }

    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }

    @Column(name = "updated_by", length = 45)
    public String getUpdatedBy() {
        return this.updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "updated_on", length = 19)
    public Date getUpdatedOn() {
        return this.updatedOn;
    }

    public void setUpdatedOn(Date updatedOn) {
        this.updatedOn = updatedOn;
    }

    @Column(name = "code", unique = true, length = 8)
    public String getCode() {
        return this.code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Column(name = "name", length = 60)
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Temporal(TemporalType.DATE)
    @Column(name = "valid_date", length = 10)
    public Date getValidDate() {
        return this.validDate;
    }

    public void setValidDate(Date validDate) {
        this.validDate = validDate;
    }

    @Column(name = "description", length = 65535, columnDefinition = "Text")
    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "benefitGroup", orphanRemoval = true)
    public Set<BenefitGroupRate> getBenefitGroupRates() {
        return this.benefitGroupRates;
    }

    public void setBenefitGroupRates(Set<BenefitGroupRate> benefitGroupRates) {
        this.benefitGroupRates = benefitGroupRates;
    }

}
