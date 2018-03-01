package sia.knights;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.PrintStream;

@Component
public class SlayDragonQuest implements Quest {

  @Autowired
  public SlayDragonQuest(PrintStream stream) {
    System.out.println("SlayDragonQuest Constructor");
  }

  public void embark() {
    System.out.println("Embarking on quest to slay the dragon!");
  }

}
