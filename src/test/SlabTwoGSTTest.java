package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import gst.SlabTwoGST;

class SlabTwoGSTTest {

	@Test
	void slabTwoLogicTest() {
		SlabTwoGST slabTwoGST= new SlabTwoGST(new String[] {"1","chair","1500"});
		assertEquals(1575.0, slabTwoGST.calculateGSTSlab(1,1500));	}

}
