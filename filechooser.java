package array;
import java.io.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.filechooser.*;
class filechooser extends JFrame implements ActionListener 
{
	static JLabel l;
	filechooser()
	{
	}

	public static void main(String args[])
	{
		JFrame f = new JFrame("file chooser");
		f.setSize(400, 400);

		f.setVisible(true);

		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JButton button1 = new JButton("save");
		JButton button2 = new JButton("open");
		filechooser f1 = new filechooser();
		button1.addActionListener(f1);
		button2.addActionListener(f1);
		JPanel p = new JPanel();
		p.add(button1);
		p.add(button2);

		
		l = new JLabel("no file selected");
		p.add(l);
		f.add(p);

		f.show();
	}
	public void actionPerformed(ActionEvent evt)
	{
		
		String com = evt.getActionCommand();

		if (com.equals("save")) 
		{
			JFileChooser j = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
			int r = j.showSaveDialog(null);

			// if the user selects a file
			if (r == JFileChooser.APPROVE_OPTION)

			{
				
				l.setText(j.getSelectedFile().getAbsolutePath());
			}
		
			else
				l.setText("the user cancelled the operation");
		}

	
		else {

			JFileChooser j = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());

			int r = j.showOpenDialog(null);

		
			if (r == JFileChooser.APPROVE_OPTION)

			{
			
				l.setText(j.getSelectedFile().getAbsolutePath());
			}
			else
				l.setText("the user cancelled the operation");
		}
	}
}
