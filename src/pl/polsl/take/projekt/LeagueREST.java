package pl.polsl.take.projekt;

import java.io.InputStream;
import java.io.StringWriter;
import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.xml.bind.JAXB;

@Path("/league")
@Stateless
public class LeagueREST implements League {

	@EJB
	LeagueEJB bean;

	@Override
	@POST
	@Path("/create")
	public String create(InputStream is) {
		Team team = JAXB.unmarshal(is,Team.class);
		bean.create(team);
		return "team created!";
	}

	@Override
	@GET
	@Path("/find/{idc}")
	public String find(@PathParam("idc") int idc) {
		Team car = bean.find(idc);
		StringWriter sw = new StringWriter();
		JAXB.marshal(car, sw);
		return sw.toString();
	}

	@Override
	@GET
	@Path("/get")
	public String get() {
		List<Team> teamList = bean.get();
		StringWriter sw = new StringWriter();
		Teams teams = new Teams(teamList);
		JAXB.marshal(teams, sw);
		return sw.toString();
	}

	@Override
	@POST
	@Path("/update")
	public String update(InputStream is) {
		System.out.println(is);
		try {
			Team newteam = (Team) JAXB.unmarshal(is,Team.class);
			bean.update(newteam);
			return "team updated!";
		} catch (Exception e) {
			e.printStackTrace();
			return "team not updated :(";
		}
	}


	@Override
	@GET
	@Path("/delete/{idc}")
	public void delete(@PathParam("idc") int idc) {
		bean.delete(idc);
	}


}
