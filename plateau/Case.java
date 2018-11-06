package plateau;

public abstract class Case {
	boolean clickable = true;
	
	public boolean getClickable() {
		return clickable;
	}
	
	public String toString() {
		if (clickable) {
			return " ";
		}
		else {
			return "X";
		}
	}
}
