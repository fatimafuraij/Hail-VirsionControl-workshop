/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buttonphoto;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

class ButtonFrame  extends JFrame{
private final JButton plainB;
private final JButton fancyB;

    public ButtonFrame()  {
      super(" bb");
     setLayout(new FlowLayout());
      plainB=new JButton("plain");
     
      add(plainB);
     Icon bug1=new ImageIcon(getClass().getResource("download.jpg")) ;
      Icon bug2=new ImageIcon(getClass().getResource("download1.png")) ;
    fancyB=new JButton("fancy Button",bug1);
     
     add(fancyB);
     fancyB.setRolloverIcon(bug2);
      Texthadlar handler =new Texthadlar();
     plainB.addActionListener(handler);
     fancyB.addActionListener(handler);



}
  private class Texthadlar implements ActionListener{
   
        @Override
        public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(ButtonFrame.this,  String.format("you pressed %s", e.getActionCommand()));
        
        }
      

    }}

public class Buttonphoto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      ButtonFrame cheack=new ButtonFrame();
       cheack .setSize(300,150);
      cheack.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       cheack.setVisible(true);
    }
    
}
