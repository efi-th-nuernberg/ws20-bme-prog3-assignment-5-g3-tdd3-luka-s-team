public class Life implements ILife {

  private final int ROWS = 5;
  private final int COLUMNS = 5;
  private char[][] lifePhase = new char[ROWS][COLUMNS];
  
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
        if (setup[y].charAt(x) != ' ') setAlive(x, y);
        else setDead(x,y);
  }


  @Override
  public void nukeAll() {
    for (int y = 0; y < ROWS; y++)
      for (int x = 0; x < COLUMNS; x++)
      setDead(x,y);
  }

  @Override
  public void setAlive(int x, int y) {
    lifePhase[x][y] = '*';
  }

  @Override
  public void setDead(int x, int y) {
    lifePhase[x][y] = ' ';
  }

  @Override
  public boolean isAlive(int x, int y) {
    if(lifePhase[x][y] == '*')
      return true;
    return false;
  }

  @Override
  public ILife nextGeneration() {
    Life nextGen = new Life();
      for (int y = 0; y < ROWS; y++){
        for (int x = 0; x < COLUMNS; x++){
          if (lifePhase[y][x] == '*' && (numberOfLivingCellsAround(y, x) == 2 && numberOfLivingCellsAround(y, x) == 3)) { // Living cell
            nextGen.setAlive(x, y);
          } else if (lifePhase[y][x] == ' ' && numberOfLivingCellsAround(y, x) == 3) {
            nextGen.setAlive(x, y);
          } else {
            nextGen.setDead(x, y);
          }
        }
      }
      return nextGen;
  }
    
  private int numberOfLivingCellsAround(int x, int y) {
    int aliveCells = 0;
    for(int row = y-1; row <= y+1; row++){
      if(row>=0 && row < ROWS){
        for(int column = x-1; column <= x+1; column++){
          if(column>=0 && column < COLUMNS)
          if(lifePhase[row][column]=='*') aliveCells++;
        }
      }
    }
    if(lifePhase[y][x]=='*') aliveCells--;
    System.out.println(x + ", " + y + ", " + aliveCells);
    return aliveCells;
  }
}