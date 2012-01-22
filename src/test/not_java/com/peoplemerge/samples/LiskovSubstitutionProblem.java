package com.peoplemerge.samples;

import com.peoplemerge.samples.ExceptionGochasTest.OverriddenException;

public class LiskovSubstitutionProblem {

	
	
	
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
