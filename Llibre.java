public class Llibre {
    private String titol;
    private String autor;
    private boolean prestat;
    
    public Llibre(String titol, String autor) {
        this.titol = titol;
        this.autor = autor;
        this.prestat = false;
    }

    public void crearLlibre(String titol, String autor){
        Llibre llibre = new Llibre(titol, autor);
    }

    public void modificarLlibre(String titol, String autor){
        if(titol != null){
           this.titol = titol; 
        } else if (autor != null){
            this.autor = autor;
        }
    }

    public void eliminarLlibre(String titol){
        if(this.titol == titol){
            llibre = null;
        }
    }

}