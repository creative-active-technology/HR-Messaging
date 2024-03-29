/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.inkubator.hrm.service;

import com.inkubator.datacore.service.IService;
import com.inkubator.hrm.entity.Jabatan;
import com.inkubator.hrm.web.search.JabatanSearchParameter;
import java.util.List;
import org.hibernate.criterion.Order;

/**
 *
 * @author Deni Husni FR
 */
public interface JabatanService extends IService<Jabatan> {

    public List<Jabatan> getByParam(JabatanSearchParameter searchParameter, int firstResult, int maxResults, Order order) throws Exception;

    public Long getTotalJabatanByParam(JabatanSearchParameter searchParameter) throws Exception;

    public Jabatan getJabatanByLevelOne(Integer level) throws Exception;

    public List<Jabatan> getJabatanByParentCode(String parentCode) throws Exception;

    public Jabatan getJabatanByIdWithDetail(Long id) throws Exception;

    public List<Jabatan> getJabatansByLevel(Integer level) throws Exception;

    public Jabatan getByIdWithJobDeskripsi(long id) throws Exception;

    public Jabatan getByIdWithKlasifikasiKerja(long id) throws Exception;

    public List<Jabatan> getByDepartementId(long id) throws Exception;
    
    public void updateForSalaryGrade(Jabatan entity) throws Exception;
    
    public Jabatan getByIdWithSalaryGrade(long id) throws Exception;
    
    public List<Jabatan>getByName(String name)throws Exception;

	public List<Jabatan> getAllDataByCodeOrName(String param);

}
