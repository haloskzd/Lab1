import java.awt.BorderLayout;

import javax.swing.JFrame;

/**
 * Displays a window with buttons to allow the user to add clocks and advance
 *  time.
 * 
 * @author Micah Taylor and Greg Wilkin. Created Dec 19, 2012; modified March 25, 2013.
 */
public class ClockMain {
	private static final int WIDTH = 800;
	private static final int HEIGHT = 800;

	/**
	 * Creates and sets up the JFrame window, the ClockComponent, and the
	 * buttons.
	 * 
	 * @param args
	 *            Command-line arguments, ignored here
	 */
	public static void main(String[] args) {
		JFrame frame = new JFrame();

		frame.setSize(WIDTH, HEIGHT);
		frame.setTitle("Exam 1 Clocks");

		final ClockComponent clockComp = new ClockComponent();
		
		frame.add(clockComp);

		final ClockAddButton newClockButton = new ClockAddButton(clockComp);
		frame.add(newClockButton, BorderLayout.SOUTH);

		final ClockTickButton newTickButton = new ClockTickButton(clockComp);
		frame.add(newTickButton, BorderLayout.NORTH);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

}
