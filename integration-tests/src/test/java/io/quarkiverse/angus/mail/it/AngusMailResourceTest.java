package io.quarkiverse.angus.mail.it;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.Test;

import io.quarkus.test.junit.QuarkusTest;

@QuarkusTest
public class AngusMailResourceTest {

    @Test
    public void testHelloEndpoint() {
        given()
                .when().get("/angus-mail")
                .then()
                .statusCode(200)
                .body(is("Hello angus-mail"));
    }
}
