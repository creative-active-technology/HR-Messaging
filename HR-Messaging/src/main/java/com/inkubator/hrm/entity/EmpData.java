package com.inkubator.hrm.entity;
// Generated Aug 8, 2014 10:14:25 AM by Hibernate Tools 3.6.0

import com.inkubator.common.util.AESUtil;
import com.inkubator.hrm.HRMConstant;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
import javax.persistence.UniqueConstraint;
import javax.persistence.Version;

/**
 * EmpData generated by hbm2java
 */
@Entity
@Table(name = "emp_data", catalog = "hrm", uniqueConstraints = @UniqueConstraint(columnNames = "NIK")
)
public class EmpData implements java.io.Serializable {

    private long id;
    private Integer version;
    private WtGroupWorking wtGroupWorking;
    private EmployeeType employeeType;
    private BioData bioData;
    private PaySalaryGrade paySalaryGrade;
    private Jabatan jabatanByJabatanId;
    private GolonganJabatan golonganJabatan;
    private Jabatan jabatanByJabatanGajiId;
    private String nik;
    private Date joinDate;
    private String ppmp;
    private String ppip;
    private Boolean isFinger;
    private Boolean heatlyPremi;
    private Boolean ptkpStatus;
    private Integer ptkpNumber;
    private Boolean insentifStatus;
//    private BigDecimal basicSalary;
    private String basicSalary;
    private String createdBy;
    private Date createdOn;
    private String updatedBy;
    private Date updatedOn;
    private Set<EmpPersonAchievement> empPersonAchievements = new HashSet<EmpPersonAchievement>(0);
    private Set<BusinessTravel> businessTravels = new HashSet<BusinessTravel>(0);
//    private Long defEmpId;
//    private String nikLama;
    private Set<EmpRotasi> empRotasis = new HashSet<EmpRotasi>(0);
    private Set<HrmUser> hrmUsers = new HashSet<HrmUser>(0);
    private String status;
    private String noSk;
    private Date rotasiDate;
    private Set<Reimbursment> reimbursments = new HashSet<Reimbursment>(0);
    private Set<Loan> loans = new HashSet<Loan>(0);
    private Set<TempJadwalKaryawan> tempJadwalKaryawans = new HashSet<TempJadwalKaryawan>(0);
    private Set<LeaveDistribution> leaveDistributions = new HashSet<>(0);
    private Set<OverTimeDistribution> overTimeDistributions = new HashSet<OverTimeDistribution>(0);
    private Set<LeaveImplementation> leaveImplementations = new HashSet<LeaveImplementation>(0);
    private Set<LeaveImplementation> temporaryActings = new HashSet<LeaveImplementation>(0);

    public EmpData() {
    }

    public EmpData(long id) {
        this.id = id;
    }

    public EmpData(long id, WtGroupWorking wtGroupWorking, EmployeeType employeeType, BioData bioData, PaySalaryGrade paySalaryGrade, Jabatan jabatanByJabatanId, GolonganJabatan golonganJabatan, Jabatan jabatanByJabatanGajiId, String nik, Date joinDate, String ppmp, String ppip, Boolean isFinger, Boolean heatlyPremi, Boolean ptkpStatus, Integer ptkpNumber, Boolean insentifStatus, String basicSalary, String createdBy, Date createdOn, String updatedBy, Date updatedOn, Set<BusinessTravel> businessTravels, Set<EmpPersonAchievement> empPersonAchievements) {
        this.id = id;
        this.wtGroupWorking = wtGroupWorking;
        this.employeeType = employeeType;
        this.bioData = bioData;
        this.paySalaryGrade = paySalaryGrade;
        this.jabatanByJabatanId = jabatanByJabatanId;
        this.golonganJabatan = golonganJabatan;
        this.jabatanByJabatanGajiId = jabatanByJabatanGajiId;
        this.nik = nik;
        this.joinDate = joinDate;
        this.ppmp = ppmp;
        this.ppip = ppip;
        this.isFinger = isFinger;
        this.heatlyPremi = heatlyPremi;
        this.ptkpStatus = ptkpStatus;
        this.ptkpNumber = ptkpNumber;
        this.insentifStatus = insentifStatus;
        this.basicSalary = basicSalary;
        this.createdBy = createdBy;
        this.createdOn = createdOn;
        this.updatedBy = updatedBy;
        this.updatedOn = updatedOn;
        this.empPersonAchievements = empPersonAchievements;
        this.businessTravels = businessTravels;
    }

