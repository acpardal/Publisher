package soundsystemTests;

import static org.junit.Assert.*;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import soundsystem.CompactDisc;
import soundsystem.MediaPlayer;
import soundsystemconfig.CDPlayerConfig;
import soundsystemconfig.SoundSystemConfig;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=SoundSystemConfig.class)
public class CDPlayerTest {

	@Rule
	public final SystemOutRule log = new SystemOutRule().enableLog();
	
	@Autowired
	private MediaPlayer player;
	
	@Autowired
	private CompactDisc cd;
	
	@Test
	public void cdShouldNotBeNull() {
		assertNotNull(cd);
	}
	
	//I'm testing this in windows so \r\n
	@Test
	public void play() {
		player.play();
		assertEquals("Playing Sgt. Pepper's Lonely Hearts Club Band" +
				" by The Beatles\r\n",log.getLog());
	}
}
