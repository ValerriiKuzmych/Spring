package annotationsSpringApplication;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class MetallMusic implements Music {
	
ArrayList<String> trackList = new ArrayList<String>();
	
	private String track0 = "Welcome to Hell";
	private String track1 = "Hammer Smashed Face"; 
	private String track2 = "Balls to the Wall";
	
	
	
	

	public MetallMusic() {
		trackList.add(track0);
		trackList.add(track1);
		trackList.add(track2);
	}

	@Override
	public List<String> getMusic() {
		
		return trackList;
			
	}

}
