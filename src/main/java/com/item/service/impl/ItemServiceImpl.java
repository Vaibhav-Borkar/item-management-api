/**
 * @author Vaibhav Borkar
 * @description This class implements the ItemService interface. It uses an in-memory ArrayList to store items 
 *              and a simple Long counter for ID generation.
 */

package com.item.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;

import com.item.exception.ItemNotFoundException;
import com.item.model.Item;
import com.item.service.ItemService;

@Service
public class ItemServiceImpl implements ItemService {

	private final List<Item> items = new ArrayList<>();
	private Long idCounter = 1L;

	@Override
	public Item addItem(Item item) {
		item.setId(idCounter++);
		items.add(item);
		return item;
	}

	@Override
	public Item getItemById(Long id) {
		return items.stream().filter(i -> i.getId().equals(id)).findFirst()
				.orElseThrow(() -> new ItemNotFoundException("Item not found with id: " + id));
	}
}
