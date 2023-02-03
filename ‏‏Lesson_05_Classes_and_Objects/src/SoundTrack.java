
public class SoundTrack {

	private String title;
	private String artist;
	private String composer;
	private double duration;
	
	public SoundTrack(String title, String artist, String composer, double duration) {
		this.title = title;
		this.artist = artist;
		this.composer = composer;
		this.duration = duration;
	}
	
	public double getPrice()
	{
		// 3 + 0.5(duration - 5.0)
		if(duration < 5)
		{
			return 3;
		}
		else // duration >= 5
		{
			return 3 + 0.5*(duration - 5.0);
		}
	}

	public double getDuration() {
		return duration;
	}

	@Override
	public String toString() {
		return String.format("SoundTrack [title=%15s, artist=%15s, composer=%15s, duration=%7.2f, price =%7.2s]", 
				title, 
				artist,
				composer, 
				duration, 
				getPrice());
	}
	
	
	
	
	
	
	
}
