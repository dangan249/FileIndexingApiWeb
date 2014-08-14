package info.andang.api.v1;

import com.google.inject.Inject;
import info.andang.api.v1.service.FileLineService;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

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
  public String getmyProfile(@PathParam("index") int index){
    return this.fileLineService.getLine(index);
  }

}