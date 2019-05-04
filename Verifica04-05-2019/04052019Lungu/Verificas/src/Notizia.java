
public class Notizia {
 
	private String titolo;
	private String id ;
	private String articolo_completo;
	
	public Notizia() {}
	
	public Notizia(String titolo,String id,String articolo_completo)
	{
		this.titolo=titolo;
		this.id=id;
		this.articolo_completo=articolo_completo;
	}

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getArticolo_completo() {
		return articolo_completo;
	}

	public void setArticolo_completo(String articolo_completo) {
		this.articolo_completo = articolo_completo;
	}

	@Override
	public String toString() {
		return "Notizia [titolo=" + titolo + ", id=" + id + ", articolo_completo=" + articolo_completo + "]";
	}
	public Object clone() {
		return null;
		
	}
	
	
}
