package plateau;

public class PlateauTir extends Plateau{

	
	public void selectionCase() {
		
	}
	
	public void tir(int colTir, int ligTir) {
		this.tabCase[colTir][ligTir] = new CaseRate();
	}
	
	public boolean caseDejaTir(int colTir, int ligTir) {
		return tabCase[colTir][ligTir].getClickable();
	}
	
}
