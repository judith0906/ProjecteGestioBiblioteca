import java.util.ArrayList;
import java.util.List;

public class biblioteca {

    private List<Llibre> llibres;

    public biblioteca() {
        this.llibres = new ArrayList<>();
    }

    public void afegirLlibre(Llibre llibre){
        llibres.add(llibre);
    }
    
}