package case_study_furama.model.facility;

import java.util.Objects;

public class Vila extends Facility {
    private String rankRoom;
    private  double areaSwim;
    private int numFloors;

    public Vila() {
    }

    public Vila(String rankRoom, double areaSwim, int numFloors) {
        this.rankRoom = rankRoom;
        this.areaSwim = areaSwim;
        this.numFloors = numFloors;
    }

    public Vila(String idService, String nameService, double area, int spend, int numberPeople, String styleEngage, String rankRoom, double areaSwim, int numFloors) {
        super(idService, nameService, area, spend, numberPeople, styleEngage);
        this.rankRoom = rankRoom;
        this.areaSwim = areaSwim;
        this.numFloors = numFloors;
    }

    public String getRankRoom() {
        return rankRoom;
    }

    public void setRankRoom(String rankRoom) {
        this.rankRoom = rankRoom;
    }

    public double getAreaSwim() {
        return areaSwim;
    }

    public void setAreaSwim(double areaSwim) {
        this.areaSwim = areaSwim;
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
                ", areaSwim=" + areaSwim +
                ", numFloors=" + numFloors +" ";
    }
}
