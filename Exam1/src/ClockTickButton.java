import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

/**
 * A JButton that, when pressed, tells its ClockComponent to advance time.
 * 
 * @author Micah Taylor. Created Dec 19, 2012.
 */
public class ClockTickButton extends JButton implements ActionListener {
	private ClockComponent clockComp;

	/**
	 * Sets the text for this button, adds itself as an ActionListener (that
	 * responds to button presses), and stores the given ClockComponent.
	 * 
	 * @param clockComp
	 *            ClockComponent to use when button is pressed
	 */
	public ClockTickButton(ClockComponent clockComp) {
		super("Tick tock!");
		this.clockComp = clockComp;

		this.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		this.clockComp.tickTock();
		this.clockComp.repaint();
	}

}
