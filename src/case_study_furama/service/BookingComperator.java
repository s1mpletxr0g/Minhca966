package case_study_furama.service;

import case_study_furama.model.booking.Booking;

import java.util.Comparator;

public class BookingComperator implements Comparator<Booking> {
    @Override
    public int compare(Booking o1, Booking o2) {
        if ((o1.getIdBooking().compareTo(o2.getIdBooking())) > 0) {
            return 1;
        } else if ((o1.getIdBooking().compareTo(o2.getIdBooking())) < 0) {
            return -1;
        } else {
            return 0;

        }
    }
}
