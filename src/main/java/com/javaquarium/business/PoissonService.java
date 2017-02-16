package com.javaquarium.business;

import com.javaquarium.beans.data.IPoissonService;
import com.javaquarium.beans.data.PoissonDO;
import com.javaquarium.beans.web.PoissonVO;
import com.javaquarium.dao.PoissonDAO;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by quentin on 16/02/2017.
 */
public class PoissonService implements IPoissonService {


    public List<PoissonVO> getPoissons() {
        PoissonDAO poissonDAO = new PoissonDAO();
        ArrayList<PoissonVO> lstPoisson = new ArrayList<>();
        for (PoissonDO poisson : poissonDAO.getAll()) {
            PoissonVO poissonVO = new PoissonVO();
            poissonVO.setCode(String.valueOf(poisson.getId()));
            poissonVO.setCouleur(String.valueOf(poisson.getCouleur()));
            poissonVO.setDescription(String.valueOf(poisson.getDescritpion()));
            poissonVO.setDimension(String.valueOf("L : " + poisson.getLargeur()  + " x l :" + poisson.getLongeur()));
            poissonVO.setEspece(String.valueOf(poisson.getNom()));
            poissonVO.setPrix(String.valueOf(poisson.getPrix()));
            lstPoisson.add(poissonVO);
        }
        return lstPoisson;
    }

    @Override
    public void ajout(PoissonVO poisson) {
        PoissonDAO poissonDAO = new PoissonDAO();
        PoissonDO poissonDo = new PoissonDO();
        poissonDo.setCouleur(poisson.getCouleur());
        poissonDo.setDescritpion(poisson.getDescription());
        poissonDo.setLargeur(Float.parseFloat(poisson.getDimension()));
        poissonDo.setLongeur(Float.parseFloat(poisson.getDimension()));
        poissonDo.setNom(poisson.getEspece());
        poisson.setPrix(poisson.getPrix());
        poissonDAO.ajout(poissonDo);
    }

}