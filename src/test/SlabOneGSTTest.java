package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import gst.SlabOneGST;

class SlabOneGSTTest {

	@Test
	void slabOneLogicTest() {
		SlabOneGST slabOneGST= new SlabOneGST(new String[] {"1","dal","400"});
		assertEquals(400.0, slabOneGST.calculateGSTSlab(1,400));
	}

}
