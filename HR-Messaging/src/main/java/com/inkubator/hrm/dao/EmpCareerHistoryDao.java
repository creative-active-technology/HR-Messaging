/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.inkubator.hrm.dao;

import com.inkubator.datacore.dao.IDAO;
import com.inkubator.hrm.entity.EmpCareerHistory;
import java.util.List;

/**
 *
 * @author Deni Husni FR
 */
public interface EmpCareerHistoryDao extends IDAO<EmpCareerHistory> {

    public List<EmpCareerHistory> getEmployeeCareerByBioId(long id);
    
    public EmpCareerHistory getByBioIdandStatus(long id, String status);
}
