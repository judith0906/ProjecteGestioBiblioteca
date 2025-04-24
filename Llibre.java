public class Llibre {
    private String titol;
    private String autor;
    private boolean prestat;
    
    public Llibre(String titol, String autor) {
        this.titol = titol;
        this.autor = autor;
        this.prestat = false;
    }

    // Métodes per modificar el llibre  de diferents maneres
    public void modificarTitol(String nouTitol) {
        if(nouTitol != null) {
            this.titol = nouTitol;
        }
    }

    public void modificarAutor(String nouAutor) {
        if(nouAutor != null) {
            this.autor = nouAutor;
        }
    }

    // Métodes per modificar ambdos camps alhora
    public void modificarLlibre(String nouTitol, String nouAutor) {
        if(nouTitol != null) {
            this.titol = nouTitol;
        }
        if(nouAutor != null) {
            this.autor = nouAutor;
        }
    }

    //Metodes per controlar si un llibre està prestat o no
    public boolean estaPrestat() {
        return prestat;
    }

    public boolean marcarComPrestat() {
        return prestat = true;
    }

        //to String per veure els llibres més prestats
        @Override
        public String toString() {
            return "Llibre: " + titol + ", autor: " + autor;
        }

        public String getTitol() {
            return titol;
        }


    
}