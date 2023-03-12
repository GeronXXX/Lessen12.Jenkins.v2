package practice_form;

import org.junit.jupiter.api.Test;
import pages.PageObgects;

import static practice_form.FakerTestDate.*;
import static practice_form.TestData.*;

public class PracticeFormPages extends TestBase {
    PageObgects pageObgects = new PageObgects();

    @Test
    void practiceFormTest() {

        pageObgects.openPage()
                .setFirstName(firstName)
                .setLastName(lastName)
                .setEmail(email)
                .setGender(dataGender)
                .setPhone(phoneNumber)
                .setBirthDate(dayOfBirth, monthOfBirth, yearOfBirth)
                .setSubjects(dataSubjects)
                .setHobbies(dataHobbies)
                .setCurrentAddress(currentAddress)
                .setSelectState(state)
                .setSelectCity(city)
                .setUploadPicture("images/img.jpg")
                .setSubmit();

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

    }
}

