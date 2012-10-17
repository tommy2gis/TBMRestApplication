package org.tobbymaps.ws.resource;

import org.tobbymaps.ws.model.Position;
import org.tobbymaps.ws.resource.ResourceHelper;
import org.restlet.data.Form;
import org.restlet.representation.Representation;
import org.restlet.representation.StringRepresentation;
import org.restlet.resource.Delete;
import org.restlet.resource.Get;
import org.restlet.resource.Put;
import org.restlet.resource.ResourceException;
import org.restlet.resource.ServerResource;

public class PositionResource extends ServerResource{
	private int id;
	@Override
    protected void doInit() throws ResourceException {
		id = Integer.valueOf((String) getRequestAttributes().get("positionId"));
	}
	
	@Get
	public Representation get(Representation entity) {
		Position position =  ResourceHelper.findPosition(id);
		return new StringRepresentation(position.toString());
	}
	
	@Delete
	public Representation delete() {
		int status = ResourceHelper.deletePosition(id);
		return new StringRepresentation(String.valueOf(status));
	}

	@Put
	public Representation put(Representation entity)
			throws ResourceException {
		 Form form = new Form(entity); 
		 Position position = ResourceHelper.findPosition(id);
		 
		 String name = form.getFirstValue("name");
		 position.setName(name);
	
		 return new StringRepresentation(String.valueOf(ResourceHelper.updatePosition(position)));
	}
}