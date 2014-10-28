package com.ashiyana.rest;

import javax.ws.rs.*;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.ArrayList;

@Path("/profile")
public class ProfileResource {
    @GET
    @Produces("application/json")
    public String getMany() {
        Profile newProfile = new Profile();
        newProfile.name = "test";
        return Collections.singletonList(newProfile);
    }

}