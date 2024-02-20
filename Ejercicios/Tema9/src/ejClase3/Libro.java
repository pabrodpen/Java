package ejClase3;

public class Libro extends Publicacion implements Prestable {
    
    boolean prestado;
    String autor;

    public Libro(int codigo, int anio, String titulo, String autor) {
        super(codigo, anio, titulo);
        this.prestado = false;
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "Libro [autor=" + autor + ", codigo=" + codigo + ", anio=" + anio + ", titulo=" + titulo + "]\n";
    }

    public int getCodigo() {
        return super.getCodigo();
    }

    public int getAnio() {
        return super.getAnio();
    }

    @Override
    public void prestar() {
        // TODO Auto-generated method stub
        if (!prestado) {
            prestado = true;
        } else {
            System.out.println("El libro ya esta prestado");
        }

    }

    @Override
    public void devolver() {
        // TODO Auto-generated method stub
        if (prestado) {
            prestado = false;
        } else {
            System.out.println("El libro no esta prestado");
        }
    }

    public boolean isPrestado() {
        return prestado;
    }

    public void setPrestado(boolean prestado) {
        this.prestado = prestado;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    
}
