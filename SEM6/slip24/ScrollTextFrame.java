import java.awt.*;
import javax.swing.*;

class ScrollThread extends Thread {
    ScrollTextFrame stm;

    ScrollThread(ScrollTextFrame stm) {
        this.stm = stm;
    }

    public void run() {
        while (true) {
            try {
                if (stm.x < stm.getWidth())
                    stm.x = stm.x + 5;
                else
                    stm.x = 0;

                stm.repaint();

                Thread.sleep(1000);
            } catch (InterruptedException ie) {
                System.out.println("Error" + ie);
            }
        }
    }
}

class ScrollTextFrame extends JFrame {
    String str = "Hello World!";
    ScrollThread t;
    int x;

    ScrollTextFrame() {
        setSize(700, 300);
        setTitle("Sarvesh Deshmukh!");

        t = new ScrollThread(this);
        t.start();

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.RED);
        g.drawString(str, x, 50);
    }

    public static void main(String[] args) {
        new ScrollTextFrame();
    }
}
