package org.tobbymaps.ws.app;

import org.tobbymaps.ws.resource.PositionResource;

import org.restlet.Restlet;
import org.restlet.routing.Router;

public class RestSimpleApplication extends org.restlet.Application{
	@Override
    public Restlet createInboundRoot() {
        Router router = new Router(getContext()); 
        router.attach("/position/{positionId}", PositionResource.class);
        return router;  
    }
}