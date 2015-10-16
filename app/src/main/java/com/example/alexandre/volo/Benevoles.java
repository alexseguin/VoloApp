package com.example.alexandre.volo;

import java.util.ArrayList;

/**
 * SPECIFICATIONS:
 *
 * Organismes et bénévoles sont les utilisateurs du système
 * Un bénévole peut créer un compte
 * Ville *
 * 3 premiers caractères*
 * Compétences
 * Domaine et intérêts
 * Disponibilité
 * Âge *
 * Courriel *
 * Prénom *
 * Téléphone
 * Priorisation
 * Sexe
 */
public class Benevoles {
    private String      prenom;
    private String      ville;
    private String      zipcode;
    private ArrayList   competence;
    private ArrayList   domaine;
    private ArrayList   dispo;
    private String      courriel;
    private String      telephone;
    private String      sexe;
    private int         age;
    private int         priorisation;

    public Benevoles(){
        this.competence = new ArrayList();
        this.dispo = new ArrayList();
        this.domaine = new ArrayList();
    }

    // Get && Set le prenom du benevole
    public void setPrenom(String prenom){ this.prenom = prenom; }
    public String getPrenom(){return this.prenom;}

    //Get && Set la ville du benevole
    public void setVille(String ville){ this.ville = ville; }
    public String getVille(){ return this.ville; }

    //Get && Set les 3 premier caractere du code postal
    public void setZipcode(String zipcode){ this.zipcode = zipcode; }
    public String getZipcode(){return zipcode;}

    // Get && Set des competence a un index && Ajouter une competence a la fin du ArrayList
    public void setCompetence(String competence, int index){ this.competence.set(index, competence); }
    public String getCompetence(int index){return (String)this.competence.get(index);}
    public void addCompetence (String competence) {this.competence.add(competence);}

    // Get && Set la dispo du benevole
    public void setDispo (int start, int finish, String day) {this.dispo.add(new DispoElement(start, finish, day));}
    public  ArrayList getDispo(){return dispo;}

    // Get && Set les domaines  a un index && Ajouter un domaine a la fin du ArrayList
    public void setDomaine(String domaine, int index){ this.domaine.set(index, domaine); }
    public String getDomaine(int index){return (String)this.domaine.get(index);}
    public void addDomaine (String domaine) {this.domaine.add(domaine);}

    // Get && Set le courriel du benevole
    public void setCourriel(String courriel){ this.courriel = courriel; }
    public String getCourriel(){return this.courriel;}

    // Get && Set le numero de telephone du benevole
    public void setTelephone(String telephone){ this.telephone = telephone; }
    public String getTelephone(){return this.telephone;}

    // Get && Set le sexe du benevole
    public void setSexe(String sexe){ this.sexe = sexe; }
    public String getSexe(){return this.sexe;}

    // Get && Set l'age du benevole
    public void setAge(int age){ this.age = age; }
    public int getAge(){return this.age;}

    // Get && Set la priorisation du benevole
    public void setPriorisation(int priorisation){ this.priorisation = priorisation; }
    public int getPriorisation(){return this.priorisation;}
}
