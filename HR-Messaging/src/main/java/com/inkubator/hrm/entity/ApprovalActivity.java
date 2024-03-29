package com.inkubator.hrm.entity;
// Generated Aug 18, 2014 1:42:18 PM by Hibernate Tools 3.6.0

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
 * ApprovalActivity generated by hbm2java
 */
@Entity
@Table(name = "approval_activity", catalog = "hrm", uniqueConstraints = @UniqueConstraint(columnNames = {"sequence", "activity_number"})
)
public class ApprovalActivity implements java.io.Serializable {

    private long id;
    private Integer version;
    private ApprovalDefinition approvalDefinition;
    private String requestBy;
    private Date requestTime;
    private Integer approvalStatus;
    private Date approvalTime;
    private String approvedBy;
    private String approvalCommment;
    private Integer approvalCount;
    private Integer rejectCount;
    private String pendingData;
    private String activityNumber;
    private String previousActivityNumber;
    private Integer sequence;
    private Boolean notificationSend;
    private String locale;
    private Date createdTime;

    public ApprovalActivity() {
    }

    public ApprovalActivity(long id) {
        this.id = id;
    }

    public ApprovalActivity(long id, ApprovalDefinition approvalDefinition, String requestBy, Date requestTime, Integer approvalStatus, Date approvalTime, String approvedBy, String approvalCommment, Integer approvalCount, Integer rejectCount, String pendingData, String activityNumber, Integer sequence, Boolean notificationSend) {
        this.id = id;
        this.approvalDefinition = approvalDefinition;
        this.requestBy = requestBy;
        this.requestTime = requestTime;
        this.approvalStatus = approvalStatus;
        this.approvalTime = approvalTime;
        this.approvedBy = approvedBy;
        this.approvalCommment = approvalCommment;
        this.approvalCount = approvalCount;
        this.rejectCount = rejectCount;
        this.pendingData = pendingData;
        this.activityNumber = activityNumber;
        this.sequence = sequence;
        this.notificationSend = notificationSend;
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

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "approval_def_id")
    public ApprovalDefinition getApprovalDefinition() {
        return this.approvalDefinition;
    }

    public void setApprovalDefinition(ApprovalDefinition approvalDefinition) {
        this.approvalDefinition = approvalDefinition;
    }

    @Column(name = "request_by", length = 45)
    public String getRequestBy() {
        return this.requestBy;
    }

    public void setRequestBy(String requestBy) {
        this.requestBy = requestBy;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "request_time", length = 19)
    public Date getRequestTime() {
        return requestTime;
    }

    public void setRequestTime(Date requestTime) {
        this.requestTime = requestTime;
    }

    @Column(name = "approval_status")
    public Integer getApprovalStatus() {
        return this.approvalStatus;
    }

    public void setApprovalStatus(Integer approvalStatus) {
        this.approvalStatus = approvalStatus;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "approval_time", length = 19)
    public Date getApprovalTime() {
        return this.approvalTime;
    }

    public void setApprovalTime(Date approvalTime) {
        this.approvalTime = approvalTime;
    }

    @Column(name = "approved_by", length = 45)
    public String getApprovedBy() {
        return this.approvedBy;
    }

    public void setApprovedBy(String approvedBy) {
        this.approvedBy = approvedBy;
    }

    @Column(name = "approval_commment", length = 65535, columnDefinition = "Text")
    public String getApprovalCommment() {
        return this.approvalCommment;
    }

    public void setApprovalCommment(String approvalCommment) {
        this.approvalCommment = approvalCommment;
    }

    @Column(name = "approval_count")
    public Integer getApprovalCount() {
        return this.approvalCount;
    }

    public void setApprovalCount(Integer approvalCount) {
        this.approvalCount = approvalCount;
    }

    @Column(name = "reject_count")
    public Integer getRejectCount() {
        return this.rejectCount;
    }

    public void setRejectCount(Integer rejectCount) {
        this.rejectCount = rejectCount;
    }

    @Column(name = "pending_data", length = 65535, columnDefinition = "Text")
    public String getPendingData() {
        return this.pendingData;
    }

    public void setPendingData(String pendingData) {
        this.pendingData = pendingData;
    }

    @Column(name = "activity_number", length = 45)
    public String getActivityNumber() {
        return this.activityNumber;
    }

    public void setActivityNumber(String activityNumber) {
        this.activityNumber = activityNumber;
    }

    @Column(name = "previous_activity_number", length = 45)
    public String getPreviousActivityNumber() {
        return previousActivityNumber;
    }

    public void setPreviousActivityNumber(String previousActivityNumber) {
        this.previousActivityNumber = previousActivityNumber;
    }

    @Column(name = "sequence")
    public Integer getSequence() {
        return this.sequence;
    }

    public void setSequence(Integer sequence) {
        this.sequence = sequence;
    }

    @Column(name = "notification_send")
    public Boolean getNotificationSend() {
        return this.notificationSend;
    }

    public void setNotificationSend(Boolean notificationSend) {
        this.notificationSend = notificationSend;
    }

    @Column(name = "locale", length = 4)
    public String getLocale() {
        return locale;
    }

    public void setLocale(String locale) {
        this.locale = locale;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "created_time", length = 19)
    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

}
