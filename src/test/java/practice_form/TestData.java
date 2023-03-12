package practice_form;

import static practice_form.RandomUtils.getRandomItemFromArray;

public class TestData {
    public static String[] subjects = {"Accounting", "Maths", "Arts", "English", "Physics", "Chemistry"};
    public static String[] hobbies = {"Reading", "Sports", "Music"};
    public static String[] gender = {"Male", "Female", "Other"};

    //  public static String[] cities = {"Delhi", "Gurgaon", "Noida"};

    static String dataGender = getRandomItemFromArray(gender);
    static String dataSubjects = getRandomItemFromArray(subjects);
    static String dataHobbies = getRandomItemFromArray(hobbies);

}
