package com.pranical.tutorial.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

public class JsonTransformerImpl implements JsonTransformer {

	@Override
	public String toJson(Object data) {
		try {
            	ObjectMapper objectMapper = new ObjectMapper();
            	return objectMapper.writeValueAsString(data);
        } catch (JsonProcessingException ex) {
        		throw new RuntimeException(ex);
        }
	}

	@Override
	public <T> T fromJSON(String json, Class<T> clazz) {
		try {
            ObjectMapper objectMapper = new ObjectMapper();
 
            return objectMapper.readValue(json, clazz);
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
	}

}
