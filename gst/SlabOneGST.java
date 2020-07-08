package gst;

/*
This class implements GstAllSlabs interface and defines the GST rate for slab1 commodities and calculates
the final price of the commodity.
*/
public class SlabOneGST implements GstAllSlabs {
    int unit;
    double initialUnitPrice;
    double slab1GST = 0.00; // GST rate for slab1

    public SlabOneGST(String[] input1) {
        unit = Integer.parseInt(input1[0]);
        initialUnitPrice = Double.parseDouble(input1[2]);
    }

    @Override
    public double calculateGSTSlab() {
        // TODO Adding calculation logic for fourth slab
        return unit * (initialUnitPrice + (initialUnitPrice * slab1GST));
    }
}