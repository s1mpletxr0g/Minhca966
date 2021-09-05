package case_study_furama.model.facility;

public class House extends Facility{
    private  String rankRoom;
    private int numFloors;

    public House() {
    }

    public House(String rankRoom, int numFloors) {
        this.rankRoom = rankRoom;
        this.numFloors = numFloors;
    }

    public House(String idService, String nameService, double area, int spend, int numberPeople, String styleEngage, String rankRoom, int numFloors) {
        super(idService, nameService, area, spend, numberPeople, styleEngage);
        this.rankRoom = rankRoom;
        this.numFloors = numFloors;
    }

    public String getRankRoom() {
        return rankRoom;
    }

    public void setRankRoom(String rankRoom) {
        this.rankRoom = rankRoom;
    }

    public int getNumFloors() {
        return numFloors;
    }

    public void setNumFloors(int numFloors) {
        this.numFloors = numFloors;
    }

    @Override
    public String toString() {
        return super.toString() +
                "rankRoom='" + rankRoom + '\'' +
                ", numFloors=" + numFloors +" ";
    }
}




