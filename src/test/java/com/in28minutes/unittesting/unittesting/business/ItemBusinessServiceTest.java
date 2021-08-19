package com.in28minutes.unittesting.unittesting.business;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.lenient;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;
import org.mockito.stubbing.OngoingStubbing;

import com.in28minutes.unittesting.unittesting.data.ItemRepository;
import com.in28minutes.unittesting.unittesting.model.Item;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
class ItemBusinessServiceTest {

	@InjectMocks
	ItemBusinessService service;
	
	@Mock
	ItemRepository repository;
	
	
	
//	@BeforeEach
//	private void init() {
//		service = new ItemBusinessService();
//	}
	
	@BeforeEach
	  public void beforeEach() {
	    lenient().when(repository.findById(2)).thenReturn(Optional.of(new Item(2,"Bat", 10, 100)));
	    Item newItem = new Item(2,"Ball", 20, 300);
	    lenient().when(repository.save(newItem)).thenReturn(newItem);
	  }
	
	@Test
	void testSaveItem() {
		Item item = new Item("Bat", 10, 100);
		when(repository.save(item)).thenReturn(new Item(2,"Bat", 10, 100));
		Item newItem=service.save(item);
		 assertNotNull(newItem);
		 
		 assertEquals(newItem.getId(), 2);
		
	}
	
	@MockitoSettings(strictness = Strictness.WARN)
	@Test
	void testUpdateItem() {
		Item newItem = new Item(2,"Ball", 20, 300);
		Item updated = service.update(2, newItem);
		assertNotNull(updated);
		assertEquals(updated.getId(), 2);
		assertEquals(updated.getName(), newItem.getName());
		assertEquals(updated.getPrice(), newItem.getPrice());
		assertEquals(updated.getQuantity(), newItem.getQuantity());
	}
	
	@Test
	void testRetreiveHardcodedItem() {
		ItemBusinessService service = new ItemBusinessService();
		Item item = service.retreiveHardcodedItem();
		assertNotNull(item);
		
		assertEquals(item.getName(), "Ball");
	}

	@Test
	void testRetrieveAllItems() {
		List<Item> items = new ArrayList();
		items.add(new Item(1,"Ball",10,100));
		items.add(new Item(1,"Ball",10,100));
		when(repository.findAll()).thenReturn(items);
		
		service.retrieveAllItems();

	}

}
