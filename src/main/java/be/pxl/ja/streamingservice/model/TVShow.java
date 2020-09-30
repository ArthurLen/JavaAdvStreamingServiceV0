package be.pxl.ja.streamingservice.model;

public final class TVShow extends Content {
	
	private int numberOfSeasons;
	
	public TVShow (String title, Rating maturityRating, int numberOfseasons) {
		super(title, maturityRating);
		this.numberOfSeasons = numberOfseasons;
	}

	public int getNumberOfSeasons() {
		return numberOfSeasons;
	}
	
	
		
}
