package case_study_furama.service;

import case_study_furama.model.booking.Booking;
import case_study_furama.model.contacts.Contracts;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ContracstComparator implements Comparator<Contracts> {


    @Override
    public int compare(Contracts o1, Contracts o2) {
        if( o1.getIdBooking().compareTo(o2.getIdBooking())>0){
            return 1;
        }else if(o1.getIdBooking().compareTo(o2.getIdBooking())<0){
            return -1;
        }else
            return 0;
    }

}
