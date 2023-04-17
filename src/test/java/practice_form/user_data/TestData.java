package practice_form.user_data;


import static practice_form.RandomUtils.getRandomItemFromArray;

public class TestData {
    public static String[] subjects = {"Accounting", "Maths", "Arts", "English", "Physics", "Chemistry"};
    public static String[] hobbies = {"Reading", "Sports", "Music"};
    public static String[] gender = {"Male", "Female", "Other"};

    //  public static String[] cities = {"Delhi", "Gurgaon", "Noida"};

    public static String dataGender = getRandomItemFromArray(gender);
    public static String dataSubjects = getRandomItemFromArray(subjects);
    public static String dataHobbies = getRandomItemFromArray(hobbies);
    public static String pictureName = "images/img.jpg";

//22
}
