package annotationsSpringApplication;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("annotationsApplicationContext.xml");

		

		Device device = context.getBean("device", Device.class);
		
		MusicPlayer player = device.getPlayer();
		
		player.playMusic(MusicGenres.ROCK);
		
		

		
		
		
		
		context.close();
	}
}
