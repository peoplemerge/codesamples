package com.peoplemerge.fileadapters;

import java.util.ArrayList;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.TokenStream;

/**
 * Note, extending ArrayList violates ISP, hence add(int, K) and addAll() won't
 * behave properly. But it's more clear what I'm intending to do this way.
 * 
 * @author dave
 * 
 */
public class VarianceAwareList extends ArrayList<HasVariance> {

	public static VarianceAwareList soccerFactory(String sentence)
			throws RecognitionException {
		CharStream stringStream = new ANTLRStringStream(sentence);
		SoccerLexer lexer = new SoccerLexer(stringStream);
		TokenStream tokenStream = new CommonTokenStream(lexer);
		SoccerParser parser = new SoccerParser(tokenStream);
		parser.scores();
		VarianceAwareList result = parser.getSoccerScores();
		return result;
	}

	public static VarianceAwareList weatherFactory(String sentence)
			throws RecognitionException {
		CharStream stringStream = new ANTLRStringStream(sentence);
		WeatherLexer lexer = new WeatherLexer(stringStream);
		TokenStream tokenStream = new CommonTokenStream(lexer);
		WeatherParser parser = new WeatherParser(tokenStream);
		parser.reports();
		VarianceAwareList result = parser.getWeatherData();
		return result;
	}

	private Integer lowestVariance;
	private Object keyWithLowestVariance;

	@Override
	public boolean add(HasVariance t) {
		if (lowestVariance == null || lowestVariance > t.getVariance()) {
			setLowestVariance(t);
		}
		super.add(t);
		return true;
	}

	private void setLowestVariance(HasVariance t) {
		lowestVariance = t.getVariance();
		keyWithLowestVariance = t.getKey();
	}

	public Object whoHasLowestVariance() {
		return keyWithLowestVariance;
	}
}
