package status;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/status")
public class V1Status {
	
	private static int counter=1000;
	private static final String version = "00.01.00";

	@GET
	@Produces(MediaType.TEXT_HTML)
	public String returnTitle()
	{
		return "<p>Java Web Service</p>" + counter++;
	}
	
	@Path("/version")
	@GET
	@Produces(MediaType.TEXT_HTML)
	public String returnVersion()
	{
		return "<p>Version:</p>" + version;
	}

}
