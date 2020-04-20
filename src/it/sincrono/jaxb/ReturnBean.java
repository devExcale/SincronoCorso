package it.sincrono.jaxb;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Anagrafiche")
public class ReturnBean {

	private List<Anagrafica> anagrafiche;

	@XmlElement(name = "Anagrafica")
	public List<Anagrafica> getAnagrafiche() {
		return anagrafiche;
	}

	public void setAnagrafiche(List<Anagrafica> anagrafiche) {
		this.anagrafiche = anagrafiche;
	}

}
