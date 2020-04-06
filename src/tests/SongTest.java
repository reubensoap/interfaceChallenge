package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import interfaceCode.*;

class SongTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void testSong() {
		Song testSong = new Song("Yes Yes Yes", "The Yeses");
		assertNotNull(testSong);
	}

	@Test
	void testSetPlaybackSpeed() {
		Song testSong1 = new Song("Yes Yes Yes", "The Yeses");
		testSong1.setPlaybackSpeed(1.5f);
		assertEquals(1.5f, testSong1.speed);
	}

	@Test
	void testGetName() {
		Song testSong1 = new Song("Yes Yes Yes", "The Yeses");
		assertEquals("Yes Yes Yes", testSong1.getName());
	}

	@Test
	void testGetArtist() {
		Song testSong1 = new Song("Yes Yes Yes", "The Yeses");
		assertEquals("The Yeses", testSong1.getArtist());
	}

}
