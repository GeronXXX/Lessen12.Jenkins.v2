package pages;

import com.codeborne.selenide.SelenideElement;
import pages.components.CalendarComponent;
import pages.components.RegistrationResultsModal;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import io.qameta.allure.Step;

public class PageObgects {
    CalendarComponent calendarComponent = new CalendarComponent();
    RegistrationResultsModal registrationResultsModal = new RegistrationResultsModal();
    private final SelenideElement firstNameInput = $("#firstName");
    private final SelenideElement lastNameInput = $("#lastName");
    private final SelenideElement userEmailInput = $("#userEmail");
    private final SelenideElement genterWrapper = $("#genterWrapper");
    private final SelenideElement userNumber = $("#userNumber");
    private final SelenideElement dateOfBirthInput = $("#dateOfBirthInput");
    private final SelenideElement subjectsInput = $("#subjectsInput");
    private final SelenideElement currentAddress = $("#currentAddress");
    private final SelenideElement SelectState = $(byText("Select State"));
    private final SelenideElement uploadPicture = $("#uploadPicture");
    private final SelenideElement city = $("#city");
    private final SelenideElement submit = $("#submit");

    @Step("Open Page")
    public PageObgects openPage() {
        open("/automation-practice-form");
        executeJavaScript("$('#fixedban').remove()");
        executeJavaScript("$('footer').remove()");
        return this;
    }
    @Step("Entering a first and last name")
    public PageObgects setFirstName(String firstName) {
        firstNameInput.setValue(firstName);
        return this;  //
    }
    public PageObgects setLastName( String lestName) {
        lastNameInput.setValue(lestName);
        return this;
    }
    @Step("Email input")
    public PageObgects setEmail(String email) {
        userEmailInput.setValue(email);
        return this;
    }
    @Step("Gender selection")
    public PageObgects setGender(String value) {
        genterWrapper.$(byText(value)).click();
        return this;
    }
    @Step("Entering a phone number")
    public PageObgects setPhone(String value) {
        userNumber.setValue(value);
        return this;
    }
    @Step("Specify birthday")
    public PageObgects setBirthDate(String day, String month, String year) {
        dateOfBirthInput.click();
        calendarComponent.setDate(day, month, year);
        return this;
    }
    @Step("Set subjects")
    public PageObgects setSubjects(String value) {
        subjectsInput.setValue(value);
        return this;
    }
    @Step("Choice of hobby")
    public PageObgects setHobbies(String value) {
        $(byText(value)).doubleClick();
        return this;
    }
    @Step("Enter current address")
    public PageObgects setCurrentAddress(String value) {
        currentAddress.setValue(value);
        return this;
    }
    @Step("Specify state and city")
    public PageObgects setSelectState(String value) {
        SelectState.click();
        $(byText(value)).click();
        return this;
    }
    public PageObgects setSelectCity(String value) {
        city.click();
        $(byText(value)).click();
        return this;
    }
    @Step("Upload Picture")
    public PageObgects setUploadPicture(String value) {
        uploadPicture.uploadFromClasspath(value);
        return this;
    }
    @Step("Press Submit button")
    public void setSubmit() {
        submit.click();
    }
    @Step("Checking the entered data in the modal window")
    public PageObgects resultsModal() {
        registrationResultsModal.resultsModalComponent();
        return this;
    }
    public PageObgects verifyResult(String key, String value) {
        registrationResultsModal.verifyResult(key, value);
        return this;
    }
}