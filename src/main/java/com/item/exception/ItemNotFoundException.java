/**
 * @author Vaibhav Borkar
 * @information This is a custom exception class which extends RuntimeException class
 *              and when we are trying to get a item from the list which is
 *              not available in list then this exception rise.
 */
package com.item.exception;

public class ItemNotFoundException extends RuntimeException {

	public ItemNotFoundException(String message) {
		super(message);
	}
}
