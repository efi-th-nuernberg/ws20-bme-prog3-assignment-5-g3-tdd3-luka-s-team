public class Life implements ILife {
  
  public static void main(String[] args) {
    Life l = new Life(new String[] {  "     ",
                                      "     ",
                                      " *** ",
                                      "     ",
                                      "     " });
    l = (Life) l.nextGeneration();
  }


  public Life() {
    nukeAll();
  }

  public Life(String[] setup) {
    this();
    for (int y = 0; y < setup.length; y++)
      for (int x = 0; x < setup[y].length(); x++)
        if (setup[y].charAt(x) != ' ')
          setAlive(x, y);
  }


  @Override
  public void nukeAll() {
    // TODO Auto-generated method stub

  }

  @Override
  public void setAlive(int x, int y) {
    // TODO Auto-generated method stub

  }

  @Override
  public void setDead(int x, int y) {
    // TODO Auto-generated method stub

  }

  @Override
  public boolean isAlive(int x, int y) {
    // TODO Auto-generated method stub
    return false;
  }

  @Override
  public ILife nextGeneration() {
    // TODO Auto-generated method stub
    return null;
  }
}