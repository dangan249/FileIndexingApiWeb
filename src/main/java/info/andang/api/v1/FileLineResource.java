package info.andang.api.v1;

import com.google.inject.Inject;
import info.andang.api.v1.service.FileLineService;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.io.IOException;

@Path("/lines")
@Produces(MediaType.APPLICATION_JSON)
public class FileLineResource {

  private final FileLineService fileLineService;
  @Inject
  public FileLineResource(FileLineService fileLineService) {
    this.fileLineService = fileLineService;
  }

  @GET
  @Path("/{index}")
  public String getLineAtIndex(@PathParam("index") int index) throws IOException {
    if(index == 0){
      throw new WebApplicationException(Response.Status.BAD_REQUEST);
    }
    String value;
    try {
      value = this.fileLineService.getLineAtIndex(index);
    } catch (IllegalArgumentException ex){
      throw new WebApplicationException(Response.status(413).build());
    }
    return value;
  }

}