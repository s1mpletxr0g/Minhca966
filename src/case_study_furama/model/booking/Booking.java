package case_study_furama.model.booking;

import case_study_furama.service.BookingComperator;

import java.util.Objects;

public class Booking  {
    private String idBooking;
    private String firstDay;
    private   String endDay;
    private String idCustomer;
    private String nameService;
    private String typeService;

    public Booking() {
    }

    public Booking(String idBooking, String firstDay, String endDay, String idCustomer, String nameService, String typeService) {
        this.idBooking = idBooking;
        this.firstDay = firstDay;
        this.endDay = endDay;
        this.idCustomer = idCustomer;
        this.nameService = nameService;
        this.typeService = typeService;
    }

    public String getIdBooking() {
        return idBooking;
    }

    public void setIdBooking(String idBooking) {
        this.idBooking = idBooking;
    }

    public String getFirstDay() {
        return firstDay;
    }

    public void setFirstDay(String firstDay) {
        this.firstDay = firstDay;
    }

    public String getEndDay() {
        return endDay;
    }

    public void setEndDay(String endDay) {
        this.endDay = endDay;
    }

    public String getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(String idCustomer) {
        this.idCustomer = idCustomer;
    }

    public String getNameService() {
        return nameService;
    }

    public void setNameService(String nameService) {
        this.nameService = nameService;
    }

    public String getTypeService() {
        return typeService;
    }

    public void setTypeService(String typeService) {
        this.typeService = typeService;
    }


    @Override
    public String toString() {
        return
                "idBooking='" + idBooking +
                ", firstDay " + firstDay +
                ", endDay " + endDay +
                ", idCustomer " + idCustomer +
                ", nameService " + nameService +
                ", typeService " + typeService ;
    }
}
