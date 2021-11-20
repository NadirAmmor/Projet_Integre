package com.example.demo.dtos;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

public class Adhesion implements Serializable {

    EtudiantClubKey  id;

    Etudiant etudiant;

    Club club;


    private String statut;

    private Date dateAdhesion;

    //getters

    public EtudiantClubKey getId() {
        return id;
    }

    public void setId(EtudiantClubKey id) {
        this.id = id;
    }

    public Etudiant getEtudiant() {
        return etudiant;
    }

    public void setEtudiant(Etudiant etudiant) {
        this.etudiant = etudiant;
    }

    public Club getClub() {
        return club;
    }

    public void setClub(Club club) {
        this.club = club;
    }

    public String getStatut() {
        return statut;
    }

    public void setStatut(String statut) {
        this.statut = statut;
    }

    public Date getDateAdhesion() {
        return dateAdhesion;
    }

    public void setDateAdhesion(Date dateAdhesion) {
        this.dateAdhesion = dateAdhesion;
    }
}
