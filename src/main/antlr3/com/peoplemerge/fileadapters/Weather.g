grammar Weather;

options{
	language = Java;
}
@header{
	package com.peoplemerge.fileadapters;
}
@lexer::header{
	package com.peoplemerge.fileadapters;
}

@members{
	private VarianceAwareList weatherData = new VarianceAwareList();
	public VarianceAwareList getWeatherData(){
		return weatherData;
	}
}

// discard highest and lowest markers from the token stream first.
ASTERIX: ('*') {$channel=HIDDEN;};
NEWLINE: ('\r'? '\n') {$channel=HIDDEN;};
WS: ( ' '| '\t' | '\r' | '\n' ) {$channel=HIDDEN;};

table_header:   'Dy' 'MxT' 'MnT' 'AvT' 'HDDay' 'AvDP' '1HrP' 'TPcpn' 'WxType' 'PDir' 'AvSp' 'Dir' 'MxS' 'SkyC' 'MxR' 'MnR' 'AvSLP';
INTEGER: '0'..'9'+;
DECIMAL: '0'..'9'+ '.' ('0'..'9')*;
//  mo        82.9    60.5    71.7    16      58.8    0.00    6.9     5.3
summary: 'mo' DECIMAL DECIMAL DECIMAL INTEGER DECIMAL DECIMAL DECIMAL DECIMAL ;
WORD: ('a'..'z'|'A'..'Z' | '_')+;

loc_month_year: WORD WORD INTEGER;
OPEN_TAG: '<pre>';
CLOSE_TAG: '</pre>';
//   1  88    59    74          53.8       0.00 F       280  9.6 270  17  1.6  93 23 1004.5
//   2  79    63    71          46.5       0.00         330  8.7 340  23  3.3  70 28 1004.5
//      9             86          32*         59       6       61.5    0.00          240     7.6     220     12      6.0     78      46      1018.6

report: month=INTEGER max=INTEGER min=INTEGER INTEGER INTEGER? DECIMAL DECIMAL WORD? INTEGER DECIMAL INTEGER INTEGER DECIMAL INTEGER INTEGER DECIMAL
	{
		WeatherReport report = new WeatherReport(Integer.valueOf($month.text), Integer.valueOf($max.text), Integer.valueOf($min.text));
		weatherData.add(report); 
	};
reports: OPEN_TAG loc_month_year table_header report+ summary CLOSE_TAG;