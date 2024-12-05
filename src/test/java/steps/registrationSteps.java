package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;
import java.util.Map;

import org.testng.Assert;

import io.cucumber.datatable.DataTable;

public class registrationSteps {

	@Given("I am on registartion page")
	public void i_am_on_registartion_page() {
		System.out.println("@Given->I am on registartion page");
	}

	@When("I click add nominee button")
	public void i_click_add_nominee_button() {
		System.out.println("@When->I click add nominee button");
	}

	@When("I add below nominee details")
	public void i_add_below_nominee_details(DataTable dataTable) {

		
		for (Map<String, String> data : dataTable.asMaps(String.class, String.class)) {
			
			System.out.println("fullName: " + data.get("fullName") + " Email: " + data.get("Email") + " Age: "
					+ data.get("Age") + " Contact: " + data.get("Contact"));
		}
	}

	@Then("I click to save button")
	public void i_click_to_save_button() {
		System.out.println("@Then->I click to save button");
	}

	// Update record

	@When("I click edit nominee button")
	public void i_click_edit_nominee_button() {
		System.out.println("@When->I click edit nominee button");
	}

	@When("I add below nominee details at the existing deatils")
	public void i_add_below_nominee_details_at_the_existing_deatils(DataTable data) {
		
		for(List<String>data1:data.asLists(String.class)) {
			System.out.println("updatedList: "+data1);
		}
		List<List<String>>data1=data.asLists();
		Assert.assertTrue(data1.contains("Neral"));
	}
}
