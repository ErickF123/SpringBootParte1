package com.devs4j.hello.profiles;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * 
 */

@Service
@Profile("qa")
public class QaEnviroment implements EnviromentService  {

	@Override
	public String getEnviroment() {
		return "QA";
	}

}
