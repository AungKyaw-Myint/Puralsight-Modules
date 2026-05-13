package org.puralsight.model;

public class House extends Asset{

    private String address;
    private int condition;
    private int squareFoot;
    private int lolSize;

    public House(String description, String dateAcquired, double originalCost, String address, int condition, int squareFoot, int lolSize) {
        super(description, dateAcquired, originalCost);
        this.address = address;
        this.condition = condition;
        this.squareFoot = squareFoot;
        this.lolSize = lolSize;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getCondition() {
        return condition;
    }

    public void setCondition(int condition) {
        this.condition = condition;
    }

    public int getSquareFoot() {
        return squareFoot;
    }

    public void setSquareFoot(int squareFoot) {
        this.squareFoot = squareFoot;
    }

    public int getLolSize() {
        return lolSize;
    }

    public void setLolSize(int lolSize) {
        this.lolSize = lolSize;
    }

    @Override
    public double getValue() {
        double pricePerSqFt = 0.0;

        switch (condition)
        {
            case 1: // excellent
                pricePerSqFt = 180.0;
                break;

            case 2: // good
                pricePerSqFt = 130.0;
                break;

            case 3: // fair
                pricePerSqFt = 90.0;
                break;

            case 4: // poor
                pricePerSqFt = 80.0;
                break;

            default:
                pricePerSqFt = 0.0;
        }

        return (squareFoot * pricePerSqFt) + (lolSize * 0.25);
    }
}
