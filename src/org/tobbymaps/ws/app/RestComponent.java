package org.tobbymaps.ws.app;

/***
 * 
 * @author Steven
 * http://www.lifeba.org
 */
public class RestComponent extends org.restlet.Component{
	public RestComponent(){
        getDefaultHost().attach("/a", new RestSimpleApplication());

	}
}
