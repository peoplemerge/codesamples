package com.peoplemerge.samples;

import java.util.logging.Logger;

import org.junit.Ignore;
import org.junit.Test;

public class ExceptionGochasTest {

	Logger logger = Logger.getAnonymousLogger();

	class UncheckedException extends RuntimeException {
		public UncheckedException() {
		}

		public UncheckedException(String message) {
			super(message);
		}
	}

	@Test(expected = UncheckedException.class)
	public void showUncheckedExceptions() {
		System.out.println();
		logger.info("******************************************************************************");
		System.out.println("Surprise!  Throw a RuntimeException.");
		System.out.println("Notice that this method signature doesn't need 'throws UncheckedException'");
		System.out.println("Use unchecked exceptions sparingly, such as to indicate programming errors");
		throw new UncheckedException();
	}

	class AlsoUnchecked extends Error {
	}

	@Test(expected = AlsoUnchecked.class)
	public void unchecked() {
		System.out.println();
		logger.info("**************************************************************************");
		System.out.println("Errors should be used only by the JVM. Don't subclass Error.");
		throw new AlsoUnchecked();
	}

	class CheckedException extends Exception {
	}

	class OverriddenException extends RuntimeException {
	}

	class MessyResource {

		void someOperation() throws CheckedException {
			throw new CheckedException();
		}

		void tryToRollback() {
			System.out.println("Throwing an UncheckedException");
			throw new UncheckedException("Some very important message.  Don't Lose this!");
		}

		void freeResources() {
			System.out.println("Throwing an OverriddenException");
			throw new OverriddenException();
		}

		void bestFreeResources() {
			// TODO
		}
	}

	@Test(expected = OverriddenException.class)
	public void masked() {
		System.out.println();
		logger.info("**************************************************************************");
		System.out.println("Show how exceptions can be masked by throwing in finally {}... DON'T DO THIS!");
		System.out.println("Note this test expects to throw OverriddenException");
		MessyResource messyResource = new MessyResource();
		try {
			messyResource.someOperation();
		} catch (Exception any) {
			messyResource.tryToRollback();
		} finally {
			System.out.println("Here we throw exception that masks UncheckedException.  FAIL!");
			messyResource.freeResources();
		}
	}

	@Test(expected = UncheckedException.class)
	public void correctedBySwallowingRuntimeException() {
		System.out.println();
		logger.info("**************************************************************************");
		System.out.println("One solution - check for any type of RuntimeException");
		MessyResource messyResource = new MessyResource();
		try {
			messyResource.someOperation();
		} catch (Exception any) {
			messyResource.tryToRollback();
		} finally {
			try {
				messyResource.freeResources();
			} catch (RuntimeException e) {
				System.out.println("swallow OverriddenException");
			}
		}
	}

	class CleanerResource extends MessyResource {

		@Override
		void freeResources() {
			try {
				super.freeResources();
			} catch (Throwable e) {
				System.out.println("Caught Messy RuntimeException: " + e);
			}
		}
	}

	@Test(expected = UncheckedException.class)
	public void correctedByImprovingFreeResources() {
		System.out.println();
		logger.info("**************************************************************************");
		System.out.println("When possible, improve the API: more encapsulated for cleaner client code.");
		CleanerResource cleanerResource = new CleanerResource();
		try {
			cleanerResource.someOperation();
		} catch (Exception any) {
			cleanerResource.tryToRollback();
		} finally {
			cleanerResource.freeResources();
		}
	}

	@Ignore
	@Test(expected = UncheckedException.class)
	public void todo() {
		System.out.println();
		logger.info("**************************************************************************");

		System.out.println("TODO: is there a clean way to get the exception in catch {} as well as finally {}?");

	}
}