    @Id
    @Column(name = "id", unique = true, nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "employee_data_seq_gen")
    @SequenceGenerator(name = "employee_data_seq_gen", sequenceName = "EMPLOYEE_DATA_SEQ")
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
    @JoinColumn(name = "shift_group_id")
    public WtGroupWorking getWtGroupWorking() {
        return this.wtGroupWorking;
    }

    public void setWtGroupWorking(WtGroupWorking wtGroupWorking) {
        this.wtGroupWorking = wtGroupWorking;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "emp_type_id")
    public EmployeeType getEmployeeType() {
        return this.employeeType;
    }

    public void setEmployeeType(EmployeeType employeeType) {
        this.employeeType = employeeType;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "bio_data_id")
    public BioData getBioData() {
        return this.bioData;
    }

    public void setBioData(BioData bioData) {
        this.bioData = bioData;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "salary_grade_id")
    public PaySalaryGrade getPaySalaryGrade() {
        return this.paySalaryGrade;
    }

    public void setPaySalaryGrade(PaySalaryGrade paySalaryGrade) {
        this.paySalaryGrade = paySalaryGrade;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "jabatan_id")
    public Jabatan getJabatanByJabatanId() {
        return this.jabatanByJabatanId;
    }

    public void setJabatanByJabatanId(Jabatan jabatanByJabatanId) {
        this.jabatanByJabatanId = jabatanByJabatanId;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "gol_jab_id")
    public GolonganJabatan getGolonganJabatan() {
        return this.golonganJabatan;
    }

    public void setGolonganJabatan(GolonganJabatan golonganJabatan) {
        this.golonganJabatan = golonganJabatan;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "jabatan_gaji_id")
    public Jabatan getJabatanByJabatanGajiId() {
        return this.jabatanByJabatanGajiId;
    }

    public void setJabatanByJabatanGajiId(Jabatan jabatanByJabatanGajiId) {
        this.jabatanByJabatanGajiId = jabatanByJabatanGajiId;
    }

    @Column(name = "NIK", unique = true, length = 45)
    public String getNik() {
        return this.nik;
    }

    public void setNik(String nik) {
        this.nik = nik;
    }

    @Temporal(TemporalType.DATE)
    @Column(name = "join_date", length = 10)
    public Date getJoinDate() {
        return this.joinDate;
    }

    public void setJoinDate(Date joinDate) {
        this.joinDate = joinDate;
    }

    @Column(name = "ppmp", length = 30)
    public String getPpmp() {
        return this.ppmp;
    }

    public void setPpmp(String ppmp) {
        this.ppmp = ppmp;
    }

    @Column(name = "ppip", length = 30)
    public String getPpip() {
        return this.ppip;
    }

    public void setPpip(String ppip) {
        this.ppip = ppip;
    }

    @Column(name = "is_finger")
    public Boolean getIsFinger() {
        return this.isFinger;
    }

    public void setIsFinger(Boolean isFinger) {
        this.isFinger = isFinger;
    }

    @Column(name = "heatly_premi")
    public Boolean getHeatlyPremi() {
        return this.heatlyPremi;
    }

    public void setHeatlyPremi(Boolean heatlyPremi) {
        this.heatlyPremi = heatlyPremi;
    }

    @Column(name = "ptkp_status")
    public Boolean getPtkpStatus() {
        return this.ptkpStatus;
    }

    public void setPtkpStatus(Boolean ptkpStatus) {
        this.ptkpStatus = ptkpStatus;
    }

    @Column(name = "ptkp_number")
    public Integer getPtkpNumber() {
        return this.ptkpNumber;
    }

    public void setPtkpNumber(Integer ptkpNumber) {
        this.ptkpNumber = ptkpNumber;
    }

    @Column(name = "insentif_status")
    public Boolean getInsentifStatus() {
        return this.insentifStatus;
    }

