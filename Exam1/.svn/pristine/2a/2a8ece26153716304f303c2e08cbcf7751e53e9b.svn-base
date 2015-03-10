import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Shape;
import java.awt.geom.Ellipse2D;
import java.util.ArrayList;

import javax.swing.JComponent;

/**
 * Draws some clocks.
 * 
 * @author Zachary Haloski.
 */
public class ClockComponent extends JComponent {

	private ArrayList<Clock> clocks;
	//int currentClock = 0;

	/** 
	 * Constructor to initialize the ArrayList of clocks.	 
	 */
	public ClockComponent() {
		this.clocks = new ArrayList<Clock>();
	}

	/**
	 * Add a clock, using the given parameters to construct the clock to add.
	 * 
	 * @param centerX
	 * @param centerY
	 * @param radius
	 * @param currentHour
	 */
	public void addClock(int centerX, int centerY, int radius, int currentHour, int currentMinute) {
		Clock clockToAdd = new Clock(centerX, centerY, radius, currentHour, currentMinute);
		this.clocks.add(clockToAdd);
		
	}

	/**
	 * Advances time for all clocks
	 */
	public void tickTock() {
		for(Clock clock : this.clocks){
			clock.tick();

		}
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);

		Graphics2D g2 = (Graphics2D) g;
		for(Clock clock : this.clocks)
			clock.drawOn(g2);
		}
//		for(Clock clock : this.clocks){
//			Ellipse2D.Double clockToDraw = new Ellipse2D.Double();
//		}
		
		//TODO: Draw all the clocks
		
		
	}
