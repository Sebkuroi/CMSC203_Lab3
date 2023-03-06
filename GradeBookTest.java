package Gradebook;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GradeBookTest {
	GradeBook GradeBook1,GradeBook2;

	@BeforeEach
	void setUp() throws Exception 
	{
		 GradeBook1 = new GradeBook(5);
		 GradeBook2 = new GradeBook(5);
			GradeBook2.addScore(50.0);
			GradeBook2.addScore(75.0);
		GradeBook1.addScore(66.0);
		GradeBook1.addScore(20.0);
		GradeBook1.addScore(93.0);
		GradeBook1.addScore(82.0);
	}

	@AfterEach
	void tearDown() throws Exception 
	{
		GradeBook1 = null;
		GradeBook2 = null;
	}

	@Test
	void testAddScore() {
		 assertEquals(4,GradeBook1.getScoreSize(), .0001);
		 assertEquals(2,GradeBook2.getScoreSize(), .0001);
		 assertTrue((GradeBook1.toString()).equals("66.0 20.0 93.0 82.0 "));
		 assertTrue((GradeBook2.toString()).equals("50.0 75.0 "));
	}

	@Test
	void testSum() {
		assertEquals(261, GradeBook1.sum(), .0001);
		assertEquals(125, GradeBook2.sum(), .0001);
	}

	@Test
	void testMinimum() {
		assertEquals(20, GradeBook1.minimum(), .001);
		assertEquals(50, GradeBook2.minimum(), .001);
	}

	@Test
	void testFinalScore() {
		assertEquals(241,GradeBook1.finalScore (), .01);
		assertEquals(75,GradeBook2.finalScore (), .01);
	}

}
