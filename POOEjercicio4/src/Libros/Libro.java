package Libros;

public class Libro {
	
	private int ISBN;
	private String titulo;
	private String autor;
	private int NumPaginas;
	
	// constructor
	public Libro(int iSBN, String titulo, String autor, int numPaginas) {
		this.ISBN = iSBN;
		this.titulo = titulo;
		this.autor = autor;
		this.NumPaginas = numPaginas;
	}
	// metodos 

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

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getNumPaginas() {
		return NumPaginas;
	}

	public void setNumPaginas(int numPaginas) {
		this.NumPaginas = numPaginas;
	}

	@Override
	public String toString() {
		return "El Libro " +titulo+ " con ISBN: "+ISBN+""
	            +" creado por el autor: "+autor
	            +" tiene :"+NumPaginas+"paginas";
	}
}
