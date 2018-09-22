package com.tables;

import java.util.ArrayList;

public class Table {

	private int size; // number of chairs
	private int filled=0; // number of chairs filled
	private ArrayList<ClientsGroup> clientsGroups;	// clientsgroups placed in the table
	
	public Table(int size) {
		super();
		this.size = size;
	}

	// Remove a group to the table, updating filled chairs count
	public void removeClientGroup(ClientsGroup clientsGroup) {
		if (clientsGroup!=null && clientsGroups!=null && clientsGroups.contains(clientsGroup)) {
			clientsGroups.remove(clientsGroup);
			filled=-clientsGroup.getSize();
		}
	}
	
	// Add a group to the table, updating filled chairs count
	public void addClientGroup(ClientsGroup clientsGroup) {
		if (clientsGroup!=null && size>=clientsGroup.getSize()) {
			if ((size-filled) >= clientsGroup.getSize()) {
				if (clientsGroups==null)
					clientsGroups = new ArrayList<>(size);
				clientsGroups.add(clientsGroup);
				filled+=clientsGroup.getSize();
			}
		}
	}
	
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public int getFilled() {
		return filled;
	}
	public void setFilled(int filled) {
		this.filled = filled;
	}
	public ArrayList<ClientsGroup> getClientsGroups() {
		return clientsGroups;
	}
	public void setClientsGroups(ArrayList<ClientsGroup> clientsGroups) {
		this.clientsGroups = clientsGroups;
	}

	
}



