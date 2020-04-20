package it.sincrono.jaxb;

import java.io.File;

import java.sql.SQLException;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

//il main legge le anagrafice del db e le scrive in un file xml
public class JaxbReadDB {

	public static void main(String[] args) {
		// from DB to XML
		List<Anagrafica> daXml = fromXMLToList();

		for(Anagrafica riga : daXml) {
			System.out.println(String.format("C.F.: %s, nome: %s, cognome: &s, data: %s", riga.getCodfiscale(),
					riga.getNome(), riga.getCognome(), riga.getDatanascita()));

		}
	}

	private static List<Anagrafica> fromXMLToList() {
		File file = new File("C:\\Users\\Utente\\workspace_corso\\Corso\\src\\it\\sincrono\\file.xml");
		JAXBContext jaxbContext;
		ReturnBean radice = new ReturnBean();

		try {

			jaxbContext = JAXBContext.newInstance(ReturnBean.class);
			Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

			jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

			jaxbMarshaller.marshal(radice, file);

		} catch (JAXBException e) {
			System.out.println(e.getMessage());

		}

		return (radice == null) ? null : radice.getAnagrafiche();

	}

	private static void fromDBToXML() {
		List<Anagrafica> table = null;
		ReturnBean radice = new ReturnBean();

		DatabaseConnection dbconn = new DatabaseConnection();
		File file = new File("C:\\Users\\Utente\\workspace_corso\\Corso\\src\\it\\sincrono\\file.xml");
		try {
			dbconn.connect();
			table = dbconn.queryAllAnagrafica();
			radice.setAnagrafiche(table);

		} catch (SQLException e) {
			e.printStackTrace();
		}

		try {
			dbconn.connect();
			table = dbconn.queryAllAnagrafica();
			radice.setAnagrafiche(table);

		}

		catch (SQLException e) {
			e.printStackTrace();
		}

		try {
			JAXBContext jaxbContext = JAXBContext.newInstance(ReturnBean.class);
			Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

			jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

			jaxbMarshaller.marshal(radice, file);

		}

		catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
