package be.pxl.ja.streamingservice.model;

public enum Rating {
	LITTLE_KIDS,
	OLDER_KIDS,
	TEENS,
	MATURE;
	
	
	private int minimumAge;
	
	
	public int getMinimumAge() {
		Rating.LITTLE_KIDS.minimumAge = 0;
		Rating.OLDER_KIDS.minimumAge = 7;
		Rating.TEENS.minimumAge = 12;
		Rating.MATURE.minimumAge = 16;
			
		return minimumAge;
	}
	
	
	
	
	
}
