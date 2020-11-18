package apupoo.modelo;

public class Libro {
    private int ISBN;
	private String titulo;

    public Libro() {
    }

    public Libro(int iSBN, String titulo) {
        ISBN = iSBN;
        this.titulo = titulo;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int iSBN) {
        ISBN = iSBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

	@Override
	public String toString() {
		return "Libro [ISBN=" + ISBN + ", titulo=" + titulo + "]";
	}
    
    
    
}
