import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

/**
 * A JButton that, when pressed, generates parameters for constructing a new
 * clock object and passes them to a ClockComponent.
 * 
 * @author Micah Taylor and Greg Wilkin. Created Dec 19, 2012; modified March 25, 2013.
 */
public class ClockAddButton extends JButton implements ActionListener {
	private ClockComponent clockComp;
	private static final double MAX_RADIUS = 100;

	/**
	 * Sets the text for this button, adds itself as an ActionListener (that
	 * responds to button presses), and stores the given ClockComponent.
	 * 
	 * @param clockComp
	 *            ClockComponent to use when button is pressed
	 */
	public ClockAddButton(ClockComponent clockComp) {
		super("Add a clock");
		this.clockComp = clockComp;

		this.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		double radius = Math.random() * MAX_RADIUS;
		double centerX = Math.random() * (this.clockComp.getWidth() - radius*2) + radius;
		double centerY = Math.random() * (this.clockComp.getHeight() - radius*2) + radius;
		int currentHour = (int) (Math.random() * 12 + 1);
		int currentMinute = (int) (Math.random() * 12 + 1) * 5;

		this.clockComp.addClock((int) centerX, (int) centerY, (int) radius,
				currentHour, currentMinute);
		this.clockComp.repaint();
	}
}
