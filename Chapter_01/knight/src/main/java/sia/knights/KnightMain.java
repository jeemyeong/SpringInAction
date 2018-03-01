package sia.knights;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import sia.knights.config.KnightConfig;

public class KnightMain {

  public static void main(String[] args) throws Exception {
    ApplicationContext ac = new AnnotationConfigApplicationContext(KnightConfig.class);
    Knight knight = ac.getBean(Knight.class);
    knight.embarkOnQuest();
  }

}
