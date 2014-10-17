package com.inkubator.hrm.dao.impl;

import com.inkubator.datacore.dao.impl.IDAOImpl;
import com.inkubator.hrm.dao.TravelComponentDao;
import com.inkubator.hrm.entity.TravelComponent;
import com.inkubator.hrm.web.search.TravelComponentSearchParameter;
import java.util.List;
import org.apache.commons.lang3.StringUtils;
import org.hibernate.Criteria;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Taufik Hidayat
 */
@Repository(value = "travelComponentDao")
@Lazy
public class TravelComponentDaoImpl extends IDAOImpl<TravelComponent> implements TravelComponentDao {

    @Override
    public Class<TravelComponent> getEntityClass() {
        return TravelComponent.class;
    }

    @Override
    public List<TravelComponent> getByParam(TravelComponentSearchParameter parameter, int firstResult, int maxResults, Order orderable) {
        Criteria criteria = getCurrentSession().createCriteria(getEntityClass());
        doSearchTravelComponentByParam(parameter, criteria);
        criteria.addOrder(orderable);
        criteria.setFirstResult(firstResult);
        criteria.setMaxResults(maxResults);
        return criteria.list();
    }

    @Override
    public Long getTotalTravelComponentByParam(TravelComponentSearchParameter parameter) {
        Criteria criteria = getCurrentSession().createCriteria(getEntityClass());
        doSearchTravelComponentByParam(parameter, criteria);
        return (Long) criteria.setProjection(Projections.rowCount()).uniqueResult();
    }

    private void doSearchTravelComponentByParam(TravelComponentSearchParameter parameter, Criteria criteria) {
        if (parameter.getCode()!= null) {
            criteria.add(Restrictions.like("code", parameter.getCode(), MatchMode.ANYWHERE));
        }
        
        if (parameter.getName()!= null) {
            criteria.add(Restrictions.like("name", parameter.getName(), MatchMode.ANYWHERE));
        }
        criteria.add(Restrictions.isNotNull("id"));
    }

}
