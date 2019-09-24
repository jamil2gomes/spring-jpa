package com.jamil.springJpa.resources.util;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

public class Url {

	public static String decodeParam(String txt) {
		try {
			return URLDecoder.decode(txt, "UTF-8");
		} catch (UnsupportedEncodingException e) {
			return "";
		}
	}
}
