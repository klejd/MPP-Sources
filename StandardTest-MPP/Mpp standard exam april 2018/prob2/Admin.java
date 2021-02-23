package prob2;

public class Admin {
	// Returns a String representation of the due date of the CD with title
	// "Frowning",
	// if it is checked out; if
	// it is not checked out, returns the String "not checked out"
	// Remember that a lending item is "checked out" if it is not available
	public static String getFrowningCD(LibraryMember[] members) {
		// implement
		String output = "not checked out";
		for (LibraryMember member : members) {
			CheckoutRecord record = member.getCheckoutRecord();
			for (CheckoutRecordEntry entry : record.getCheckoutEntryList()) {
				LendingItem lendingItem = entry.getLendingItem();
				if (lendingItem instanceof CD)
					if (lendingItem.getTitle().equals("Frowning") && !lendingItem.isAvailable()) {
						output = entry.getDueDate().toString();
						break;
					}
			}
			if (!output.equals("not checked out")) {
				break;
			}
		}
		return output;
	}
}