    public void setInsentifStatus(Boolean insentifStatus) {
        this.insentifStatus = insentifStatus;
    }

//    @Column(name = "basic_salary", precision = 10, scale = 0)
//    public BigDecimal getBasicSalary() {
//        return this.basicSalary;
//    }
//
//    public void setBasicSalary(BigDecimal basicSalary) {
//        this.basicSalary = basicSalary;
//    }
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

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "empData")
    public Set<EmpPersonAchievement> getEmpPersonAchievements() {
        return empPersonAchievements;
    }

    public void setEmpPersonAchievements(Set<EmpPersonAchievement> empPersonAchievements) {
        this.empPersonAchievements = empPersonAchievements;
    }

    @Transient
    public String getNikWithFullName() {
        String data = nik + " - " + bioData.getFirstName() + " " + bioData.getLastName();
        return data;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "empData")
    public Set<BusinessTravel> getBusinessTravels() {
        return businessTravels;
    }

    public void setBusinessTravels(Set<BusinessTravel> businessTravels) {
        this.businessTravels = businessTravels;
    }

//    @Column(name = "def_emp_id")
//    public Long getDefEmpId() {
//        return this.defEmpId;
//    }
//
//    public void setDefEmpId(Long defEmpId) {
//        this.defEmpId = defEmpId;
//    }
//
//    @Column(name = "nik_lama", length = 45)
//    public String getNikLama() {
//        return this.nikLama;
//    }
//
//    public void setNikLama(String nikLama) {
//        this.nikLama = nikLama;
//    }
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "empData")
    public Set<EmpRotasi> getEmpRotasis() {
        return this.empRotasis;
    }

    public void setEmpRotasis(Set<EmpRotasi> empRotasis) {
        this.empRotasis = empRotasis;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "empData")
    public Set<HrmUser> getHrmUsers() {
        return hrmUsers;
    }

    public void setHrmUsers(Set<HrmUser> hrmUsers) {
        this.hrmUsers = hrmUsers;
    }

    @Column(name = "status", length = 45)
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Column(name = "no_sk", length = 45)
    public String getNoSk() {
        return this.noSk;
    }

    public void setNoSk(String noSk) {
        this.noSk = noSk;
    }

    @Column(name = "basic_salary", length = 65535, columnDefinition = "Text")
    public String getBasicSalary() {
        return this.basicSalary;
    }

    public void setBasicSalary(String basicSalary) {
        this.basicSalary = basicSalary;
    }

    @Transient
    public String getBasicSalaryDecrypted() {
        String dataEncripted = basicSalary;
        String dataDecripted = AESUtil.getAESDescription(dataEncripted, HRMConstant.KEYVALUE, HRMConstant.AES_ALGO);
        return dataDecripted;
    }

    @Temporal(TemporalType.DATE)
    @Column(name = "rotasi_date", length = 10)
    public Date getRotasiDate() {
        return rotasiDate;
    }

    public void setRotasiDate(Date rotasiDate) {
        this.rotasiDate = rotasiDate;
    }

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "empData", orphanRemoval = true)
    public Set<Reimbursment> getReimbursments() {
        return reimbursments;
    }

    public void setReimbursments(Set<Reimbursment> reimbursments) {
        this.reimbursments = reimbursments;
    }

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "empData", orphanRemoval = true)
    public Set<Loan> getLoans() {
        return loans;
    }

    public void setLoans(Set<Loan> loans) {
        this.loans = loans;
    }

    @Transient
    public boolean getSheduleDisable() {
        return getWtGroupWorking() == null;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "empData")
    public Set<TempJadwalKaryawan> getTempJadwalKaryawans() {
        return this.tempJadwalKaryawans;
    }

    public void setTempJadwalKaryawans(Set<TempJadwalKaryawan> tempJadwalKaryawans) {
        this.tempJadwalKaryawans = tempJadwalKaryawans;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "empData")
    public Set<LeaveDistribution> getLeaveDistributions() {
        return leaveDistributions;
    }

    public void setLeaveDistributions(Set<LeaveDistribution> leaveDistributions) {
        this.leaveDistributions = leaveDistributions;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "empData")
    public Set<OverTimeDistribution> getOverTimeDistributions() {
        return this.overTimeDistributions;
    }

    public void setOverTimeDistributions(Set<OverTimeDistribution> overTimeDistributions) {
        this.overTimeDistributions = overTimeDistributions;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "empData")
	public Set<LeaveImplementation> getLeaveImplementations() {
		return leaveImplementations;
	}

	public void setLeaveImplementations(Set<LeaveImplementation> leaveImplementations) {
		this.leaveImplementations = leaveImplementations;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "temporaryActing")
	public Set<LeaveImplementation> getTemporaryActings() {
		return temporaryActings;
	}

	public void setTemporaryActings(Set<LeaveImplementation> temporaryActings) {
		this.temporaryActings = temporaryActings;
	}
    
    

}
