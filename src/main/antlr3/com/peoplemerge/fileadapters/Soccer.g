grammar Soccer;

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
	private VarianceAwareList soccerScores = new VarianceAwareList();
	public VarianceAwareList getSoccerScores(){
		return soccerScores;
	}
}

// "       Team            P     W    L   D    F      A     Pts\n"

// "    1. Arsenal         38    26   9   3    79  -  36    87\n"


NEWLINE: ('\r'? '\n') {$channel=HIDDEN;};
WS: ( ' '| '\t' | '\r' | '\n' ) {$channel=HIDDEN;};
INTEGER: '0'..'9'+;
DECIMAL: '0'..'9'+ '.' ('0'..'9')*;
table_header: 'Team' 'P' 'W' 'L' 'D' 'F' 'A' 'Pts';
WORD: ('a'..'z'|'A'..'Z' | '_')*;
OPEN_TAG: '<pre>';
CLOSE_TAG: '</pre>';
PAGE_BREAK: '-------------------------------------------------------' {$channel=HIDDEN;};
team_score: DECIMAL teamname=WORD plays=INTEGER wins=INTEGER losses=INTEGER draws=INTEGER scoreFor=INTEGER '-' scoreAgainst=INTEGER  points=INTEGER
	{
		TeamScore score = new TeamScore($teamname.text, Integer.valueOf($plays.text), Integer.valueOf($wins.text), Integer.valueOf($losses.text), Integer.valueOf($draws.text), Integer.valueOf($scoreFor.text), Integer.valueOf($scoreAgainst.text), Integer.valueOf($points.text));
		soccerScores.add(score); 
	};
scores: OPEN_TAG table_header team_score+ CLOSE_TAG;
