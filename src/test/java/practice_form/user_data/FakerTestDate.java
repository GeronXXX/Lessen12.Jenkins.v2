package practice_form.user_data;

import com.github.javafaker.Faker;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Map;

public class FakerTestDate {
    public static Faker faker = new Faker();

    public static String firstName = faker.name().firstName();
    public static String lastName = faker.name().lastName();
    public static String email = faker.internet().emailAddress();
    // public static String Genter = faker.options().option("Male", "Female", "Other");
    public static String phoneNumber = 1 + faker.phoneNumber().subscriberNumber(9);

    public static Date fakerDateOfBirthday = faker.date().birthday();
    public static String dayOfBirth = (new SimpleDateFormat("d", Locale.ENGLISH)).format(fakerDateOfBirthday);
    public static String monthOfBirth = (new SimpleDateFormat("MMMM", Locale.ENGLISH)).format(fakerDateOfBirthday);
    public static String yearOfBirth = (new SimpleDateFormat("y", Locale.ENGLISH)).format(fakerDateOfBirthday);
    public static String currentAddress = faker.address().streetAddress();
    public static Map<String, String[]> mapStateWithCity = Map.of(
            "NCR", new String[]{"Delhi", "Gurgaon", "Noida"},
            "Uttar Pradesh", new String[]{"Agra", "Lucknow", "Merrut"},
            "Haryana", new String[]{"Karnal", "Panipat"},
            "Rajasthan", new String[]{"Jaipur", "Jaiselmer"});
    public static String state = faker.options().option(mapStateWithCity.keySet().toArray()).toString();
    public static String city = faker.options().option(mapStateWithCity.get(state));
}
