package annotationsSpringApplication;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class ClassicalMusic implements Music{
	
ArrayList<String> trackList = new ArrayList<String>();
	
	private String track0 = "Eine kleine Nachtmusik";
	private String track1 = "Für Elise"; 
	private String track2 = "Toccata and Fugue in D minor";
	
	
	
	

	public ClassicalMusic() {
		trackList.add(track0);
		trackList.add(track1);
		trackList.add(track2);
	}

	@Override
	public List<String> getMusic() {
		
		return trackList;
			
	}

	

}
