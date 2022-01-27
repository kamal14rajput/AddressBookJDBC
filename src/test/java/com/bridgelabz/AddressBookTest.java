package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class AddressBookTest {
	static AddressBookService addressBookService;

	@Test
	public void givenAddressBookContactsInDB_WhenRetrieved_ShouldMatchContactsCount() throws AddressBookException {
		AddressBookService addressBookService = new AddressBookService();
		List<AddressBookData> addressBookData = addressBookService
				.readAddressBookData(AddressBookService.IOService.DB_IO);
		Assert.assertEquals(3, addressBookData.size());
	}

	@Test
	public void givenAddressBook_WhenUpdate_ShouldSyncWithDB() throws AddressBookException {
		AddressBookService addressBookService = new AddressBookService();
		addressBookService.updateRecord("kamal", "pune");
		boolean result = addressBookService.checkUpdatedRecordSyncWithDatabase("kamal ");
		Assert.assertTrue(result);
	}
}
