package com.sofkau.stepdefinitions;

import com.sofkau.Repository;
import com.sofkau.models.Estudiante;
import com.sofkau.pages.FormPage;
import com.sofkau.setup.WebUi;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.logging.Logger;


public class FormStepDefinition extends WebUi {
    Repository repository = new Repository();
    public static Logger LOGGER = Logger.getLogger(String.valueOf(FormStepDefinition.class));
    @Given("el administrador esta en la pagina principal")
    public void elAdministradorEstaEnLaPaginaPrincipal() {
        generalSetUp();
        LOGGER.info("Inicio de la Automatizacion");
    }
    @When("navega hasta la opcion de formularios")
    public void navegaHastaLaOpcionDeFormularios() {
        FormPage formPage = new FormPage(super.driver, repository.generateStudent());
        formPage.fillMandatoryFields();
    }
    @When("completa los campos con la informacion del estudiante")
    public void completaLosCamposConLaInformacionDelEstudiante() {

    }
    @Then("debe observar una ventana con la informacion ingresada")
    public void debeObservarUnaVentanaConLaInformacionIngresada() {
//        quitDriver();
    }
}
