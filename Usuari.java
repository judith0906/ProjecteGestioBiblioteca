import java.utils.Scanner;

public class Usuari {
    private String nom;

    public Usuari(String nom) {
    this.nom = nom;
    }


    public void afegirUsuari(String nom_variable, String nom){
        Usuari nom_variable = new Usuari(nom);
    }

    public void modificarUsuari(String nom){
        this.nom = nom;
    }

    public void eliminarUsuari(String nom_variable,String nom){
        if(this.nom == nom){
            nom_variable = null;
        }
    }

    public void llistarUsuaris(Usuari[] usuaris){
        for(Usuari usuari: usuaris){
            System.out.println(usuari);
        }
    }

    public void cercarUsuaris(String nom){
        if(this.nom == nom){
            System.out.println("Nom trobat!")
        }
    }

    public String toString(){
        return "Nom: " + nom;
    }
}