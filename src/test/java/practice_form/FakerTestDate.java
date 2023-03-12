package practice_form;

import com.github.javafaker.Faker;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Map;

public class FakerTestDate {
    public static Faker faker = new Faker();

    static String firstName = faker.name().firstName();
    static String lastName = faker.name().lastName();
    static String email = faker.internet().emailAddress();
    // public static String Genter = faker.options().option("Male", "Female", "Other");
    static String phoneNumber = 1 + faker.phoneNumber().subscriberNumber(9);

    static Date fakerDateOfBirthday = faker.date().birthday();
    static String dayOfBirth = (new SimpleDateFormat("d", Locale.ENGLISH)).format(fakerDateOfBirthday);
    static String monthOfBirth = (new SimpleDateFormat("MMMM", Locale.ENGLISH)).format(fakerDateOfBirthday);
    static String yearOfBirth = (new SimpleDateFormat("y", Locale.ENGLISH)).format(fakerDateOfBirthday);
    static String currentAddress = faker.address().streetAddress();
    static Map<String, String[]> mapStateWithCity = Map.of(
            "NCR", new String[]{"Delhi", "Gurgaon", "Noida"},
            "Uttar Pradesh", new String[]{"Agra", "Lucknow", "Merrut"},
            "Haryana", new String[]{"Karnal", "Panipat"},
            "Rajasthan", new String[]{"Jaipur", "Jaiselmer"});
    static String state = faker.options().option(mapStateWithCity.keySet().toArray()).toString();
    static String city = faker.options().option(mapStateWithCity.get(state));
}
