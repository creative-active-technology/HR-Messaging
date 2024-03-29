/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.inkubator.hrm.dao;

import com.inkubator.datacore.dao.IDAO;
import com.inkubator.hrm.entity.EmpData;
import com.inkubator.hrm.web.model.DistributionLeaveSchemeModel;
import com.inkubator.hrm.web.model.DistributionOvetTimeModel;
import com.inkubator.hrm.web.model.PlacementOfEmployeeWorkScheduleModel;
import com.inkubator.hrm.web.search.EmpDataSearchParameter;
import java.util.Date;
import java.util.List;
import org.hibernate.criterion.Order;

/**
 *
 * @author Deni Husni FR
 */
public interface EmpDataDao extends IDAO<EmpData> {

    public Long getTotalByGender(Integer gender);

    public Long getTotalByAgeBetween(Date startDate, Date endDate);

    public Long getTotalByAgeLessThan(Date date);

    public Long getTotalByAgeMoreThan(Date date);

    public Long getTotalByDepartmentId(Long departmentId);

    public List<EmpData> getByParam(EmpDataSearchParameter searchParameter, int firstResult, int maxResults, Order order);

    public Long getTotalEmpDataByParam(EmpDataSearchParameter searchParameter);

    public EmpData getByEmpIdWithDetail(long id);

    public EmpData getByBioDataWithDepartment(long id);

    public Long getTotalByNikandNotId(String nik, Long id);

    public Long getTotalByNIK(String nik);

    public List<EmpData> getAllDataWithRelation();

    public EmpData getEntityByNik(String nik);

    public List<EmpData> getAllDataByNameOrNik(String param);

    public EmpData getByIdWithDetail(long id);

    public List<EmpData> getAllDataNotExistInUserByParam(String param, int firstResult, int maxResults, Order order);

    public Long getTotalNotExistInUserByParam(String param);

    public List<EmpData> getAllDataByJabatanId(Long jabatanId, Order order);

    public List<EmpData> getTotalBySearchEmployee(PlacementOfEmployeeWorkScheduleModel model);

    public List<EmpData> getAllDataWithEndTime(Date date);

    public List<EmpData> getEmployeeBySearchEmployeeLeave(DistributionLeaveSchemeModel model);

    public List<EmpData> getEmployeeByOtSearchParameter(DistributionOvetTimeModel model);

    public List<EmpData> getEmpDataByListId(List<Long> data);

    public List<EmpData> getAllDataByGolJabatanIdAndDepartmentId(Long jabatanId, Long departmentId);
}
