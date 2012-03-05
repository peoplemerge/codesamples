grammar concordance;

options{
	language = Java;
}

@header{
	package com.peoplemerge.concordance;
	import java.util.HashMap;
}

@lexer::header{
	package com.peoplemerge.concordance;
}

@members {
	HashMap<String,List<Integer>> wordOccurrances = new HashMap<String,List<Integer>>();
	Integer sentenceNumber = 1;
}

document: sentence {sentenceNumber++;}+ {
		for(String word : wordOccurrances.keySet()){
			List<Integer> occurranceForWord = wordOccurrances.get(word);
			System.out.print(word + " {" +  occurranceForWord.length + ":"
			boolean first=true;
			for(Integer sentenceOccurred : occurranceForWord){
				if(!first)
					{System.out.print(",");
				System.out.print(sentenceOccurred);
				first = false;
			}
		}
	};

sentence: WORD{
			if(wordOccurrances.containsKey($WORD.text){
				List<Integer> occurranceForWord = wordOccurrances.get($WORD.text);
				occurranceForWord.add(sentenceNumber);
			} else {
				List<Integer> occurranceForWord = new ArrayList<Integer>();
				occurranceForWord.add(sentenceNumber);
			}
		}+ PERIOD;

PERIOD: '.';
WORD : ('a'..'z'|'A'..'Z'|'_'|'/'|'\\'|'.');

NEWLINE: ('\r'? '\n') {$channel=HIDDEN;};
WS: ( ' '| '\t' | '\r' | '\n' ) {$channel=HIDDEN;};


