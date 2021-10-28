package apiTests;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class TestaPet {

    @Test
    public void incluirPet(){

        // Padrao
        // Given = Dado
        // .When = Quando
        // .Then = Entao

        given()
                .contentType("application/json")
                .log().all()
        .when()
                .post("https://petstore.swagger.io/v2/pet")
        .then()
                .log().all()
        ;
    }

}
