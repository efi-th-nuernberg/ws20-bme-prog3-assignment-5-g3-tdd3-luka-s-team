public class Life implements ILife {

  private int rowSize = 5;
  private int columnSize = 5;
  private boolean[][] lifePhase = new boolean[rowSize][columnSize];

  /*public static void main(String[] args) {
    Life l = new Life(new String[] { "     ", "     ", " *** ", "     ", "     " });
    l = (Life) l.nextGeneration();
  }

  public Life(String[] setup) {
    this();
    for (int row = 0; row < setup.length; row++)
      for (int column = 0; column < setup[row].length(); column++)
        if (setup[row].charAt(column) != ' ' || (livingNeighbours(row, column) == 3))
          setAlive(row, column);
  }*/

  public Life() {
    nukeAll();
  }

  @Override
  public void nukeAll() {
    for (int row = 0; row < rowSize; row++)
      for (int column = 0; column < columnSize; column++)
        setDead(row, column);
  }

  @Override
  public void setAlive(int row, int column) {
    lifePhase[row][column] = true;
  }

  @Override
  public void setDead(int row, int column) {
    lifePhase[row][column] = false;
  }

  @Override
  public boolean isAlive(int row, int column) {
    if (lifePhase[row][column] == true)
      return true;
    return false;
  }

  @Override
  public ILife nextGeneration() {
    Life nextLifePhase = new Life();
    for (int row = 0; row < rowSize; row++){
      for (int column = 0; column < columnSize; column++){
        if(lifePhase[row][column] == true && (livingNeighbours(row,column) == 2 || livingNeighbours(row, column) == 3))
          nextLifePhase.setAlive(row, column);
        else if((lifePhase[row][column] == false) && (livingNeighbours(row, column) == 3))
          nextLifePhase.setAlive(row, column);
        else
          nextLifePhase.setDead(row, column);       
      System.out.println(row + " " + column + " " + lifePhase[row][column] + " -> " + livingNeighbours(row,column) + " " + nextLifePhase.lifePhase[row][column]);
      }
    }
    return nextLifePhase;
  }

  private int livingNeighbours(int row, int column) {
    int livingNeighbours = 0;
    for (int y = (row - 1); y <= (row + 1); y++) {
      for (int x = (column - 1); x <= (column + 1); x++)
        if ((y >= 0) && (y < rowSize) && (x>=0) && (x<columnSize)) //included in array and not the given position
          if (lifePhase[y][x] == true)
            livingNeighbours++;
    }
    if(lifePhase[row][column] == true){livingNeighbours--;}
    return livingNeighbours;
  }
}