package ar.edu.unlp.oo1.ejercicio1;

/**
 * Completar esta clase de acuerdo a lo especificado
 */
public class WallPost {
	private String text;
	private int cantidadLikes;
	private boolean estaDestacado;
	
	
	
	
	public WallPost() {
		this.cantidadLikes = 0;
		this.text = "Undefined post";
		this.estaDestacado = false;
		
		
	}
	

	/**
	 * Retorna el texto descriptivo de la publicación
	 * 
	 * @return
	 */
	public String getText() {
		return this.text;
	};

	/**
	 * Setea el texto descriptivo de la publicación
	 * @param text
	 */
	public void setText(String text) {
		this.text = text;
		
	};

	/**
	 * Retorna la cantidad de “me gusta”
	 * 
	 * @return
	 */
	public int getLikes() {
		return this.cantidadLikes;
	};

	/**
	 * Incrementa la cantidad de likes en uno
	 */
	public void like() {
		this.cantidadLikes = this.cantidadLikes + 1;
		
	};

	/**
	 * Decrementa la cantidad de likes en uno. Si ya es 0, no hace nada
	 */
	public void dislike() {
		if(this.cantidadLikes > 0) {
			this.cantidadLikes = this.cantidadLikes - 1;
		}
		
	};

	/**
	 * Retorna true si el post está marcado como destacado, false en caso contrario
	 * 
	 * @return
	 */
	boolean isFeatured() {
		return this.estaDestacado;
	};

	/**
	 * Cambia el post del estado destacado a no destacado y viceversa
	 */
	public void toggleFeatured() {
		
		if(this.estaDestacado) {
			this.estaDestacado = false;
		}else {
			this.estaDestacado = true;
		}
		
	};

	/*
	 * Este mensaje se utiliza para que una instancia de Wallpost se muestre de forma adecuada
	 */
	@Override
	public String toString() {
		return "WallPost {" +
			"text: " + getText() +
			", likes: '" + getLikes() + "'" +
			", featured: '" + isFeatured() + "'" +
			"}";
	}

}