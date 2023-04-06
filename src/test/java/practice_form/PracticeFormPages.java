package practice_form;

import org.junit.jupiter.api.Test;
import pages.PageObgects;

import static io.qameta.allure.Allure.step;
import static practice_form.user_data.FakerTestDate.*;
import static practice_form.user_data.TestData.*;

public class PracticeFormPages extends TestBase {
    PageObgects pageObgects = new PageObgects();

    @Test
    void practiceFormTest() {

        step("Open Page", () -> {
            pageObgects.openPage();
        });
        step("Entering a first and last name", () -> {
            pageObgects.setFirstName(firstName)
                    .setLastName(lastName);
        });
        step("Email input", () -> {
            pageObgects.setEmail(email);
        });
        step("Gender selection", () -> {
            pageObgects.setGender(dataGender);
        });
        step("Entering a phone number", () -> {
            pageObgects.setPhone(phoneNumber);
        });
        step("Specify birthday", () -> {
            pageObgects.setBirthDate(dayOfBirth, monthOfBirth, yearOfBirth);
        });
        step("Set subjects", () -> {
            pageObgects.setSubjects(dataSubjects);
        });
        step("Choice of hobby", () -> {
            pageObgects.setHobbies(dataHobbies);
        });
        step("Enter current address", () -> {
            pageObgects.setCurrentAddress(currentAddress);
        });
        step("Specify state and city", () -> {
            pageObgects.setSelectState(state)
                        .setSelectCity(city);
        });
        step("Upload Picture", () -> {
        pageObgects.setUploadPicture(pictureName);
        });
        step("Press Submit button", () -> {
        pageObgects.setSubmit();
        });

        step("Checking the entered data in the modal window", () -> {
        pageObgects.resultsModal()
                .verifyResult("Student Name", firstName + " " + lastName)
                .verifyResult("Student Email", email)
                .verifyResult("Gender", dataGender)
                .verifyResult("Mobile", phoneNumber)
                .verifyResult("Date of Birth", dayOfBirth + " " + monthOfBirth + "," + yearOfBirth)
                .verifyResult("Subjects", dataSubjects)
                .verifyResult("Hobbies", dataHobbies)
                .verifyResult("Picture", "img.jpg")
                .verifyResult("Address", currentAddress)
                .verifyResult("State and City", state + " " + city);
        });
    }
}

