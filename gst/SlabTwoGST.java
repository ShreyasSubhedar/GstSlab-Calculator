package gst;

/*
This class implements GstAllSlabs interface and defines the GST rate for slab2 commodities and calculates
the final price of the commodity.
*/
public class SlabTwoGST implements GstAllSlabs {
    int unit;
    double initialUnitPrice;
    double slab2GST = 0.05; // GST rate for slab2

    SlabTwoGST(String[] input1) {
        unit = Integer.parseInt(input1[0]);
        initialUnitPrice = Double.parseDouble(input1[2]);
    }

    @Override
    public double calculateGSTSlab() {
        // TODO Adding calculation logic for second slab
        return unit * (initialUnitPrice + (initialUnitPrice * slab2GST));
    }
}