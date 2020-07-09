package gst;

// Interface for business logic of GST calculations
// TODO: Adding interface with calculateGSTSlab method
public interface GstSlab {
    public double calculateGSTSlab(int unit, double initialUnitPrice);
}