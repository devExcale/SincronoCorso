package it.sincrono;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Application_ListSort {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Insert strings. To stop, press enter with no arguments.");
		for(;;) {
			String tmp = scanner.nextLine();
			if(tmp.equals(""))
				break;
			list.add(tmp);
		}
		scanner.close();
		
		Collections.sort(list);
		list.forEach(string -> System.out.println(string));

	}

}
