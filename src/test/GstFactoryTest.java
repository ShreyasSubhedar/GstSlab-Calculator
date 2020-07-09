package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.AfterClass;
import org.junit.jupiter.api.Test;

import gst.GstSlab;
import gst.GstFactory;

class GstFactoryTest {

	/*1st Slab test*/
	@Test
	void slabOneTest() {
		GstFactory factory= new GstFactory();
		GstSlab gst= factory.decideSlab(new String[]{"1","Wheat","400"});
		
        assertEquals(400.0,gst.calculateGSTSlab(1,400));  

	}
	/*2nd Slab test*/
	@Test
	void slabTwoTest() {
		GstFactory factory= new GstFactory();
		GstSlab gst= factory.decideSlab(new String[]{"1","Sofa","20000"});
		
        assertEquals(21000.0,gst.calculateGSTSlab(1,20000));  

	}
	/*3rd Slab test*/
	@Test
	void slabThreeTest() {
		GstFactory factory= new GstFactory();
		GstSlab gst= factory.decideSlab(new String[]{"2","mobile","5000"});
		
        assertEquals(11800.0,gst.calculateGSTSlab(2,5000));  

	}
	/*4th Slab test*/
	@Test
	void slabFourTest() {
		GstFactory factory= new GstFactory();
		GstSlab gst= factory.decideSlab(new String[]{"1","Perfume","200"});
		
        assertEquals(256.0,gst.calculateGSTSlab(1,200));  

	}
	/*Test if commodity is invalid*/
	@AfterClass
	void slabNotFoundTest() {
		GstFactory factory= new GstFactory();
		GstSlab gst= factory.decideSlab(new String[]{"1","Github","200"});
		
        assertEquals(null,gst);  

	}
	
	

}