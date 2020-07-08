package gst;

/*
This class implements GstAllSlabs interface and defines the GST rate for slab4 commodities and calculates
the final price of the commodity.
*/
public class SlabFourGST implements GstAllSlabs {
    int unit;
    double initialUnitPrice;
    double slab4GST = 0.28; // GST rate for slab4

    public SlabFourGST(String[] input1) {
        unit = Integer.parseInt(input1[0]);
        initialUnitPrice = Double.parseDouble(input1[2]);
    }

    @Override
    public double calculateGSTSlab() {
        // TODO Adding calculation logic for fourth slab
        return unit * (initialUnitPrice + (initialUnitPrice * slab4GST));
    }
}