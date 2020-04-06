package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import interfaceCode.*;

class PlaylistTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void testPlaylist() {
		Playlist testPlaylist = new Playlist("electronic");
		assertNotNull(testPlaylist);
	}

	@Test
	void testPlay() {
		Song song1 = new Song("Song 1", "The Beatle");
		
		Playlist testPlaylist = new Playlist("electro");
		testPlaylist.add(song1);

		assertEquals(song1, testPlaylist.playlist.get(0));
	}

	@Test
	void testSetPlaybackSpeed() {
		Song song1 = new Song("Song 1", "The Beatle");
		song1.setPlaybackSpeed(1.35f);
		
		Playlist testPlaylist = new Playlist("techo");
		testPlaylist.add(song1);
		testPlaylist.setPlaybackSpeed(1.5f);
		
		assertEquals(1.5f, song1.speed);
	}

	@Test
	void testGetName() {
		Playlist testPlaylist = new Playlist("techo");
		
		assertEquals("techo", testPlaylist.getName());
	}

	@Test
	void testAdd() {
		Song song1 = new Song("Song 1", "The Beatle");
		song1.setPlaybackSpeed(1.35f);
		
		Playlist testPlaylist = new Playlist("techo");
		testPlaylist.add(song1);
		
		assertNotNull(testPlaylist.playlist.get(0));
	}

	@Test
	void testRemove() {
		Song song1 = new Song("Song 1", "The Beatle");
		song1.setPlaybackSpeed(1.35f);
		
		Playlist testPlaylist = new Playlist("techo");
		testPlaylist.add(song1);
		testPlaylist.remove(song1);
		
		assertEquals(0, testPlaylist.playlist.size());
	}

}
