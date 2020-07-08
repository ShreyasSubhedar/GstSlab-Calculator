package gst;

import java.util.Arrays;

/*
This is factory class to create object without exposing the creation logic to the client and
 refer to newly created object using a common interface.
*/
public class GstFactory {
    // categorized into 4 slabs
    String[] slabOneCommodityList = { "RICE", "WHEAT", "DAL" }; // 0% GST
    String[] slabTwoCommodityList = { "TABLE", "SOFA", "CHAIR" }; // 5% GST
    String[] slabThreeCommodityList = { "MOBILE", "TV", "TABLET" }; // 18% GST
    String[] slabFourCommodityList = { "CREAM", "PERFUME", "LOTION" }; // 28% GST
    // Method for deciding the classes

    public GstAllSlabs decideSlab(String[] splitInput) {
        String commodity = splitInput[1].toUpperCase(); // Provided Commodity
        if (Arrays.asList(slabOneCommodityList).contains(commodity)) {
            return new SlabOneGST(splitInput);
        } else if (Arrays.asList(slabTwoCommodityList).contains(commodity)) {
            return new SlabTwoGST(splitInput);
        } else if (Arrays.asList(slabThreeCommodityList).contains(commodity)) {
            return new SlabThreeGST(splitInput);
        } else if (Arrays.asList(slabFourCommodityList).contains(commodity)) {
            return new SlabFourGST(splitInput);
        } else {
            return null;
        }
    }
}