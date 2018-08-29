package com.shanti.service;

import com.shanti.manager.TimeProcessManager;
import com.shanti.response.TimeResponse;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/time")
public class TimeService {
    private static Integer invocationCount = 0;
    private TimeProcessManager processManager = new TimeProcessManager();

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getTime() {
        invocationCount++;
        String currentTime = processManager.getCurrentTime();
        TimeResponse timeResponse = new TimeResponse(currentTime, invocationCount);
        return Response.ok(timeResponse).build();
    }
}