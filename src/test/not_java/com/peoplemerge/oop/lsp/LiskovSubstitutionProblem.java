package com.peoplemerge.oop.lsp;


public class LiskovSubstitutionProblem {

	
	class OverriddenException extends Exception{}
	
	class SuperThrows {
		public void method() throws OverriddenException{
			
		}
	}
	
	// Java language syntax explicitly prevents postcondition from being weakened  
	class SubclassViolatesLSP extends SuperThrows{
		public void method() throws Exception{
		}
	}

}
