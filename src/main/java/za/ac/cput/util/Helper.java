package za.ac.cput.util;

import org.apache.commons.validator.routines.EmailValidator;
import java.util.UUID;

public class Helper {
    public static boolean isNullOrEmpty(String s){
        if(s == null || s.isEmpty()){
            return true;
        }
        return false;
    }

    public static String generateId(){
        return UUID.randomUUID().toString();
    }

    public static Boolean isValidEmail(String email){
        EmailValidator ev = EmailValidator.getInstance();
        return ev.isValid(email);
    }
}
