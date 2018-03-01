package sia.knights;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * Created by Leo.
 * User: Leo.fp
 * Date: 28/02/2018
 * Time: 10:44 PM
 */
@Aspect
public class UserAspect {
    @Before("execution(* *.doTask(..))")
    public void userAdvice(){
        System.out.println("find my advice before your task.");
    }
}
