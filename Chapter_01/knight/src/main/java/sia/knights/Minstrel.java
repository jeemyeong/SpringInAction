package sia.knights;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.PrintStream;

@Aspect
@Component
public class Minstrel {

  public Minstrel() {
    System.out.println("Minstrel Constructor");
  }

  @Pointcut("execution(* *.embarkOnQuest(..))")
  public void performance() {}

  @Before("performance()")
  public void singBeforeQuest() {
    System.out.println("\nFa la la, the knight is so brave!");
  }

  @AfterReturning("performance()")
  public void singAfterQuest() {
    System.out.println("Tee hee hee, the brave knight " +
    		"did embark on a quest!");
  }

}
