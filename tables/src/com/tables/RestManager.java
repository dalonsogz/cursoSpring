package com.tables;

import java.util.ArrayList;
import java.util.List;

public class RestManager {

	   private final static int MAX_WASTED_SEATS = 4;	// Max number of seats that could be wasted in a partially filled table 
														// (max table size-min group size,6-2=4;
	
	   private List<Table> tables;	// list of avaliable tables
	   private ArrayList<ClientsGroup> clientsGroups;	// groups queue

	   // Warn, tables should be initialized with a size, given the exercise statement
	   // No additional controls are added for this!!!
	   // Groups should be right to following the exercise statement (MAX_WASTED_SEATS)
	   // The progam could be easily modified for any size of groups or amount of table sizes (MAX_WASTED_SEATS, could be avoided)
	   public RestManager (List<Table> tables)
	   {
		   this.tables = new ArrayList<Table>();
		   for (Table table: tables) {
			   if (table.getSize()>0) {
				   tables.add(table);
			   }
		   }
	   }

	   // new client(s) show up
	   public void onArrive (ClientsGroup group)
	   {
		   if (group!=null) {

			   // First, look for a table empty for the group size
			   Table table = lookupForSuitableEmptyTable(group.getSize());
			   
			   if (table==null) {
				   // Second, look for a more suitable table partially filled for the group size
				   table = lookupForSuitablePartFilledTable(group.getSize());
			   }
	
			   if (table==null) {
				   // If no table found
				   if (clientsGroups==null) {
					   clientsGroups = new ArrayList<ClientsGroup>();
				   }
				   clientsGroups.add(group);	// no available table for group, add to queue
			   } else {
				   // If table found
				   table.addClientGroup(group);	// add group to table
			   }
		   }
		   
	   }

	   // client(s) leave, either served or simply abandoning the queue
	   public void onLeave (ClientsGroup group)
	   {
		   if (group!=null) {
			   Table table = lookup(group);
			   if (table!=null) {
				   table.removeClientGroup(group);
			   }
		   }
	   }
	   
	   // return table where a given client group is seated, 
	   // or null if it is still queuing or has already left
	   public Table lookup (ClientsGroup group)
	   {
		  if (group!=null) {
		      for (Table table:tables) {
		    	  if (table.getClientsGroups()!=null && table.getClientsGroups().contains(group)) {
		    		  return table;
		    	  }
		      }
		  }
	      return null;
	   }
	   
	   // return the table with a more suitable size that is empty actually
	   // or null if there's no empty table
	   public Table lookupForSuitableEmptyTable(int size) {
		   Table suitableEmptyTable = null;
		   for (Table table:tables) {
			   if (table.getSize()>=size && table.getFilled()==0 && 
					   (suitableEmptyTable==null || suitableEmptyTable.getSize()>table.getSize())) {
				   suitableEmptyTable = table;
			   }
		   }
		   return suitableEmptyTable;
	   }

	   // return the table that is partially filled that is the more suitable for given group size
	   // or null if there's no empty table
	   public Table lookupForSuitablePartFilledTable(int size) {
		   Table suitablePartEmptyTable = null;
		   int currentWastedSeats = MAX_WASTED_SEATS;
		   
		   for (Table table:tables) {
			   if (table.getSize()>=size && table.getFilled()!=0 && 
					   (suitablePartEmptyTable==null || table.getSize()-table.getFilled()>=size)) {
				   
				   if (currentWastedSeats>table.getSize()-table.getFilled()) {
					   currentWastedSeats=table.getSize()-table.getFilled();
					   suitablePartEmptyTable = table;
				   }
			   }
		   }
		   return suitablePartEmptyTable;
	   }
	   
}
