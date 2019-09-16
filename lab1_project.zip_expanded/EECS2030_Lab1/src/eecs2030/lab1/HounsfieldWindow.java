package eecs2030.lab1;

/**
 * A class that represents a windowed view of Hounsfield units. A Hounsfield
 * window is defined by two values: (1) the window level, and (2) the window
 * width. The window level is the Hounsfield unit value that the window is
 * centered on. The window width is the range of Hounsfield unit values that the
 * window is focused on.
 * 
 * <p>
 * A window has a lower and upper bound. The lower bound is defined as the
 * window level minus half the window width:
 * 
 * <p>
 * lo = level - (width / 2)
 * 
 * <p>
 * The upper bound is defined as the window level plus half the window width:
 * 
 * <p>
 * hi = level + (width / 2)
 * 
 * <p>
 * Hounsfield units are mapped by the window to a real number in the range of
 * {@code 0} to {@code 1}. A Hounsfield unit with a value less than lo is mapped
 * to the value {@code 0}. A Hounsfield unit with a value greater than hi is
 * mapped to the value {@code 1}. A Hounsfield unit with a value v between lo
 * and hi is mapped to the value:
 * 
 * <p>
 * (v - lo) / width
 * 
 *
 */
public class HounsfieldWindow {
	private int level, width; 

	public HounsfieldWindow() {
		level = 0;
		width = 400;

	}

	public HounsfieldWindow(int level, int width) {
		setLevel(level);
		setWidth(width);
	}

	public int getLevel() {
		return this.level;
	}

	public int getWidth() {
		return this.width;
	}

	public int setLevel(int level) {
		if (level < Hounsfield.MIN_VALUE || level > Hounsfield.MAX_VALUE) {
			throw new IllegalArgumentException();
		}
		int old = this.level;
		this.level = level;
		return old;

	}

	public int setWidth(int width) {
		if (width < 1) {
			throw new IllegalArgumentException();
		}
		int old = this.width;
		this.width = width;
		return old;
	}

	public double map(Hounsfield h) {

		double lo = level - (double) width / 2;
		double hi = level + (double) width / 2;




		if(h.get()<lo) {
			return 0.0; 
		}
		else if (h.get()>hi) {
			return 1.0; 
		}
		else { 
			return (double) (h.get()-lo)/width; 
		}

	}

}
