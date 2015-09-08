package com.comcast.memes;

import java.io.File;
import java.io.IOException;

import com.comcast.memes.domain.Memes;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class MemesUtil {
	public void writeJsonToMemesJsonFile(Memes memes)
			throws JsonGenerationException, JsonMappingException, IOException {
		// Write to the json file.
		ObjectMapper mapper = new ObjectMapper();
		try {
			mapper.writeValue(
					new File(
							"/Users/tejapolapragada/Documents/workspace-sts-3.5.1.RELEASE/memes/src/main/resources/MemesInfo.json"),
					memes);
		} catch (JsonGenerationException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public Memes readJsonToMemesJsonFile() throws JsonParseException,
			JsonMappingException, IOException {
		ClassLoader classLoader = getClass().getClassLoader();
		ObjectMapper mapper = new ObjectMapper();

		Memes memes = new Memes();

		File file = new File(classLoader.getResource("MemesInfo.json")
				.getFile());

		memes = mapper.readValue(file, Memes.class);
		return memes;
	}
}
