package it.sincrono;

import java.util.ArrayList;
import java.util.List;

public class Application_Stream {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		
		list.add("Hello");
		list.add(" World");
		list.add("!");
		
		list.stream().forEach(string -> System.out.print(string));
	}

}
