package org.javabrains.msngr.resources;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.javabrains.msngr.models.Message;
import org.javabrains.msngr.services.MessageService;

@Path("/messages")
public class MessageResource {

	MessageService msgservice=new MessageService();
	
	
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public List<Message> getMessage(){
		
		return msgservice.getallMessages();
	}
}
