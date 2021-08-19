package com.in28minutes.unittesting.unittesting.business;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.in28minutes.unittesting.unittesting.data.ItemRepository;
import com.in28minutes.unittesting.unittesting.model.Item;

@Component
public class ItemBusinessService {
	
	@Autowired
	private ItemRepository repository;
	
	public Item retreiveHardcodedItem() {
		return new Item(1, "Ball", 10, 100);
	}
	
	public List<Item> retrieveAllItems() {
		List<Item> items = repository.findAll();
		
		for(Item item:items) {
			item.setValue(item.getPrice() * item.getQuantity());
		}
		
		return items;	
	}

	public Item save(Item item) {
		return repository.save(item);
	}
	public void setRepository(ItemRepository repository) {
		this.repository = repository;
	}
	
	public Item update(int id, Item item) {
		Optional<Item> iOpt = repository.findById(id);
		Item i = null;
		if(iOpt.isPresent()) {
			i = iOpt.get();
			i.setId(item.getId());
			i.setName(item.getName());
			i.setPrice(item.getPrice());
			i.setQuantity(item.getQuantity());
			i = repository.save(i);
		}
		
		return i;
		
	}
}
