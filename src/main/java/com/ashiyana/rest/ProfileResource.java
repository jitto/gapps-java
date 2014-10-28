package com.ashiyana.rest;

import javax.ws.rs.*;
import java.util.List;
import java.util.Collections;

@Path("/profile")
public class ProfileResource {
    @GET
    @Produces("application/json")
    public List<Profile> getMany() {
        Profile newProfile = new Profile();
        newProfile.name = "test";
        return Collections.singletonList(newProfile);
    }

}