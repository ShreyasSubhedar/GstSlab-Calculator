package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import gst.SlabThreeGST;

class SlabThreeGSTTest {

	@Test
	void slabThreeLogicTest() {
		SlabThreeGST slabThreeGST= new SlabThreeGST(new String[] {"1","Tablet","1870"});
		assertEquals(2206.6, slabThreeGST.calculateGSTSlab(1,1870));	}

}
