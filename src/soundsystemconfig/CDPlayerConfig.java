package soundsystemconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import soundsystem.CDPlayer;
import soundsystem.CompactDisc;
import soundsystem.MediaPlayer;

@Configuration
//@ComponentScan(basePackages="soundsystem"/*basePackageClasses={CompactDisc.class}*/)
public class CDPlayerConfig {

	@Bean
	public MediaPlayer cdPlayer(CompactDisc cd) {
		return new CDPlayer(cd);
	}
}
