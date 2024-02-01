package annotationsSpringApplication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Device {
	
	private MusicPlayer player;
	
	
	
	public Device() {
		
	}
	
	@Autowired
	public Device(MusicPlayer player) {
		
		this.player = player;
	}

	

	
	
	public MusicPlayer getPlayer() {
		return player;
	}

	public void setPlayer(MusicPlayer player) {
		this.player = player;
	}

	@Override
	public String toString() {
		return "Device [player=" + player + "]";
	}
	
	
	
	

}
