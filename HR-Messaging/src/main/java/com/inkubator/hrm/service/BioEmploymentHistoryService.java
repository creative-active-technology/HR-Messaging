package com.inkubator.hrm.service;

import com.inkubator.datacore.service.IService;
import com.inkubator.hrm.entity.BioEmploymentHistory;
import java.util.List;

/**
*
* @author Taufik Hidayat
*/
public interface BioEmploymentHistoryService extends IService<BioEmploymentHistory> {

	public List<BioEmploymentHistory> getAllDataByBioDataId(Long bioDataId) throws Exception;
        
        public BioEmploymentHistory getEntityByPKWithDetail(Long id) throws Exception;

}
