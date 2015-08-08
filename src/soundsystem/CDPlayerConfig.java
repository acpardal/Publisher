package soundsystem;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages="soundsystem"/*basePackageClasses={CompactDisc.class}*/)
public class CDPlayerConfig {

}
