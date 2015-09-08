package step_definitions;

import java.util.Random;

import org.junit.Assert;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.comcast.memes.MemesUtil;
import com.comcast.memes.domain.Memes;
import com.comcast.memes.domain.MemesObj;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class MemesTest {
	protected static Logger logger = LoggerFactory.getLogger(MemesTest.class);

	MemesUtil util = new MemesUtil();
	Memes memes = new Memes();
	Random randNumber = new Random();

	@Given("^Memes Json$")
	public void memes_Json() throws Throwable {
		System.out.println("Starting the Process");
	}

	@When("^I consume a memes rest api$")
	public void i_consume_a_memes_rest_api() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		memes = util.readJsonToMemesJsonFile();
		logger.info("memes is " + memes.toString());

		Assert.assertNotNull(memes);
	}

	@When("^I sort the memes according to name$")
	public void i_sort_the_memes_according_to_name() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		// Sort the Json with Name using Lambda.

		/*
		 * Approach 1
		 * 
		 * Collections.sort(memesObj.getData().getListMemes(), new
		 * Comparator<Memes>() {
		 * 
		 * @Override public int compare(Memes o1, Memes o2) { return
		 * o1.getName().compareTo(o2.getName()); } });
		 * 
		 * // Approach 2 : lambda memesObj.getData().getListMemes().sort((Memes
		 * o1, Memes o2)->o1.getName().compareTo(o2.getName()));
		 */

		// Approach 3 : lambda simple
		memes.getListMemes().sort((o1, o2) -> o1.getName().compareTo(o2.getName()));
	}

	@When("^I generate random number to assign scores in json$")
	public void i_generate_random_number_to_assign_scores_in_json()
			throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		// Set the lulz.
		for (int i = 0; i < memes.getListMemes().size(); i++) {
			memes.getListMemes().get(i).setLulz(randNumber.nextInt(10) + 1);
		}

		for (MemesObj e : memes.getListMemes()) {
			System.out.println(e.toString());
		}
		util.writeJsonToMemesJsonFile(memes);
	}

	@When("^I copy them to a json file locally$")
	public void i_copy_them_to_a_json_file_locally() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Completed the Process");
	}

}
