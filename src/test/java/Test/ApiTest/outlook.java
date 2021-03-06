package Test.ApiTest;

import com.jayway.restassured.http.ContentType;
import org.apache.http.HttpStatus;
import org.junit.Test;
import restassured.Set_Up;

import java.net.URI;
import java.net.URISyntaxException;

import static com.jayway.restassured.RestAssured.given;


public class outlook extends Set_Up  {

	
	@Test
	public void ourtest_0(){
		given().get("/iso2code/NG")
		.then()
		.statusCode(200)
		.log()
		.all();
	}
	@Test  // this is a junit annotation to run test
	public void ourtest_print_out() throws URISyntaxException{
		         given()
				.accept(ContentType.JSON)
				.when()
				.get(new URI ("/iso2code/US"))
		        .then()
		        .assertThat()
		        .statusCode(HttpStatus.SC_OK);
				//System.out.println(response.asString());
				//http://services.groupkt.com/country/get/iso3code/BRA
	}

	@Test  // this is a junit annotation to run test
	public void ourtest_print_out1() throws URISyntaxException {
		given()
				.accept(ContentType.JSON)
				.when()
				.get(new URI("/iso2code/US"))
				.then()
				.assertThat()
				.statusCode(HttpStatus.SC_OK);
		//System.out.println(response.asString());
		//http://services.groupkt.com/country/get/iso3code/BRA
	}
	@Test
	public void assert_status() throws URISyntaxException{
		given()
		.accept(ContentType.JSON)
		.when()
		.get(new URI("/all"))
		.then()
		.assertThat()
		.statusCode(HttpStatus.SC_OK);
		
	}
	@Test
	public void ourtest_Test_USA_API() throws URISyntaxException{
        given()
		.accept(ContentType.JSON)
		.when()
		.get(new URI ("/iso2code/US"))
       .then()
       .assertThat()
       .statusCode(HttpStatus.SC_OK);
}
}
