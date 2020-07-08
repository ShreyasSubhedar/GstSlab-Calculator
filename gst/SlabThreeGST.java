package gst;

/*
This class implements GstAllSlabs interface and defines the GST rate for slab3 commodities and calculates
the final price of the commodity.
*/
public class SlabThreeGST implements GstAllSlabs {
    int unit;
    double initialUnitPrice;
    double slab3GST = 0.18; // GST rate for slab3

    public SlabThreeGST(String[] input1) {
        unit = Integer.parseInt(input1[0]);
        initialUnitPrice = Double.parseDouble(input1[2]);
    }

    @Override
    public double calculateGSTSlab() {
        // TODO Adding calculation logic for third slab
        return unit * (initialUnitPrice + (initialUnitPrice * slab3GST));

    }
}