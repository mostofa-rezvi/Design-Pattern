package model;

public class PrintSettings {

    private int numberOfPages;
    private String pageSize;
    private String orientation;
    private double colorIntensity;
    private double costPerPage;

    public PrintSettings(int numberOfPages, String pageSize, String orientation, double colorIntensity, double costPerPage) {
        this.numberOfPages = numberOfPages;
        this.pageSize = pageSize;
        this.orientation = orientation;
        this.colorIntensity = colorIntensity;
        this.costPerPage = costPerPage;
    }

    // Getter and Setter methods
    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public String getPageSize() {
        return pageSize;
    }

    public void setPageSize(String pageSize) {
        this.pageSize = pageSize;
    }

    public String getOrientation() {
        return orientation;
    }

    public void setOrientation(String orientation) {
        this.orientation = orientation;
    }

    public double getColorIntensity() {
        return colorIntensity;
    }

    public void setColorIntensity(double colorIntensity) {
        this.colorIntensity = colorIntensity;
    }

    public double getCostPerPage() {
        return costPerPage;
    }

    public void setCostPerPage(double costPerPage) {
        this.costPerPage = costPerPage;
    }

    @Override
    public String toString() {
        return String.format(
                "Pages: %d, PageSize: %s, Orientation: %s, ColorIntensity: %.2f, CostPerPage: %.2f",
                numberOfPages, pageSize, orientation, colorIntensity, costPerPage
        );
    }
}
