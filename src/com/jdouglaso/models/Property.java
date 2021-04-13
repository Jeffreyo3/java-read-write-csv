package com.jdouglaso.models;

public class Property {
    private long index;
    private double sqFt;
    private float beds;
    private float baths;
    private int zip;
    private int year;
    private double listPrice;

    public Property() {
    }

    public Property(int index, double sqFt, float beds, float baths, int zip, int year, double listPrice) {
        this.index = index;
        this.sqFt = sqFt;
        this.beds = beds;
        this.baths = baths;
        this.zip = zip;
        this.year = year;
        this.listPrice = listPrice;
    }

    public long getIndex() {
        return index;
    }

    public void setIndex(long index) {
        this.index = index;
    }

    /**
     * Converts string number from CSV to long
     *
     * @param index String number
     */
    public void setIndex(String index) {
        this.index = Long.parseLong(index);
    }

    public double getSqFt() {
        return sqFt;
    }

    public void setSqFt(double sqFt) {
        this.sqFt = sqFt;
    }

    /**
     * Converts string number from CSV to double
     *
     * @param sqFt String number
     */
    public void setSqFt(String sqFt) {
        this.sqFt = Double.parseDouble(sqFt);
    }

    public float getBeds() {
        return beds;
    }

    public void setBeds(float beds) {
        this.beds = beds;
    }

    /**
     * Converts string number from CSV to float
     *
     * @param beds String number
     */
    public void setBeds(String beds) {
        this.beds = Float.parseFloat(beds);
    }

    public float getBaths() {
        return baths;
    }

    public void setBaths(float baths) {
        this.baths = baths;
    }

    /**
     * Converts string number from CSV to float
     *
     * @param baths String number
     */
    public void setBaths(String baths) {
        this.baths = Float.parseFloat(baths);
    }

    public int getZip() {
        return zip;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }

    /**
     * Converts string number from CSV to integer
     *
     * @param zip String number
     */
    public void setZip(String zip) {
        this.zip = Integer.parseInt(zip);
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    /**
     * Converts string number from CSV to integer
     *
     * @param year String number
     */
    public void setYear(String year) {
        this.year = Integer.parseInt(year);
    }

    public double getListPrice() {
        return listPrice;
    }

    public void setListPrice(double listPrice) {
        this.listPrice = listPrice;
    }

    /**
     * Converts string number from CSV to double
     *
     * @param listPrice String number
     */
    public void setListPrice(String listPrice) {
        this.listPrice = Double.parseDouble(listPrice);
    }

    @Override
    public String toString() {
        return "Property{" +
                "index=" + index +
                ", sqFt=" + sqFt +
                ", beds=" + beds +
                ", baths=" + baths +
                ", zip=" + zip +
                ", year=" + year +
                ", listPrice=" + listPrice +
                '}';
    }
}
