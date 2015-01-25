package com.herbert.trialple.model.xml.tree;

import java.util.ArrayList;
import java.util.HashMap;

public class OptionsMap {
	
	private HashMap<String, ArrayList<String>> map;

	public OptionsMap() {
		map = new HashMap<String, ArrayList<String>>();

	}

	public void add(String key, String value) {
		ArrayList<String> options = map.get(key);

		if (options == null) {
			options = new ArrayList<String>();
			map.put(key, options);
		}

		options.add(value);
	}
	
	public boolean contains(String k) {
		return map.containsKey(k);
	}
}
