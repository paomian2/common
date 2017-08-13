package com.hhx.util;

import com.google.gson.Gson;

public class GsonUtil {

	private volatile static Gson gson = new Gson();

	public static String toJson(Object obj){
		return gson.toJson(obj);
	}

}
