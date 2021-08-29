package case_study_furama.model.facility;

public abstract class Facility {
    private  String nameService;
    private  double area;
    private int spend;
    private int  numberPeople;
    private String styleEngage;


    public Facility() {
    }

    public Facility(String nameService, double area, int spend, int numberPeople, String styleEngage) {
        this.nameService = nameService;
        this.area = area;
        this.spend = spend;
        this.numberPeople = numberPeople;
        this.styleEngage = styleEngage;

    }

    public String getNameService() {
        return nameService;
    }

    public void setNameService(String nameService) {
        this.nameService = nameService;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public int getSpend() {
        return spend;
    }

    public void setSpend(int spend) {
        this.spend = spend;
    }

    public int getNumberPeople() {
        return numberPeople;
    }

    public void setNumberPeople(int numberPeople) {
        this.numberPeople = numberPeople;
    }

    public String getStyleEngage() {
        return styleEngage;
    }

    public void setStyleEngage(String styleEngage) {
        this.styleEngage = styleEngage;
    }



    @Override
    public String toString() {
        return "nameService='" + nameService + '\'' +
                ", area=" + area +
                ", spend=" + spend +
                ", numberPeople=" + numberPeople +
                ", styleEngage='" + styleEngage + " ";
    }
}
