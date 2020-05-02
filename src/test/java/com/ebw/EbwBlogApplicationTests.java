package com.ebw;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@SpringBootTest
class EbwBlogApplicationTests {

	@Test
	void contextLoads() {
		List<String> list = new ArrayList<>();
		list.add("");
		list.size();

		Map<String, String> map = new LinkedHashMap<String, String>();
		map.put("", "");

		Pattern pattern = Pattern.compile("");
		Matcher m = pattern.matcher("");
		m.find();


	}

}
