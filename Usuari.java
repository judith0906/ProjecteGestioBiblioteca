import java.util.ArrayList;
import java.util.List;

public class Usuari {
    private String nom;
    private List<Llibre> llibresPrestats;

    public Usuari(String nom) {
        this.nom = nom;
    }

    // Métode per modificar el nom de l'usuari actual
    public void modificarUsuari(String nouNom) {
        this.nom = nouNom;
        this.llibresPrestats = new ArrayList<>();
    }

    public void afegirLlibre(Llibre llibre){
        llibresPrestats.add(llibre);
    }


    

    public String getNom() {
        return nom;
    }

    //to String per veure els lectors més actius
    @Override
    public String toString() {
        return "Nom: " + nom;
    }
}