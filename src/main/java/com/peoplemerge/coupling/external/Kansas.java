package com.peoplemerge.coupling.external;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;

public class Kansas {

	public BufferedOutputStream persist() throws Exception {
		BufferedOutputStream output = new BufferedOutputStream(
				new FileOutputStream(File.createTempFile("kansas", "txt")));
		return output;
	}

}
