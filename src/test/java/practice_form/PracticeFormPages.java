package practice_form;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.PageObgects;

import static io.qameta.allure.Allure.step;
import static practice_form.user_data.FakerTestDate.*;
import static practice_form.user_data.TestData.*;
@Tag("remote")
public class PracticeFormPages extends TestBase {
    PageObgects pageObgects = new PageObgects();

    @Test
    @DisplayName("Test form")
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
                .setUploadPicture(pictureName)
                .setSubmit();

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

