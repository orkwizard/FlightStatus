package core;


import java.util.ArrayList;
import java.util.Iterator;
import com.google.gson.Gson;
import core.network.Net;
import pojo.Airline;
import pojo.arrays.Airlines;




/**
 * @author Edgar Osorio
 * 
 * Clase que permite obtener todas las aerolineas activas en el mundo. La clase permite realizar busquedas por:
 * Nombre de Aerolinea (exacto)
 * Aerolinea por codigo IATA
 * Aerolineas con nombres parecidos (Ejemplo: Aerolineas que su nombre contenga la palabra Air
 * 
 * Cuando se intancia esta clase se obtienen todas las Aerolineas de la API Flight Stats)
 * 
 */
public class FSAirlines {

	private Airlines airlines;
	private Gson gson;
	
	
	public FSAirlines() {
		super();
		gson = new Gson();
		try {
			initAirlines();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	private void initAirlines() throws Exception{
		String endpoint = "https://api.flightstats.com/flex/airlines/rest/v1/json/active";
		String uri = endpoint+Credentials.getAuthentication();
		String response = Net.get(uri);
		airlines = gson.fromJson(response,Airlines.class);
	}
	
	public Airlines getAll() throws Exception{
		return airlines;
	}
	
	public String getJson() {
		return gson.toJson(airlines);
	}
	
	public Airline getAirlineByName(String name) {
		 boolean found = false;
		 Airline a=null;
		 Iterator<Airline> i = airlines.getAirlines().iterator();
		 while(i.hasNext() && !found) {
			 a = i.next();
			 if(a.getName().trim().equals(name.trim())) {
				 found=true;
			 }
		 }
		return a;
	}
	
	public Airline getAirlineByIata(String iata) {
		 boolean found = false;
		 Airline a=null;
		 Iterator<Airline> i = airlines.getAirlines().iterator();
		 while(i.hasNext() && !found) {
			 a = i.next();
			 if(a.getIata().trim().equals(iata.trim())) {
				 found=true;
			 }
		 }
		return a;
	}
	
	
	
	public ArrayList<Airline> getAirlinesNameLike(String name_like){
		ArrayList<Airline> a = new ArrayList<Airline>();
		Iterator<Airline> i = airlines.getAirlines().iterator();
		while(i.hasNext()) {
			Airline aArline = i.next();
			if(aArline.getName().toLowerCase().matches(".*"+name_like.toLowerCase()+".*"))
				a.add(aArline);
		}
		return a;
	}
	

	public int size() {
		// TODO Auto-generated method stub
		return airlines.getAirlines().size();
	}
	
}
