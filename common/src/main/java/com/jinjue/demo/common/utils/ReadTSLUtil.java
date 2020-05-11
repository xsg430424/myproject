package com.jinjue.demo.common.utils;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class ReadTSLUtil {
	public static String readFileToString(String path, String fileName) {

		try {
			return FileUtils.readFileToString(new File(path.replace("%20", " ") + fileName),
					"utf8");
		} catch (IOException e) {
			throw new RuntimeException(e.getMessage());
		}
	}

	public static <T> T changeStringToObject(String path, String fileName, TypeReference<T> type) {

		String retStr = ReadTSLUtil.readFileToString(path, fileName);
		T t = JSONObject.parseObject(retStr, type);
		return t;
	}
}
