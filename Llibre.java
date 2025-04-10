public class Llibre {
    private String titol;
    private String autor;
    private boolean prestat;
    
    public Llibre(String titol, String autor) {
        this.titol = titol;
        this.autor = autor;
        this.prestat = false;
    }

    public void crearLlibre(String nom_variable, String titol, String autor){
        Llibre nom_variable = new Llibre(titol, autor);
    }

    public void modificarLlibre(String titol, String autor){
        if(titol != null){
           this.titol = titol; 
        } else if (autor != null){
            this.autor = autor;
        }
    }

    public void eliminarLlibre(String nom_variable, String titol){
        if(this.titol == titol){
            nom_variable = null;
        }
    }

}