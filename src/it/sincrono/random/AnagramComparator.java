package it.sincrono.random;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class AnagramComparator {
	
	public static void main(String[] args) {
		boolean a = compare("abca", "cba");
		System.out.println(a);
	}
	
	public static boolean compare(String str1, String str2) {
		List<String> split1 = Arrays.asList(str1.split("")),
				split2 = Arrays.asList(str2.split(""));
		
		Collections.sort(split1);
		Collections.sort(split2);
		
		return split1.equals(split2);
		
	}
	
}
