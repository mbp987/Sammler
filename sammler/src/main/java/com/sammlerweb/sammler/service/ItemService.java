package com.sammlerweb.sammler.service;

import java.util.Collection;

import com.sammlerweb.sammler.item.Banknote;

public interface ItemService {

	public abstract void createItem(Banknote banknote);
	
	public abstract void getItem(Banknote banknote);

	public abstract void updateItem(Banknote banknote);

	public abstract void deleteItem(String id);

	public abstract Collection<Banknote> getItems();
}
