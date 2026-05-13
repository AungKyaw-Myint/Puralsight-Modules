package org.puralsight.model;

public class Vehicle2 extends Asset{

    private String makeModel;
    private int year;
    private int odometer;

    public Vehicle2(String description, String dateAcquired, double originalCost, String makeModel, int year, int odometer) {
        super(description, dateAcquired, originalCost);
        this.makeModel = makeModel;
        this.year = year;
        this.odometer = odometer;
    }

    public String getMakeModel() {
        return makeModel;
    }

    public void setMakeModel(String makeModel) {
        this.makeModel = makeModel;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getOdometer() {
        return odometer;
    }

    public void setOdometer(int odometer) {
        this.odometer = odometer;
    }

    @Override
    public double getValue() {
        int currentYear = java.time.Year.now().getValue();
        int age = currentYear - year;
        double cost= this.getOriginalCost();

        double value;

        // Use ORIGINAL COST, not getValue()
        if (age >= 0 && age <= 3)
        {
            value = cost - (cost * 0.03 * age);
        }
        else if (age >= 4 && age <= 6)
        {
            value = cost - (cost * 0.06 * age);
        }
        else if (age >= 7 && age <= 10)
        {
            value = cost - (cost * 0.08 * age);
        }
        else
        {
            value = 1000.00;
        }

        // Reduce by 25% if over 100,000 miles
        // unless Honda or Toyota
        String lowerModel = makeModel.toLowerCase();

        if (odometer > 100000 &&
                !lowerModel.contains("honda") &&
                !lowerModel.contains("toyota"))
        {
            value *= 0.75;
        }

        return value;
    }
}
