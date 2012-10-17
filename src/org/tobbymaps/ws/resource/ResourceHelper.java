package org.tobbymaps.ws.resource;


import java.util.HashMap;

import org.tobbymaps.ws.model.*;

public class ResourceHelper {
	public static int maxId = 0;
	public static HashMap<Integer,Position> positions= new HashMap<Integer,Position>();
	
	static {
		Position Position = new Position();
		 Position.setId(1);
		 Position.setName("Steven");
		 maxId = Position.getId();
		 positions.put(Position.getId(), Position);
	}
	
	 public static Position getDefaultPosition(){
		 return positions.get(1);
	 }
	 
	 public static Position findPosition(int id){
		 return positions.get(id);
	 }
	 
	 public static int addPosition(Position Position){
		 positions.put(Position.getId(), Position);
		 return Position.getId();
	 }
	 
	 public static int updatePosition(Position Position){
		 return addPosition(Position);
	 }
	 
	 public static int deletePosition(int id){
		 if(positions.get(id)!=null){
			 positions.remove(id);
			 return 1;
		 }
		 return 0;
	 }
	
}
