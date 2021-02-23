package prob2;

public class CD extends LendingItem {

	private int priductId;
	private String company;

	public CD(int priductId, String title, String company) {
		super(title);
		this.priductId = priductId;
		this.company = company;
	}

	public int getPriductId() {
		return priductId;
	}

	public String getCompany() {
		return company;
	}

}
