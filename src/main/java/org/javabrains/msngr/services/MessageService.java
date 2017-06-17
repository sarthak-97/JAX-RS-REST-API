package org.javabrains.msngr.services;

import java.util.ArrayList;
import java.util.List;

import org.javabrains.msngr.models.Message;

public class MessageService {

	
	public List<Message> getallMessages(){
		
		Message m1=new Message(1L,"hello world","Sarthak");
		Message m2=new Message(1L,"hello w ,m,morld","Sarthak,nkjn");
		
		List<Message> list=new ArrayList<>();
		list.add(m1);
		list.add(m2);
		return list;
	}
}
