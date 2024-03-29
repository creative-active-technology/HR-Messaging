package com.inkubator.hrm.service.impl;

import com.inkubator.common.util.RandomNumberUtil;
import com.inkubator.datacore.service.impl.IServiceImpl;
import com.inkubator.exception.BussinessException;
import com.inkubator.hrm.dao.AttendanceStatusDao;
import com.inkubator.hrm.dao.PermitClassificationDao;
import com.inkubator.hrm.entity.AttendanceStatus;
import com.inkubator.hrm.entity.PermitClassification;
import com.inkubator.hrm.service.PermitClassificationService;
import com.inkubator.hrm.web.search.PermitClassificationSearchParameter;
import com.inkubator.securitycore.util.UserInfoUtil;
import java.util.Date;
import java.util.List;
import org.hibernate.criterion.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Taufik Hidayat
 */
@Service(value = "permitClassificationService")
@Lazy
public class PermitClassificationServiceImpl extends IServiceImpl implements PermitClassificationService {

    @Autowired
    private PermitClassificationDao permitClassificationDao;
    @Autowired
    private AttendanceStatusDao attendanceStatusDao;

    @Override
    @Transactional(readOnly = false, isolation = Isolation.READ_COMMITTED, propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    public void delete(PermitClassification permitClassification) throws Exception {
        permitClassificationDao.delete(permitClassification);
    }

    @Override
    @Transactional(readOnly = true, isolation = Isolation.REPEATABLE_READ, propagation = Propagation.SUPPORTS, timeout = 50)
    public List<PermitClassification> getAllData() throws Exception {
        return this.permitClassificationDao.getAllData();
    }

    @Override
    public List<PermitClassification> getAllData(Boolean arg0) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose ECLIPSE Preferences | Code Style | Code Templates.

    }

