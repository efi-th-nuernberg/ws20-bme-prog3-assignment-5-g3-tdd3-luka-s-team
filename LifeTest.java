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

        System.out.println();

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
        l.setAlive(0, 2);
        l.setAlive(1, 1);

         System.out.println();

        // Act: Berechnung der Folgegeneration
        ILife nextGen = l.nextGeneration();

        // Assert: Alle Zellen bis auf 1,1 sollten absterben
        assertFalse(nextGen.isAlive(0, 0));
        assertFalse(nextGen.isAlive(0, 2));
        assertTrue(nextGen.isAlive(1, 1));
        System.out.println("Test2 done");
    }


   @Test
    public void keepAliveCell() {
      Life l = new Life();
        l.setAlive(0, 0);
        l.setAlive(0, 1);
        l.setAlive(1, 1);

         System.out.println();

        // Act: Berechnung der Folgegeneration
        ILife nextGen = l.nextGeneration();

        // Assert: Alle Zellen sollten überleben
        assertTrue(nextGen.isAlive(0, 0));
        assertTrue(nextGen.isAlive(0, 1));
        assertTrue(nextGen.isAlive(1, 1));
        System.out.println("Test3 done");
    }


    @Test
    public void destroyCrowdedCell() {
      for(int neighbours = 4; neighbours <9; neighbours++){
      Life l = new Life();
        l.setAlive(0, 0);
        l.setAlive(0, 1);
        l.setAlive(0, 2);
        l.setAlive(1, 0);
        if(neighbours == 5){
          l.setAlive(1, 2);
        }
        if(neighbours == 6){
          l.setAlive(2,0);
        }
        if(neighbours == 7){
          l.setAlive(2,1);
        }
        if(neighbours == 8){
          l.setAlive(2,2);
        }

         System.out.println();

        // Act: Berechnung der Folgegeneration
        ILife nextGen = l.nextGeneration();

        // Assert: 1,1 sollte immer absterben
          assertFalse(nextGen.isAlive(1, 1));

        System.out.println("Test3 - done with " + neighbours + " neighbours");
      }
    }


}
