package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import gst.SlabFourGST;

class SlabFourGSTTest {

	@Test
	void slabFourLogicTest() {
		SlabFourGST slabFourGST= new SlabFourGST(new String[] {"1","cream","175"});
		assertEquals(224.0, slabFourGST.calculateGSTSlab(1,175));
	}

}
