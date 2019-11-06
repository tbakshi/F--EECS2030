package ex1;

import java.awt.Color;

public final class Gray implements Comparable<Gray> {

	final private double gray;
	final private boolean isInt;

	static final double MAX_DOUBLE_VALUE = 1.0;
	static final int MAX_INT_VALUE = 255;
	static final double MIN_DOUBLE_VALUE = 0.0;
	static final int MIN_INT_VALUE = 0;

	Gray(double g) {
		if (g < 0.0 || g > 1.0) {
			throw new IllegalArgumentException("value must be between 0 and 1");
		} else {
			this.gray = g;
			this.isInt = false;
		}
	}
	
	public Gray (int g) { 
		if(g <0 || g> 255) { 
			throw new IllegalArgumentException(); 
		}
		else { 
			this.gray = g; 
			this.isInt = true; 
		}	
		
	}
	
	public Gray(Gray other) {
		this.gray = other.gray;
		this.isInt = other.isInt;
		
	}

	public int asInt() {
		return Gray.toInt(this.gray);
	}
	


	public double asDouble() {
		return Gray.toDouble(this.gray);
	}
	
	public static double toDouble(int value) { 
		if(value<0 || value> 255) { 
			throw new IllegalArgumentException();
		}
		else { 
			return value/Gray.MAX_DOUBLE_VALUE;
		}
		
	public static int toInt (double value) {
		
		
		
	}
		
	}
	
	
	
	
	
	
	
}
