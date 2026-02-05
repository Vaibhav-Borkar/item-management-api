/**
 * @author Vaibhav Borkar
 * @description This interface defines the core business logic contract for managing Item entities.
 */
package com.item.service;

import com.item.model.Item;

public interface ItemService {
	Item addItem(Item item);
	Item getItemById(Long id);
}
