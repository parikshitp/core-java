package com.divergentsl.corejava.multithreading.executors;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Test {

	public static void main(String[] args) {

		String json = "{\"name\": \"Shipment\", \"count\": 1,\"child\": {\"name\": \"Pallets\", \"count\" : 20 , \"child\" : { \"name\" : \"Cartons\" , \"count\" : 50 , \"child\" : { \"name\" : \"Items\" , \"count\" : 50 , \"child\" : null } } } }";

		Gson gson = new GsonBuilder().serializeNulls().create();
		Child child = gson.fromJson(json, Child.class);
		System.out.println("" + child);
		
		List<ChildDto> list = new ArrayList<>();
		processChilds(child, list);
		
		System.out.println(list);
		
	}

	
	private static void processChilds(Child child, List<ChildDto> list) {
		
		ChildDto childDto = new ChildDto();
		childDto.setName(child.getName());
		childDto.setCount(child.getCount());
		childDto.setChildName( child.getChild() == null ? "" : child.getChild().getName() );
		list.add(childDto);
		
		if (child.getChild() == null)
			
			return ;
		
		else processChilds(child.getChild() , list);
		
	}

}
