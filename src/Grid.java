import java.awt.*;

class Grid {
  
  Cell[][] cells = new Cell[20][20];

  public Grid(){ //constructor
    for(int i = 0; i<cells.length; i++){
      for(int j = 0; j<cells[i].length; j++){
        cells[i][j] = new Cell();
      } 
    }
  }
  
  public void paint(Graphics g){
    for(int i = 0; i<cells.length; i++){
      for(int j = 0; j<cells[i].length; j++){
        cells[i][j] = new Cell();
      } 
    }
  }
}
  class Cell{
    }

