package sia.knights.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import java.io.PrintStream;

/**
 * Created by Leo.
 * User: Leo.fp
 * Date: 01/03/2018
 * Time: 8:43 PM
 */
@Configuration
@EnableAspectJAutoProxy
@ComponentScan({"sia.knights"})
public class KnightConfig {
    @Bean
    public PrintStream printStream() {
        return new PrintStream(System.out);
    }
}
