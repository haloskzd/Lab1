import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;

/**
 * A clock that tracks hours and minutes and can be drawn.
 * 
 * @author Zachary Haloski.
 */
public class Clock {
	private static final double TICK_SCALE = 0.2;
	private static final double HOUR_HAND_SCALE = 0.5;
	private static final double MINUTE_HAND_SCALE = 0.7;
	private static final int NUM_HOURS = 12;
	private static final int NUM_MINUTES = 60;
	private static final int Radians_IN_CIRCLE = 360;
	private static final Color CLOCK_COLOR = Color.BLACK;
	private static final Color MINUTE_COLOR = Color.blue;
	private static final Color HOUR_COLOR = Color.red;

	private int currentHour;
	private int currentMinute;
	private int radius;
	private int centerX;
	private int centerY;
	private int angleInRadians;

	/**
	 * Creates a clock object using the supplied parameters.
	 * 
	 * @param centerX
	 * @param centerY
	 * @param radius
	 * @param currentHour
	 */
	public Clock(int centerX, int centerY, int radius, int currentHour, int currentMinute) {
		//TODO: Implement this constructor.  If an hour < 1 is passed, start at 12
		//If a minute < 0 is passed, start at 0
		
		this.centerX = centerX;
		this.centerY = centerY;
		this.radius = radius;
		this.currentHour = currentHour;
		this.currentMinute = currentMinute;
	}

	/**
	 * Advances minutes by 5, increasing the hour if going from 55 to 0.
	 * Minutes not to exceed 55, hours not to exceed 12
	 */
	public void tick() {
		//if(this.angleInRadians )
		if(this.currentMinute < 60){
			this.currentMinute += 5;
		} else{
			this.currentMinute = 0;
		}
		System.out.println(this.currentMinute);
	}

	/**
	 * Draw a clock with an hour hand, minute hand and tick marks. The clock's
	 * center should be based at (centerX, centerY). The clock's outlining
	 * circle should use the given radius. On the inside of the circle, 12 tick
	 * marks should be drawn touching the circle outline, and reaching towards
	 * the center. The tick marks should be of length tickScale * radius.
	 * The clock's minute hand should be drawn from the center towards
	 * the tick mark that represents the current minute with a length of
	 * minuteHandScale * radius. Finally, the clock's hour hand should be drawn
	 * from the center towards the tick mark that represents the current minute
	 * with a length of hourHandScale * radius.
	 * 
	 * tickScale should be 0.2, minuteHandScale should be 0.7 and hourHandScale 
	 * should be 0.5
	 * 
	 * @param g2
	 */
	public void drawOn(Graphics2D g2) {
		//TODO: Draw the clock, tick marks, the minute hand and the hour hand
		//Draw the each part of the clock according to the color as specified 
		//by the constants defined above
		
		g2.translate(this.centerX, this.centerY);
		Ellipse2D.Double aClock = new Ellipse2D.Double(-this.radius, -this.radius, 2*this.radius, 2*this.radius);
		g2.setColor(CLOCK_COLOR);
		g2.draw(aClock);
		Line2D.Double hourHand = new Line2D.Double(0*HOUR_HAND_SCALE, 
				-this.radius*HOUR_HAND_SCALE, 0, 0);
		g2.setColor(HOUR_COLOR);
		g2.draw(hourHand);
		Line2D.Double minuteHand = new Line2D.Double (-this.radius*MINUTE_HAND_SCALE*Math.cos(this.currentMinute/60), 
				Math.sin(this.currentMinute/60)*-this.radius*MINUTE_HAND_SCALE, 0, 0);
		g2.setColor(MINUTE_COLOR);
		g2.draw(minuteHand);
		g2.translate(-this.centerX, -this.centerY);
	}
	/**
	 * TODO Put here a description of what this method does.
	 *
	 * @param translateX
	 * @param translateY
	 */
	public void translate(double translateX, double translateY) {
		  this.centerX += translateX;
		  this.centerY += translateY;
	  }

}
