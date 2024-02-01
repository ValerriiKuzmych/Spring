package annotationsSpringApplication;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class RockMusic implements Music {
	
	List<String> trackList = new ArrayList<String>();
	
	private String track0 = "Another Brick in the wall";
	private String track1 = "Smoke oin the water"; 
	private String track2 = "Bohemian Rhapsody";
	
	
	
	

	public RockMusic() {
		trackList.add(track0);
		trackList.add(track1);
		trackList.add(track2);
	}





	@Override
	public List<String> getMusic() {
		
		
		return trackList;
			
	}





	

}
