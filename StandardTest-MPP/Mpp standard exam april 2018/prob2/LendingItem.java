package prob2;

public class LendingItem {
	private int numCopiesInLib;
	private String title;
	private boolean isAvailable;

	public LendingItem(String title) {
		super();
		this.title = title;
	}

	public int getNumCopiesInLib() {
		return numCopiesInLib;
	}

	public void setNumCopiesInLib(int numCopiesInLib) {
		this.numCopiesInLib = numCopiesInLib;
	}

	public boolean isAvailable() {
		return isAvailable;
	}

	public void isAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}

	public String getTitle() {
		return title;
	}
	
	

}
