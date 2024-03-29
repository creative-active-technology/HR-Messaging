package com.inkubator.hrm.service;

import java.util.Date;
import java.util.List;

import org.hibernate.criterion.Order;

import com.inkubator.datacore.service.IService;
import com.inkubator.hrm.entity.Loan;
import com.inkubator.hrm.entity.LoanPaymentDetail;
import com.inkubator.hrm.web.search.LoanSearchParameter;

/**
 *
 * @author rizkykojek
 */
public interface LoanService extends IService<Loan>,BaseApprovalService {
	
	public List<Loan> getByParam(LoanSearchParameter parameter, int firstResult, int maxResults, Order orderable) throws Exception;

	public Long getTotalByParam(LoanSearchParameter parameter) throws Exception;

	public Loan getEntityByPkWithDetail(Long id) throws Exception;

	public String save(Loan entity, boolean isBypassApprovalChecking) throws Exception;

	public void update(Loan entity) throws Exception;
	
	public List<LoanPaymentDetail> getAllDataLoanPaymentDetails(Double interestRate, Integer termin, Date loanPaymentDate, Double nominalPrincipal, Integer typeOfInterest) throws Exception;

	public Loan getEntityByApprovalActivityNumberWithDetail(String approvalActivityNumber);

}
