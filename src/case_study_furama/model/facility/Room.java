package case_study_furama.model.facility;

public class Room extends Facility{
    private  String freeService;

    public Room() {
    }

    public Room(String freeService) {
        this.freeService = freeService;
    }

    public Room(String nameService, double area, int spend, int numberPeople, String styleEngage,
                 String freeService) {
        super(nameService, area, spend, numberPeople, styleEngage);
        this.freeService = freeService;
    }


    public String getFreeService() {
        return freeService;
    }

    public void setFreeService(String freeService) {
        this.freeService = freeService;
    }
    @Override
    public String toString() {
        return super.toString() +
                "freeService='" + freeService ;
    }
}
