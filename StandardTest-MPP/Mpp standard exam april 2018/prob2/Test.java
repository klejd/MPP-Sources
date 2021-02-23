package prob2;

import java.time.LocalDate;

public class Test {
	//Expected output:
	//         2017-11-01
	
	//uncomment when you are ready to test
	
	public static void main(String[] args) {
		CD[] cds = {
				new CD(101, "Happy", "Warner Bros"),
				new CD(102, "Sad", "Warner Bros"),
				new CD(103, "Jumpin", "Mills Bros"),
				new CD(104, "Frowning", "Mills Bros"),
				new CD(105, "Joy", "Warner Bros")
		};
					
		Book[] books = {
				new Book("1040A5", "Gone with the Wind", "Bob", "Gearhart"),
				new Book("5241C3", "The Unhappy Indian", "Richard", "Steigert"),
				new Book("9982D1", "The Unseen Rock", "Stephen", "King"),
				new Book("1112E5", "Hunting", "Danielle", "Steele"),
				new Book("8008T4", "Overdrive", "Cougar", "Fox")
				
		};
		
		setNumCopies(cds, books);
		
		CheckoutRecordEntry[] entries = {
				new CheckoutRecordEntry(books[0], ItemType.BOOK),
				new CheckoutRecordEntry(books[1], ItemType.BOOK),
				new CheckoutRecordEntry(books[2], ItemType.BOOK),
				new CheckoutRecordEntry(books[3], ItemType.BOOK),
				new CheckoutRecordEntry(books[4], ItemType.BOOK),
				new CheckoutRecordEntry(books[0], ItemType.BOOK),
				new CheckoutRecordEntry(books[1], ItemType.BOOK),
				new CheckoutRecordEntry(books[2], ItemType.BOOK),
				new CheckoutRecordEntry(books[0], ItemType.BOOK),
				new CheckoutRecordEntry(books[1], ItemType.BOOK),
				new CheckoutRecordEntry(cds[0], ItemType.CD), //10
				new CheckoutRecordEntry(cds[3], ItemType.CD),
				new CheckoutRecordEntry(cds[4], ItemType.CD),
				new CheckoutRecordEntry(cds[2], ItemType.CD),
				new CheckoutRecordEntry(cds[1], ItemType.CD),
				new CheckoutRecordEntry(cds[2], ItemType.CD),
				new CheckoutRecordEntry(cds[1], ItemType.CD),
				new CheckoutRecordEntry(cds[2], ItemType.CD),
				new CheckoutRecordEntry(cds[1], ItemType.CD),
				new CheckoutRecordEntry(cds[2], ItemType.CD),
				new CheckoutRecordEntry(cds[1], ItemType.CD),
				new CheckoutRecordEntry(cds[2], ItemType.CD),
				new CheckoutRecordEntry(cds[1], ItemType.CD),
				new CheckoutRecordEntry(cds[3], ItemType.CD),
				new CheckoutRecordEntry(cds[1], ItemType.CD),
				new CheckoutRecordEntry(cds[4], ItemType.CD)//25
		};
	 for(int i = 0; i < entries.length; i++) {
		if(i > 4 && i< 13) {
			LocalDate dueDate = LocalDate.of(2017, i, 1);
			entries[i].setDueDate(dueDate);
			if(dueDate.isAfter(LocalDate.now())) {
				entries[i].getLendingItem().isAvailable(false);
			}
		} else if(i>12) {
			LocalDate dueDate = LocalDate.of(2017, 1+i%12, 1);
			entries[i].setDueDate(dueDate);
			if(dueDate.isAfter(LocalDate.now())) {
				entries[i].getLendingItem().isAvailable(false);
			}
		}
		
	 }
		CheckoutRecord[] records = {new CheckoutRecord(), new CheckoutRecord(), new CheckoutRecord(),
				new CheckoutRecord(), new CheckoutRecord(), new CheckoutRecord(),
				new CheckoutRecord(), new CheckoutRecord(), new CheckoutRecord()
		};
		records[0].addCheckoutEntry(entries[0]);
		records[0].addCheckoutEntry(entries[1]);
		records[0].addCheckoutEntry(entries[10]);
		records[0].addCheckoutEntry(entries[11]);
		
		records[1].addCheckoutEntry(entries[2]);
		records[1].addCheckoutEntry(entries[3]);
		records[1].addCheckoutEntry(entries[12]);
		records[1].addCheckoutEntry(entries[13]);
		
		records[2].addCheckoutEntry(entries[4]);
		records[2].addCheckoutEntry(entries[14]);
		records[2].addCheckoutEntry(entries[15]);
		
		records[3].addCheckoutEntry(entries[16]);
		records[3].addCheckoutEntry(entries[17]);
		
		records[4].addCheckoutEntry(entries[5]);
		records[4].addCheckoutEntry(entries[6]);
		records[4].addCheckoutEntry(entries[18]);
		
		records[5].addCheckoutEntry(entries[19]);
		records[5].addCheckoutEntry(entries[20]);
		
		records[6].addCheckoutEntry(entries[7]);
		records[6].addCheckoutEntry(entries[8]);
		records[6].addCheckoutEntry(entries[21]);
		records[6].addCheckoutEntry(entries[22]);
		
		records[7].addCheckoutEntry(entries[9]);
		records[7].addCheckoutEntry(entries[23]);
		records[7].addCheckoutEntry(entries[24]);
		
		records[8].addCheckoutEntry(entries[10]);
		records[8].addCheckoutEntry(entries[25]);
		
		
		//String id, String fname, String lname, String phone
		LibraryMember[] members = {
				new LibraryMember("1001", "Hank", "Reynolds", "323-4556"),
				new LibraryMember("1002", "Bob", "Montelbahn", "377-4112"),
				new LibraryMember("1003", "Methusalah", "King", "923-8756"),
				new LibraryMember("1004", "Moses", "Ofisrael", "802-5716"),
				new LibraryMember("1005", "Abraham", "McDonald", "333-7806"),
				new LibraryMember("1006", "Ricardo", "Thomas", "717-1235"),
				new LibraryMember("1007", "Enrico", "Alvarez", "989-1256"),
				new LibraryMember("1008", "Francois", "Cinquante", "347-1111"),
				new LibraryMember("1009", "Joy", "Johnson", "523-4886")

		};
		setCheckoutRecords(members, records);

		System.out.println(Admin.getFrowningCD(members));

	}
	private static void setNumCopies(CD[] cds, Book[] books) {
		int count = 0;
		for(CD c: cds) {
			c.setNumCopiesInLib(1 + (count++) % 3);
		}
		for(Book b: books) {
			b.setNumCopiesInLib(1 + (count++) % 3);
		}
	}
	private static void setCheckoutRecords(LibraryMember[] members, CheckoutRecord[] records) {
		if(members.length != records.length) throw new IllegalArgumentException("members array has different size from records array");
		for(int i = 0; i < members.length; ++i) {
			members[i].setCheckoutRecord(records[i]);
		}		
	}
}
