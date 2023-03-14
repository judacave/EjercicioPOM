package com.sofkau.pages;

import com.sofkau.models.Estudiante;
import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class FormPage extends CommonActionOnPages{
    private final By name = By.id("firstName");
    private final By lastname = By.id("lastName");
    private final By email = By.id("userEmail");
    private final By genderMale = By.id("gender-radio-1");
    private final By genderFemale = By.id("gender-radio-1");
    private final By genderOther = By.id("gender-radio-3");
    private final By number = By.id("userNumber");
    private final By dateofbirth = By.id("dateOfBirthInput");
    private final By subject = By.id("subjectsInput");
    private final By sports = By.id("hobbies-checkbox-1");
    private final By reading = By.id("hobbies-checkbox-2");
    private final By music = By.id("hobbies-checkbox-3");

    private final By address = By.id("currentAddress");
    private final By state = By.id("react-select-3-input");
    private final By city = By.id("react-select-4-input");
    private final By submit = By.id("submit");

    private Estudiante estudiante;
    public FormPage(WebDriver driver, Estudiante estudiante) {
        super(driver);
        this.estudiante = estudiante;
    }

    public void fillMandatoryFields() {
        setZoom(70);
        clearText(name);
        typeInto(name, estudiante.getName());
        typeInto(lastname, estudiante.getLastName());
        typeInto(email, estudiante.getEmail());
        space(genderMale);
        typeInto(number, estudiante.getMobilenumber());
        space(dateofbirth);
        setDate(dateofbirth, estudiante.getDateofBirth());
        typeInto(subject, estudiante.getSubject().get(0));
        enter(subject);
        typeInto(subject, estudiante.getSubject().get(1));
        enter(subject);
        space(sports);
        space(music);
        typeInto(address, estudiante.getCurrentAddress());
        typeInto(state, estudiante.getState());
        enter(state);
        typeInto(city, estudiante.getCity());
        enter(city);
        space(submit);
    }

//    public void fillMandatoryFields() {
//        setZoom(70);
//        clearText(name);
//        typeInto(name, "Juanes");
//        typeInto(lastname, "Jhonson");
//        typeInto(email, "j.cardona1@gmail.com");
//        space(genderMale);
//        typeInto(number, "3215854785");
//        space(dateofbirth);
//        setDate(dateofbirth, "20 Feb 2020");
//        typeInto(subject, "Math");
//        enter(subject);
//        typeInto(subject, "Arts");
//        enter(subject);
//        space(sports);
//        space(music);
//        typeInto(address, "Calle 32 no 4-51");
//        typeInto(state, "NCR");
//        enter(state);
//        typeInto(city, "Delhi");
//        enter(city);
//        space(submit);
//    }


}



