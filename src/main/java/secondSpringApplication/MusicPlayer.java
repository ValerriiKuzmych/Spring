package secondSpringApplication;

public class MusicPlayer {

	private Music music;
	

	public MusicPlayer() {
		super();
	}

	public MusicPlayer(Music music) {

		this.music = music;
	}

	public void playMusic() {

		music.getMusic();
	}

	public Music getMusic() {
		return music;
	}

	public void setMusic(Music music) {
		this.music = music;
	}
}
