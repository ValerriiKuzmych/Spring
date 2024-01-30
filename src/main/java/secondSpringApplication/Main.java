package secondSpringApplication;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		// Music music = context.getBean("musicBean", Music.class);

		// MusicPlayer player = new MusicPlayer(music);

		MusicPlayer player = context.getBean("musicPlayerBean", MusicPlayer.class);
		player.playMusic();

		context.close();
	}
}
