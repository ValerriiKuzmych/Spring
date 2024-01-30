package secondSpringApplication;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {

	private List<Music> musicList = new ArrayList<>();

	private int volume;

	private boolean playlistShuffle;

	public MusicPlayer() {

	}

	public void playMusicList() {
		
		for (Music music : musicList) {
			music.getMusic();
			
		}

	}

	public List<Music> getMusicList() {
		return musicList;
	}

	public void setMusicList(List<Music> musicList) {

		this.musicList = musicList;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public boolean isPlaylistShuffle() {
		return playlistShuffle;
	}

	public void setPlaylistShuffle(boolean playlistShuffle) {
		this.playlistShuffle = playlistShuffle;
	}

	@Override
	public String toString() {
		return "MusicPlayer [musicList=" + musicList + ", volume=" + volume + ", playlistShuffle=" + playlistShuffle
				+ "]";
	}

}
