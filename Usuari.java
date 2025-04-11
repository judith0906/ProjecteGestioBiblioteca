public class Usuari {
    private String nom;

    public Usuari(String nom) {
        this.nom = nom;
    }

    // Métode per modificar el nom de l'usuari actual
    public void modificarUsuari(String nouNom) {
        this.nom = nouNom;
    }

    //to String per veure els lectors més actius
    @Override
    public String toString() {
        return "Nom: " + nom;
    }
}