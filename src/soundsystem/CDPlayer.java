package soundsystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//@Named
@Component
public class CDPlayer implements MediaPlayer {
	private CompactDisc cd;

	//@Inject
	@Autowired(required=false)
	public CDPlayer(CompactDisc cd) {
		this.cd = cd;
	}
	
	//@Inject
	@Autowired
	public void setCompactDisc(CompactDisc cd) {
		this.cd = cd;
	}
	
	@Override
	public void play() {
		cd.play();
	}
}
