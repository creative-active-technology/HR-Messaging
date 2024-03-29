package com.inkubator.hrm.dao;

import com.inkubator.datacore.dao.IDAO;
import com.inkubator.hrm.entity.ApprovalActivity;
import com.inkubator.hrm.entity.ApprovalDefinition;
import com.inkubator.hrm.web.search.ApprovalActivitySearchParameter;
import java.util.List;
import org.hibernate.criterion.Order;

/**
 *
 * @author rizkykojek
 */
public interface ApprovalActivityDao extends IDAO<ApprovalActivity> {

    public List<ApprovalActivity> getRequestHistory(String userName, int firstResult, int maxResults, Order order);

    public List<ApprovalActivity> getAllDataWithAllRelation(ApprovalActivitySearchParameter searchParameter, int firstResult, int maxResults, Order order);

    public Long getTotalByParam(ApprovalActivitySearchParameter searchParameter);

    public ApprovalActivity getEntityByPkWithAllRelation(Long id);

    public List<ApprovalActivity> getReguestHistoryById(long id);

    public List<ApprovalActivity> getPendingRequest(String userName);

    public List<ApprovalActivity> getPendingTask(String userName);

    public ApprovalActivity getEntityByPkWithDetail(Long id);

    public List<ApprovalActivity> getAllDataByActivityNumberWithDetail(String activityNumber, Order order);

    public List<ApprovalActivity> getAllDataByPreviousActivityNumber(String previousActivityNumber, Order order);

    public List<ApprovalActivity> getDataNotSendEmailYet();

    public Boolean isStillHaveWaitingStatus(List<ApprovalDefinition> appDefs, String requestBy);

    public Boolean isStillHaveWaitingStatus(List<ApprovalDefinition> appDefs);

    public Boolean isStillHaveWaitingStatus(Long appDefId);

    public Boolean isStillHaveWaitingStatus(String activityNumber);

    public List<ApprovalActivity> getAllDataWaitingStatusApproval();

    public List<ApprovalActivity> getByApprovalStatus(Integer approvalStatus);
    
    public void updateAndFlush(ApprovalActivity approvalActivity);
}
