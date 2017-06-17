package org.javabrains.msngr.models;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Message {

	
	private long Id;
	private String Message;
	private Date Created;
	private String Author;
	
	public Message(){
		
	}
	
	public Message(long Id,String Message, String Author){
		
		this.Id=Id;
		this.Message=Message;
		this.Author=Author;
		this.Created=new Date();
		    
		
	}
	
	public long getId() {
		return Id;
	}
	public void setId(long id) {
		Id = id;
	}
	public String getMessage() {
		return Message;
	}
	public void setMessage(String message) {
		Message = message;
	}
	public Date getCreated() {
		return Created;
	}
	public void setCreated(Date created) {
		Created = created;
	}
	public String getAuthor() {
		return Author;
	}
	public void setAuthor(String author) {
		Author = author;
	}
	
	
	
}
