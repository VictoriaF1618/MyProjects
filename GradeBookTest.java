import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GradeBookTest {

	GradeBook gradebook1;
	GradeBook gradebook2;
	
	@BeforeEach
	void setUp() throws Exception {
		gradebook1 = new GradeBook(5);
		gradebook2 = new GradeBook(5);
		
		gradebook1.addScore(20.0);
		gradebook1.addScore(90.5);
		gradebook1.addScore(20.0);
		
		gradebook2.addScore(93.9);
		gradebook2.addScore(71.3);
		gradebook2.addScore(99.9);
	}

	@AfterEach
	void tearDown() throws Exception {
		gradebook1 = null;
		gradebook2 = null;
		
	}

	@Test
	void testAddScore() {
		assertTrue(gradebook1.toString().equals("20.0 90.5 20.0"));
        assertTrue(gradebook2.toString().equals("93.9 71.3 99.9"));
        
        assertEquals(3, gradebook1.getScoreSize());
        assertEquals(3, gradebook2.getScoreSize());
        
		fail("Not yet implemented");
	}

	@Test
	void testSum() {
		assertEquals(130.5, gradebook1.sum(), 0.001); 
		assertEquals(265.1, gradebook2.sum(), 0.001);
		fail("Not yet implemented");
	}

	@Test
	void testMinimum() {
		assertEquals(20.0, gradebook1.minimum(), 0.001);
        assertEquals(71.3, gradebook2.minimum(), 0.001);
		fail("Not yet implemented");
	}

	@Test
	void testFinalScore() {
		assertEquals(110.5, gradebook1.finalScore(), 0.001);
		assertEquals(193.8, gradebook2.finalScore(), 0.001);
		fail("Not yet implemented");
	}

	@Test
	void testGetScoreSize() {
		assertEquals(3, gradebook1.getScoreSize());
        assertEquals(3, gradebook2.getScoreSize());
		fail("Not yet implemented");
	}

	@Test
	void testToString() {
		assertEquals("20.0 90.5 20.0", gradebook1.toString());
        assertEquals("93.9 71.3 99.9", gradebook2.toString());
		fail("Not yet implemented");
	}

}
