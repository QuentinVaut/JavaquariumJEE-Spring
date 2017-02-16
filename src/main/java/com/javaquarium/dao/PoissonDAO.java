package com.javaquarium.dao;

import com.javaquarium.beans.data.PoissonDO;
import com.javaquarium.util.HibernateUtils;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.ArrayList;

/**
 * Created by quentin on 16/02/2017.
 */
public class PoissonDAO {

    public ArrayList<PoissonDO> getAll() {
        Session s = HibernateUtils.getSession();
        Query q = s.createQuery("from PoissonDO");
        ArrayList List = (ArrayList) q.list();
        return List;
    }

    public void ajout(PoissonDO poisson) {
        Session s = HibernateUtils.getSession();
        Transaction tx = s.beginTransaction();
        s.save(poisson);
        tx.commit();
    }

}
