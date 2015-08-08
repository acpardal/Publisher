package soundsystemconfig;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import soundsystem.BlankDisc;
import soundsystem.CompactDisc;
import soundsystem.SgtPeppers;

@Configuration
public class CDConfig {

	@Bean
	public CompactDisc sgtPeppers() {
		return new SgtPeppers();
	}
	
//	@Bean
//	public CompactDisc blankDisc() {
//		List<String> tracks = new ArrayList<>();
//		tracks.add("Sgt. Pepper's Lonely Hearts Club Band");
//		tracks.add("With a Little Help from My Friends");
//		tracks.add("Lucy in the Sky with Diamonds");
//		tracks.add("Getting Better");
//		tracks.add("Fixing a Hole");
//		
//		return new BlankDisc("Sgt. Pepper's Lonely Hearts Club Band", "The Beatles", tracks);
//	}
}
