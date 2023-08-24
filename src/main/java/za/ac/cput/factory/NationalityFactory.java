package za.ac.cput.factory;

import za.ac.cput.domain.Nationality;
import za.ac.cput.util.Helper;

public class NationalityFactory {
    public static Nationality createNationality(String country, String description){
        if (Helper.isNullOrEmpty(country) || Helper.isNullOrEmpty(description)){
            return null;
        }

         return new Nationality.Builder()//setCountry(country)
                // .setDescription(description)
                 .build();
    }
}

