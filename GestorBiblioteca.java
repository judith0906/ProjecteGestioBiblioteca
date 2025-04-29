import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class GestorBiblioteca {

    private List<prestec> prestecs;

    public GestorBiblioteca() {
        this.prestecs = new ArrayList<>();
    }

    public void prestarLlibre(Usuari usuari, Llibre llibre) {
        if(!llibre.estaPrestat()) {
            llibre.marcarComPrestat();
            prestec prestec = new prestec(usuari, llibre, LocalDate.now());
                
            prestecs.add(prestec);
            usuari.afegirLlibre(llibre);
            System.out.println(usuari.getNom() + "ha afagat el llibre " + llibre.getTitol());
        } else {
            System.out.println("Aquest llibre ja ha estat prestat");
        }
    }

    
}
