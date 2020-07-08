
import gst.GstFactory;
import gst.SlabFourGST;
import gst.SlabOneGST;
import gst.SlabThreeGST;
import gst.SlabTwoGST;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
  
public class TestLogic {  
  
      @Test
    public void testSlabs(){
        final GstFactory factory = new GstFactory();  
        // Testing 4th slab 
        assertEquals(new SlabFourGST(new String[]{"1","PERFUME","200"}),factory.decideSlab(new String[]{"1","PERFUME","200"}));  
        // Testing 3rd slab 
        assertEquals(new SlabThreeGST(new String[]{"1","TV","44000"}),factory.decideSlab(new String[]{"1","TV","44000"}));  
        // Testing 2nd slab 
        assertEquals(new SlabTwoGST(new String[]{"1","TABLE","2000"}),factory.decideSlab(new String[]{"1","TABLE","2000"}));  
        // Testing 1st slab 
        assertEquals(new SlabOneGST(new String[]{"1","WHEAT","400"}),factory.decideSlab(new String[]{"1","WHEAT","400"}));  
        // No commodity 
        assertEquals(null,factory.decideSlab(new String[]{"1","WT","400"}));  


    }


}  