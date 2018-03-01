package sia.knights;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * Created by Leo.
 * User: Leo.fp
 * Date: 28/02/2018
 * Time: 10:44 PM
 */
@Configuration
@EnableAspectJAutoProxy
public class AspectJAutoProxyConfig {
    @Bean
    public UserService userService(){
        return new UserService();
    }
    @Bean
    public UserAspect userAspect(){
        return new UserAspect();
    }
}
