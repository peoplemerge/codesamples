package com.peoplemerge.fileadapters;

import java.io.File;
import java.io.IOException;
import java.net.URL;

import org.antlr.runtime.RecognitionException;
import org.apache.commons.io.FileUtils;

public class FileInterpreter {
	public VarianceAwareList parseSoccer() throws IOException, RecognitionException {
		URL soccerUrl = this.getClass().getClassLoader().getResource(
				"soccer.dat");
		File soccerFile = new File(soccerUrl.getFile());
		String contents = FileUtils.readFileToString(soccerFile);

		VarianceAwareList scores = VarianceAwareList.soccerFactory(contents);

		return scores;
	}

	public VarianceAwareList parseWeather() throws IOException, RecognitionException {
		URL soccerUrl = this.getClass().getClassLoader().getResource(
				"w_data.dat");
		File soccerFile = new File(soccerUrl.getFile());
		String contents = FileUtils.readFileToString(soccerFile);

		VarianceAwareList scores = VarianceAwareList.weatherFactory(contents);

		return scores;
	}
}
