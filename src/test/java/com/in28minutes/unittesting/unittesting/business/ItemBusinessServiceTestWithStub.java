package com.in28minutes.unittesting.unittesting.business;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ItemBusinessServiceTestWithStub {

	@Test
	void test() {
		ItemBusinessService service = new ItemBusinessService();
		service.setRepository(new ItemRepositoryStub());
		service.retrieveAllItems();
	}

}
