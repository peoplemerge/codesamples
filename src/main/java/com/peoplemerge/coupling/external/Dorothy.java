package com.peoplemerge.coupling.external;

import java.io.BufferedOutputStream;

public class Dorothy {

	public void adventure() throws Exception{
		
		// Kansas has made Dorothy coupled to an external data structure - BufferedOutputStream. 
		
		Kansas kansas = new Kansas();
		BufferedOutputStream kansasOutput = kansas.persist();
		String inKansas = "She isn't coming yet, Toto. Did she hurt you? She tried to, didn't she? Come on. We'll go tell Uncle Henry and Auntie Em.";
		kansasOutput.write(inKansas.getBytes());

		// Oz too! 
		
		Oz oz = new Oz();
		BufferedOutputStream output = oz.persist();
		String inOz = "Toto, I've a feeling we're not in Kansas any more.";
		output.write(inOz.getBytes());
		
	}

}
