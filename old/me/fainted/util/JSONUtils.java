package me.fainted.util;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonParser;

public class JSONUtils {

	public static Gson gson = new Gson();
	public static Gson prettyGson = new GsonBuilder().setPrettyPrinting().create();
	public static JsonParser jsonParser = new JsonParser();
	
}
