import java.util.ArrayList;
class NewsSconosciuta extends Exception{
}

	public class News {
		
	public final static int NUM_MAX_NEWS=10000;
	private ArrayList<Notizia>news;
	
	public void News() {
		news= new ArrayList<>(NUM_MAX_NEWS);
	}
	public void addNews(News news)
	{
		news.addNews(news);
	}
	public News cercaNews(String id ,String titolo)
	{
		for(Notizia notizia : news)
		{
			if(notizia.getTitolo().equals(titolo))
			return (News) news.clone();
			
		}
		return null;
	}
	public String ListaNews() {
		String lista ="";
	
	for (Notizia notizia:news)
	{
		lista+=notizia.getId()+" "+notizia.getTitolo();
	}
	return lista;
	}
}
