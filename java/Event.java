import java.awt.*;
import java.awt.event.*;

public class Event {

	public static void main(String[] args) {
		
		Frame f = new Frame("Event example");
		final TextField tf = new TextField();
		tf.setBounds(50,50, 100, 100);
		Button b = new Button("Click me!");
		b.setBounds(50, 100, 55, 120);
		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tf.setText("Welcome to javaport");
			}
		});
		f.add(b);
		f.add(tf);
		f.setSize(500, 500);
		f.setVisible(true);
	}
}