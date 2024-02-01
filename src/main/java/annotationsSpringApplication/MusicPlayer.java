package annotationsSpringApplication;

import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {

	private Music classical;
	private Music metall;
	private Music rock;

	private MusicPlayer() {

	}

	@Autowired
	private MusicPlayer(@Qualifier("classicalMusic") Music classical, @Qualifier("metallMusic") Music metall,
			@Qualifier("rockMusic") Music rock) {

		this.metall = metall;
		this.rock = rock;
		this.classical = classical;

	}

	public void playMusic(MusicGenres g) {

		MusicGenres genre = g;

		if (genre == MusicGenres.ROCK) {

			System.out.println(playRandomTrack(rock.getMusic()));
			

		} else if (genre == MusicGenres.METALL) {

			System.out.println(playRandomTrack(metall.getMusic())); 

		} else if (genre == MusicGenres.CLASSICAL) {

			System.out.println(playRandomTrack(classical.getMusic()));
			

		} else {
			System.out.println("this genre is not on the list");
		}

	}

	public String playRandomTrack(List<String> list) {

		Random random = new Random();

		int randomIndexTrackList = random.nextInt(list.size());

		String randomTrack = list.get(randomIndexTrackList);

		return randomTrack;

	};

}
