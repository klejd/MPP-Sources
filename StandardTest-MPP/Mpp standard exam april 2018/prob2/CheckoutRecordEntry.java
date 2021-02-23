package prob2;

import java.time.LocalDate;

public class CheckoutRecordEntry {
	private LocalDate checkoutDate;
	private LocalDate dueDate;

	private LendingItem lendingItem;
	private ItemType lendingItemType;

	public CheckoutRecordEntry(LendingItem lendingItem, ItemType lendingItemType) {
		super();
		this.lendingItem = lendingItem;
		this.lendingItemType = lendingItemType;
	}

	public void setCheckoutDate(LocalDate checkoutDate) {
		this.checkoutDate = checkoutDate;
	}

	public void setDueDate(LocalDate dueDate) {
		this.dueDate = dueDate;
	}

	public LocalDate getCheckoutDate() {
		return checkoutDate;
	}

	public LocalDate getDueDate() {
		return dueDate;
	}

	public LendingItem getLendingItem() {
		return lendingItem;
	}

	public ItemType getLendingItemType() {
		return lendingItemType;
	}

}
