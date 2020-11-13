import org.junit.Test;
import static org.junit.Assert.*;

public class LifeTest {
    
    @Test
    public void createNewCell() {
        
        // Arrange: drei lebende Zellen
        Life l = new Life();
        l.setAlive(0, 0);
        l.setAlive(0, 1);
        l.setAlive(0, 2);

        // Act: Berechnung der Folgegeneration
        ILife nextGen = l.nextGeneration();

        // Assert: Rasterpunkt mit drei Nachbarn sollte jetzt leben
        assertTrue(nextGen.isAlive(1, 1));
        System.out.println("Test1 done");
    }


    @Test
    public void destroyLonelyCell() {
       Life l = new Life();
        l.setAlive(0, 0);
        l.setAlive(0, 1);
        l.setAlive(0, 2);
        l.setAlive(0, 4);
         ILife nextGen = l.nextGeneration();
      assertFalse(nextGen.isAlive(0, 4));
      System.out.println("Test2 done");
    }


   @Test
    public void keepAliveCell() {
      Life l = new Life();
        l.setAlive(0, 0);
        l.setAlive(0, 1);
        l.setAlive(0, 2);
        l.setAlive(1, 1);
        ILife nextGen = l.nextGeneration();
      assertTrue(nextGen.isAlive(0, 1));
      System.out.println("Test3 done");
    }


    @Test
    public void destroyCrowdedCell() {
      Life l = new Life();
        l.setAlive(0, 0);
        l.setAlive(0, 1);
        l.setAlive(0, 2);
        l.setAlive(1, 1);
        l.setAlive(1, 0);
        l.setAlive(1, 2);
        l.setAlive(2, 2);
        l.setAlive(2, 0);
      ILife nextGen = l.nextGeneration();
      assertFalse(nextGen.isAlive(1, 1));
      System.out.println("Test4 done");
    }


}
