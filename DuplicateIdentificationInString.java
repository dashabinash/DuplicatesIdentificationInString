package com.dash.abinash.AllDuplicatesInString;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/*
 * http://www.geeksforgeeks.org/print-all-the-duplicates-in-the-input-string/
 */
public class DuplicateIdentificationInString {
	public static void main(String args[]) {
		String input = "geeks for geeks";
		DuplicateIdentificationInString obj = new DuplicateIdentificationInString();
		obj.findDuplicatesInString(input);
	}

	public void findDuplicatesInString(String input) {

		String output = " ";
		char[] inputarr = input.toCharArray();
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		Set<Entry<Character, Integer>> entryset = map.entrySet();
		for (int index : inputarr) {
			System.out.println(Character.valueOf((char) index));
		}

		for (int i = 0; i < inputarr.length; i++) {
			Integer count = map.get(inputarr[i]);
			if (count == null) {
				if (inputarr[i] == ' ') {
					continue;
				}
				map.put(inputarr[i], 1);
			} else {
				map.put(inputarr[i], ++count);
			}
		}

		System.out.println("Key    value");
		for (Entry<Character, Integer> entry : entryset) {
			if (entry.getValue() > 1) {
				System.out.println(entry.getKey() + "-------->"
						+ entry.getValue());
				output = output + entry.getKey() + entry.getValue();
			}

		}
		System.out.println("Output is :" + output);

	}

}
