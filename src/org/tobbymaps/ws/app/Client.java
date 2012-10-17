package org.tobbymaps.ws.app;

import org.restlet.data.Form;
import org.restlet.representation.Representation;
import org.restlet.resource.ClientResource;

/***
 * 
 * @author Steven
 * http://www.lifeba.org
 */
public class Client {
	public static void main(String[] args){
		Client client = new Client();
		//client.position_delete();
		client.position_post();
	}
	public void position_delete(){
		try {
			ClientResource client = new ClientResource("http://localhost:8080/TBMRestApplication/position/1");
			Representation representation =client.delete(); 
			System.out.println(representation.getText());
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}
	
	public void position_post(){
		try {
			Form queryForm = new Form();
			queryForm.add("name","steven3");
			queryForm.add("clsId","201002");
			queryForm.add("sex","2");
			queryForm.add("age","12");
			ClientResource client = new ClientResource("http://localhost:8080/TBMRestApplication/position");
			Representation representation =client.post(queryForm.getWebRepresentation());  
			System.out.println(representation.getText());
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}
}
