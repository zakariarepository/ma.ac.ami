package Entite;

public class Employe {
    private String nom;
    private String prenom;
    private String mail;
    private Integer matricule;
    private int salaire ;



    public Employe(String nom,String prenom,String mail, int matricule, int salaire) {

        this.nom=nom;
        this.prenom=prenom;
        this.mail=mail;
        this.matricule=matricule;
        this.salaire=salaire;
    }

    public int getSalaire(){
        return salaire;
    }

    public Integer getMatricule(){
        return matricule;
    }
    public String getName(){
        return nom;
    }
}
