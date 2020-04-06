package interfaceCode;

import java.util.ArrayList;

public class Playlist implements IComponent {

	public String playlistName;
	public ArrayList<IComponent> playlist = new ArrayList();
	
	public Playlist(String playlistName) {
		this.playlistName = playlistName;
	}
	
	public void play() {
		playlist.get(0).play();
	}
	
	public void setPlaybackSpeed(float speed) {
		for(int x = 0; x < playlist.size(); x++) {
			playlist.get(x).setPlaybackSpeed(speed);
		}
	}
	
	public String getName() {
		return this.playlistName;
	}
	
	public void add(IComponent pl) {
		playlist.add(pl);
	}
	
	public void remove(IComponent pl) {
		playlist.remove(pl);
	}
	
}
