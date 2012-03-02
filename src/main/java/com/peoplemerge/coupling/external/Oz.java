package com.peoplemerge.coupling.external;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;

public class Oz {
	
	public BufferedOutputStream persist() throws Exception {
		BufferedOutputStream output = new BufferedOutputStream(
				new FileOutputStream(File.createTempFile("oz", "txt")));
		return output;
	}

}
