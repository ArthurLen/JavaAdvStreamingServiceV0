package be.pxl.ja.streamingservice.model;
import java.time.LocalDate;

public class Movie extends Content implements Playable {

	private String title;
	private String director;
	private LocalDate releaseDate;
	private Genre genre;
	public int LONG_PLAYING_TIME = 135;
	private int duration;
	public Movie(String title, Rating maturityRating) {
		super(title, maturityRating);
	}

	public void setReleaseDate(LocalDate releaseDate) {
		this.releaseDate = releaseDate;
	}



	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public LocalDate getReleaseDate() {
		return releaseDate;
	}
	
	public int getDuration() {
		return duration;
	}
	
	public void setDuration(int duration) {
		this.duration = duration;
	}

	@Override
	public void play() {
		System.out.println("Playing " + this);
		
	}

	@Override
	public void pause() {
		System.out.println("Pausing " + this);
		
	}
	
	public boolean IsLongPlayingTime() {
		return duration > LONG_PLAYING_TIME;
	}
	
	public String getPlayingTime() {
		return "";
	}
	
	public void setGenre(Genre genre) {
		this.genre = genre;
	}
	
	public Genre getGenre() {
		return genre;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder(super.toString());
		if (releaseDate != null) {
			builder.append(" (").append(releaseDate.getYear()).append(" )");
			}
		return builder.toString();
	}
	
	
	
}




