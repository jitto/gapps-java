package com.ashiyana.rest;

import javax.ws.rs.*;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.ArrayList;

@Path("/profile")
public class ProfileResource {
    @GET
    @Produces("text/plain")
    public String getMany() {
        return "Hello there";
    }
}