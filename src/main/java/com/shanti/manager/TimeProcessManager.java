package com.shanti.manager;

import java.time.LocalDateTime;

public class TimeProcessManager {

	public String getCurrentTime() {
		return LocalDateTime.now().toString();
	}

}
