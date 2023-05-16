import java.awt.*;
import java.awt.event.*;

public class Frame3 extends Frame {
	Label label1, label2; Button b1, b2;
	Frame3(String title) {
		super(title);
		setBackground(Color.white);
		setForeground(Color.blue);
		setSize(300, 200);
		setVisible(true);
		setLayout(new FlowLayout());
		setFont(new Font("Arial", Font.ITALIC, 18));
		label1 = new Label("First Label  ");
		label2 = new Label("Second Label  ");
		add(label1); add(label2);
		b1 = new Button("Click b1");
		b2 = new Button("Click b2");
		add(b1); add(b2);	

		addWindowListener(new MyClass()); //Window event registration
	}

	public static void main(String[] args) {
		new Frame3("Frame demo");
	}
}


class MyClass extends WindowAdapter {
	public void windowClosing(WindowEvent we) {
		System.exit(0);
	}
}
