package array;
import java.awt.*;
import java.awt.event.*;
public class Main {
   // main function
 public static void main(String[] args){
     Frame f = new Frame("AWT ActionListener Example");
       f.setSize(400, 200);
     f.setLayout(null);
    f.setVisible(true);
       f.setBackground(Color.LIGHT_GRAY);
     Button b = new Button("Click Me");
     b.setBounds(160, 100, 80, 40);
     
       
     f.add(b);
     b.setBackground(Color.GREEN);

    
     TextField tf = new TextField();
     
      
     tf.setBounds(50, 50, 300, 30);
     
       
     f.add(tf);

     
     Label lb = new Label();
     
       
     lb.setBounds(100, 150, 300, 30);
     
       
     f.add(lb);

    
     b.addActionListener(new ActionListener() {
       
        
         public void actionPerformed(ActionEvent e){
             
               // Update the text of the label
             lb.setText("Hey " + tf.getText() + "! "
                        + "Welcome to GeeksforGeeks!");
         }
       
     });
 }
}

