import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GradeBookTest {

	private GradeBook gradeBook1;
	private GradeBook gradeBook2;
	
	@BeforeEach
	void setUp() throws Exception {
		gradeBook1 = new GradeBook(5);
		gradeBook2 = new GradeBook(5);
		gradeBook1.addScore(55);
		gradeBook1.addScore(69);
		gradeBook1.addScore(77);
		gradeBook1.addScore(11);
		gradeBook1.addScore(30);
		gradeBook2.addScore(88);
		gradeBook2.addScore(33);
		gradeBook2.addScore(20);
		gradeBook2.addScore(23);
		gradeBook2.addScore(30);
	}

	@AfterEach
	void tearDown() throws Exception {
		gradeBook1=null;
		gradeBook2=null;
	}

	@Test
	void testGradeBook() {
		assertFalse(gradeBook1.equals(gradeBook2));
	}

	@Test
	void testAddScore() {
		assertTrue("55.0 69.0 77.0 11.0 30.0 ".equals(gradeBook1.toString()));
		assertTrue("88.0 33.0 20.0 23.0 30.0 ".equals(gradeBook2.toString()));
		assertEquals(5,gradeBook1.getScoreSize());
		assertEquals(5,gradeBook2.getScoreSize());
		
		
	}

	@Test
	void testSum() {
		assertEquals(242,gradeBook1.sum(), .0001);
		assertEquals(194,gradeBook2.sum(), .0001);
	}

	@Test
	void testMinimum() {
		assertEquals(11,gradeBook1.minimum(), .001);
		assertEquals(20,gradeBook2.minimum(), .001);
	}

	@Test
	void testFinalScore() {
		assertEquals(242-11,gradeBook1.finalScore(), .0001);
		assertEquals(194-20,gradeBook2.finalScore(), .0001);
	}

	@Test
	void testGetScoreSize() {
		fail("Not yet implemented");
	}

	@Test
	void testToString() {
		fail("Not yet implemented");
	}

}