    @Override
    public List<PermitClassification> getAllData(Integer arg0) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose ECLIPSE Preferences | Code Style | Code Templates.

    }

    @Override
    public List<PermitClassification> getAllData(Byte arg0) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose ECLIPSE Preferences | Code Style | Code Templates.

    }

    @Override
    public List<PermitClassification> getAllDataPageAble(int arg0, int arg1, Order arg2)
            throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose ECLIPSE Preferences | Code Style | Code Templates.

    }

    @Override
    public List<PermitClassification> getAllDataPageAbleIsActive(int arg0, int arg1,
            Order arg2, Boolean arg3) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose ECLIPSE Preferences | Code Style | Code Templates.

    }

    @Override
    public List<PermitClassification> getAllDataPageAbleIsActive(int arg0, int arg1,
            Order arg2, Integer arg3) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose ECLIPSE Preferences | Code Style | Code Templates.

    }

    @Override
    public List<PermitClassification> getAllDataPageAbleIsActive(int arg0, int arg1,
            Order arg2, Byte arg3) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose ECLIPSE Preferences | Code Style | Code Templates.

    }

    @Override
    public PermitClassification getEntityByPkIsActive(String arg0, Integer arg1)
            throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose ECLIPSE Preferences | Code Style | Code Templates.

    }

    @Override
    public PermitClassification getEntityByPkIsActive(String arg0, Byte arg1)
            throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose ECLIPSE Preferences | Code Style | Code Templates.

    }

    @Override
    public PermitClassification getEntityByPkIsActive(String arg0, Boolean arg1)
            throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose ECLIPSE Preferences | Code Style | Code Templates.

    }

    @Override
    public PermitClassification getEntityByPkIsActive(Integer arg0, Integer arg1)
            throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose ECLIPSE Preferences | Code Style | Code Templates.

    }

    @Override
    public PermitClassification getEntityByPkIsActive(Integer arg0, Byte arg1)
            throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose ECLIPSE Preferences | Code Style | Code Templates.

    }

    @Override
    public PermitClassification getEntityByPkIsActive(Integer arg0, Boolean arg1)
            throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose ECLIPSE Preferences | Code Style | Code Templates.

    }

    @Override
    public PermitClassification getEntityByPkIsActive(Long arg0, Integer arg1)
            throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose ECLIPSE Preferences | Code Style | Code Templates.

    }

    @Override
    public PermitClassification getEntityByPkIsActive(Long arg0, Byte arg1)
            throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose ECLIPSE Preferences | Code Style | Code Templates.

    }

    @Override
    public PermitClassification getEntityByPkIsActive(Long arg0, Boolean arg1)
            throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose ECLIPSE Preferences | Code Style | Code Templates.

    }

    @Override
    public PermitClassification getEntiyByPK(String arg0) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose ECLIPSE Preferences | Code Style | Code Templates.

    }

    @Override
    public PermitClassification getEntiyByPK(Integer arg0) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose ECLIPSE Preferences | Code Style | Code Templates.

    }

    @Override
    @Transactional(readOnly = true, isolation = Isolation.REPEATABLE_READ, propagation = Propagation.SUPPORTS, timeout = 30)
    public PermitClassification getEntiyByPK(Long id) throws Exception {
        return permitClassificationDao.getEntiyByPK(id);
    }

    @Override
    public Long getTotalData() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose ECLIPSE Preferences | Code Style | Code Templates.

    }

    @Override
    public Long getTotalDataIsActive(Boolean arg0) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose ECLIPSE Preferences | Code Style | Code Templates.

    }

    @Override
    public Long getTotalDataIsActive(Integer arg0) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose ECLIPSE Preferences | Code Style | Code Templates.

    }

    @Override
    public Long getTotalDataIsActive(Byte arg0) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose ECLIPSE Preferences | Code Style | Code Templates.

    }

    @Override
    @Transactional(readOnly = false, isolation = Isolation.READ_COMMITTED, propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    public void save(PermitClassification permitClassification) throws Exception {
        // check duplicate name
        long totalDuplicates = permitClassificationDao.getTotalByCode(permitClassification.getCode());
        if (totalDuplicates > 0) {
            throw new BussinessException("permitClassification.error_duplicate_permitClassification_code");
        }
        
        long totalDuplicatesName = permitClassificationDao.getTotalByName(permitClassification.getName());
        if (totalDuplicatesName > 0) {
            throw new BussinessException("permitClassification.error_duplicate_permitClassification_name");
        }
        
        AttendanceStatus attendanceStatus = attendanceStatusDao.getEntiyByPK(permitClassification.getAttendanceStatus().getId());
        permitClassification.setId(Long.parseLong(RandomNumberUtil.getRandomNumber(9)));
        permitClassification.setAttendanceStatus(attendanceStatus);
        permitClassification.setCreatedBy(UserInfoUtil.getUserName());
        permitClassification.setCreatedOn(new Date());
        permitClassificationDao.save(permitClassification);
    }

    @Override
    public PermitClassification saveData(PermitClassification arg0) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose ECLIPSE Preferences | Code Style | Code Templates.

    }

    @Override
    public void saveOrUpdate(PermitClassification arg0) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose ECLIPSE Preferences | Code Style | Code Templates.

    }

    @Override
    public PermitClassification saveOrUpdateData(PermitClassification arg0) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose ECLIPSE Preferences | Code Style | Code Templates.

    }

    @Override
    public void softDelete(PermitClassification arg0) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose ECLIPSE Preferences | Code Style | Code Templates.

    }

    @Override
    @Transactional(readOnly = false, isolation = Isolation.READ_COMMITTED, propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    public void update(PermitClassification b) throws Exception {
        // check duplicate name
        long totalDuplicates = permitClassificationDao.getTotalByCodeAndNotId(b.getCode(), b.getId());
        if (totalDuplicates > 0) {
            throw new BussinessException("permitClassification.error_duplicate_permitClassification_code");
        }

        PermitClassification permitClassification = permitClassificationDao.getEntiyByPK(b.getId());
        AttendanceStatus attendanceStatus = attendanceStatusDao.getEntiyByPK(b.getAttendanceStatus().getId());
        permitClassification.setCode(b.getCode());
        permitClassification.setName(b.getName());
        permitClassification.setStatus(b.getStatus());
        permitClassification.setCalculation(b.getCalculation());
        permitClassification.setBasePeriod(b.getBasePeriod());
        permitClassification.setAvailibility(b.getAvailibility());
        permitClassification.setDateIncreased(b.getDateIncreased());
        permitClassification.setQuantity(b.getQuantity());
        permitClassification.setLimitByDay(b.getLimitByDay());
        permitClassification.setOnePerEmployee(b.getOnePerEmployee());
        permitClassification.setMaxPerMonth(b.getMaxPerMonth());
        permitClassification.setSalaryCut(b.getSalaryCut());
        permitClassification.setAttachmentRequired(b.getAttachmentRequired());
        permitClassification.setDescription(b.getDescription());
        permitClassification.setAttendanceStatus(attendanceStatus);
        permitClassification.setUpdatedBy(UserInfoUtil.getUserName());
        permitClassification.setUpdatedOn(new Date());
        permitClassificationDao.update(permitClassification);
    }

    @Override
    public PermitClassification updateData(PermitClassification arg0) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose ECLIPSE Preferences | Code Style | Code Templates.

    }

    @Override
    @Transactional(readOnly = true, isolation = Isolation.REPEATABLE_READ, propagation = Propagation.SUPPORTS, timeout = 50)
    public List<PermitClassification> getByParam(PermitClassificationSearchParameter parameter, int firstResult, int maxResults, Order orderable) throws Exception {
        return this.permitClassificationDao.getByParam(parameter, firstResult, maxResults, orderable);
    }

    @Override
    @Transactional(readOnly = true, isolation = Isolation.REPEATABLE_READ, propagation = Propagation.SUPPORTS, timeout = 30)
    public Long getTotalByParam(PermitClassificationSearchParameter parameter) throws Exception {
        return this.permitClassificationDao.getTotalPermitClassificationByParam(parameter);
    }

    @Override
    @Transactional(readOnly = true, isolation = Isolation.REPEATABLE_READ, propagation = Propagation.SUPPORTS, timeout = 30)
    public PermitClassification getEntityByPKWithDetail(Long id) throws Exception {
        return permitClassificationDao.getEntityByPKWithDetail(id);
    }

}
