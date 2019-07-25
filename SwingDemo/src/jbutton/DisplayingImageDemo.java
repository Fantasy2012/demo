package jbutton;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class DisplayingImageDemo {
  DisplayingImageDemo() {
    JFrame f = new JFrame("Button Example");
    String url = "src\\resources\\btnregister.png";
    JButton b = new JButton(new ImageIcon(url));
    b.setBounds(100, 100, 100, 40);
    f.add(b);
    f.setSize(500, 500);
    f.setLayout(null);
    f.setVisible(true);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }

  public static void main(String[] args) {
    new DisplayingImageDemo();
  }
}
