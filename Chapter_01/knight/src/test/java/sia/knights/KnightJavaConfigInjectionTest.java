package sia.knights;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

import java.io.PrintStream;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes= sia.knights.config.KnightConfig.class,loader=AnnotationConfigContextLoader.class)
public class KnightJavaConfigInjectionTest {

  @Autowired
  Knight knight;
  
  @Autowired
  FakePrintStream printStream;

  @Autowired
  PrintStream printStream2;

  @After
  public void clearPrintStream() {
    printStream.clear();
  }

  @Test
  public void shouldInjectKnightWithSlayDragonQuest() {
    System.out.println(printStream == printStream2);
    knight.embarkOnQuest();
    assertEquals(
        "Embarking on quest to slay the dragon!\n", 
        printStream.getPrintedString());
  }

}
