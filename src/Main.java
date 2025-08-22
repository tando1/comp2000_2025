import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main extends JFrame {

    class Canvas extends JPanel {

      Grid grid;

      public Canvas() {
        setPreferredSize(new Dimension(720, 720));
        grid = new Grid();  
      }

      @Override
      public void paint(Graphics g) {
        //this is the place of interest
        //this is where things began to be drawn onto the screen
	      grid.paint(g);
      }
    }
    public static void main(String[] args) throws Exception {
      Main window = new Main();
      window.run();
    
    }
    
    private Main() {
      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      Canvas canvas = new Canvas();
      this.setContentPane(canvas);
      this.pack();
      this.setVisible(true);
    }
  

    public void run() throws InterruptedException {
      while(true) {
        long start = System.currentTimeMillis();
        repaint();
        long end = System.currentTimeMillis();
        Thread.sleep(331 - (end-start));
      }
    }
}
