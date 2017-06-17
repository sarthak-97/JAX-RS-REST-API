package org.javabrains.msngr.resources;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.javabrains.msngr.models.Message;
import org.javabrains.msngr.services.MessageService;

@Path("/messages")
public class MessageResource {

	MessageService msgservice=new MessageService();
	
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Message> getMessage(){
		
		return msgservice.getallMessages();
	}
	
	/**
	 * 
	 * @param id
	 * @return
	 */
	@GET
	@Path("/{messageId}")
	@Produces(MediaType.APPLICATION_JSON)
	public Message getMessage(@PathParam("messageId") long id){
		
		return msgservice.getMessage(id);
		
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Message addMessage(Message message){
		
		return msgservice.addMessage(message);
	}
	
}
