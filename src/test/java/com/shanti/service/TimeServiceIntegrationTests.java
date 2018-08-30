package com.shanti.service;

import com.shanti.response.TimeResponse;
import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.test.JerseyTest;
import org.junit.Test;

import javax.ws.rs.core.Application;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import static org.junit.Assert.assertEquals;

public class TimeServiceIntegrationTests extends JerseyTest {

	@Override
	protected Application configure() {
		return new ResourceConfig(TimeService.class);
	}

	@Test
	public void getTimeShouldReturnOKStatus() {
		//given
		int expectedHttpOK = 200;
		MediaType expectedResponseType = MediaType.valueOf("application/json");

		//when
		final Response response = target().path("time").request().get();

		//then
		assertEquals(expectedHttpOK, response.getStatus());
		assertEquals(expectedResponseType, response.getMediaType());
	}

	@Test
	public void getTimeShouldReturnInvocationCount() {
		//given
		Integer expectedApiInvocationCount = 2;

		//when
		final Response response = target().path("time").request().get();
		TimeResponse timeResponse = response.readEntity(TimeResponse.class);

		//then
		assertEquals(expectedApiInvocationCount, timeResponse.getInvocationCount());
	}
}
