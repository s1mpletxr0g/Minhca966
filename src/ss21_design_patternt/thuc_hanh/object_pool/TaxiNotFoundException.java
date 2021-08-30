package ss21_design_patternt.thuc_hanh.object_pool;

import java.io.FileNotFoundException;

public class TaxiNotFoundException extends RuntimeException {
    public TaxiNotFoundException(String message) {
        System.out.println(message);
    }
}
