package studentinfo;

import junit.framework.TestSuite;

public class AllTests {
	public static TestSuite suite() {
		junit.framework.TestSuite suite = new TestSuite();
		
		suite.addTestSuite(StudentTest.class);
		suite.addTestSuite(CourseSessionTest.class);
		return suite;
	}
}
