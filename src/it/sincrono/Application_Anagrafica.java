package it.sincrono;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import it.sincrono.anagrafica.Anagrafica;

public class Application_Anagrafica {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		HashMap<String, Anagrafica> map = new HashMap<String, Anagrafica>();
		map.put("paperino",
				new Anagrafica().setNominativo("Duffy Duck")
						.setDataNascita(new Date(1940, 1, 1))
						.setCittaNascita("Paperopoli"));
		map.put("topolino",
				new Anagrafica().setNominativo("Micky Mouse")
						.setDataNascita(new Date(1930, 2, 2))
						.setCittaNascita("Topolinia"));
		map.put("paperone",
				new Anagrafica().setNominativo("Paperon de Paperoni")
						.setDataNascita(new Date(1920, 3, 3))
						.setCittaNascita("Paperopoli"));

		List<Anagrafica> list = getMatches(map, "Paperopoli");
		list.forEach(anagrafica -> System.out.println(anagrafica.getNominativo()));

	}

	public static List<Anagrafica> getMatches(Map<String, Anagrafica> map, String key) {
		List<Anagrafica> list = new ArrayList<Anagrafica>();
		map.forEach((k, v) -> {
			if(v.getCittaNascita().equals(key))
				list.add(v);
		});
		return list;
	}
}
