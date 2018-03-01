package sia.knights;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by Leo.
 * User: Leo.fp
 * Date: 28/02/2018
 * Time: 10:44 PM
 */
public class UserMain {
    public static void main(String[] args) throws Exception {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AspectJAutoProxyConfig.class);

        UserService userService = ctx.getBean(UserService.class);
        userService.doTask();
    }
}
