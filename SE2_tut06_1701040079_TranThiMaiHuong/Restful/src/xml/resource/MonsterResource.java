package xml.resource;

import java.util.List;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import xml.model.*;

import xml.service.MonsterService;
@Path("/monsterhello")
public class MonsterResource {
MonsterService monsterService=new MonsterService();
@GET
@Produces(MediaType.APPLICATION_XML)
public List<MonsterModel> getMonster(){
	return monsterService.getAllMonster();
}

}
