package com.shanti.response;


import java.util.Objects;

public class TimeResponse {
	private String currentTime;
	private Integer invocationCount;

	public TimeResponse(String currentTime, Integer invocationCount) {
		this.currentTime = currentTime;
		this.invocationCount = invocationCount;
	}

	public String getCurrentTime() {
		return currentTime;
	}

	public void setCurrentTime(String currentTime) {
		this.currentTime = currentTime;
	}

	public Integer getInvocationCount() {
		return invocationCount;
	}

	public void setInvocationCount(Integer invocationCount) {
		this.invocationCount = invocationCount;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		TimeResponse time = (TimeResponse) o;
		return Objects.equals(currentTime, time.currentTime) && Objects.equals(invocationCount, time.invocationCount);
	}

	@Override
	public int hashCode() {
		return Objects.hash(currentTime, invocationCount);
	}

	@Override
	public String toString() {
		return "TimeResponse{" + "currentTime='" + currentTime + '\'' + ", invocationCount=" + invocationCount + '}';
	}
}
