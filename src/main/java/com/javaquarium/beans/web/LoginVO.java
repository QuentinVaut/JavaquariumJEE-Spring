package com.javaquarium.beans.web;

/**
 * Created by quentin on 16/02/2017.
 */
public class LoginVO {

    private static final long serialVersionUID = 7683260825169442802L;

    private String utilisateur;
    private String motDePasse;


    public LoginVO() {
        super();
    }

    /**
     * @return the utilisateur
     */
    public String getUtilisateur() {
        return utilisateur;
    }
    /**
     * @param utilisateur the utilisateur to set
     */
    public void setUtilisateur(String utilisateur) {
        this.utilisateur = utilisateur;
    }
    /**
     * @return the motDePasse
     */
    public String getMotDePasse() {
        return motDePasse;
    }
    /**
     * @param motDePasse the motDePasse to set
     */
    public void setMotDePasse(String motDePasse) {
        this.motDePasse = motDePasse;
    }
}
