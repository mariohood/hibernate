package dev.ifrs;

import javax.transaction.Transactional;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import dev.ifrs.model.Channel;
import dev.ifrs.model.Message;
import dev.ifrs.model.User;

@Path("/api")
@Transactional
public class Service {
    
    @GET
    @Path("/user/create/{name}")
    @Produces(MediaType.APPLICATION_JSON)
    public User createUser(@PathParam("name")String name){

        User user = new User();
        user.setName(name);
        user.persist();
        return user;
    }

    @GET
    @Path("/message/create/{text}")
    @Produces(MediaType.APPLICATION_JSON)
    public Message createMessage(@PathParam("text")String text){

        Message message = new Message();
        message.setText(text);
        message.persist();
        return message;
               
    }

    @GET
    @Path("/chanel/create/{hash}")
    @Produces(MediaType.APPLICATION_JSON)
    public Channel createChanel(@PathParam("hash")String hash){

        Channel chanel = new Channel();
        chanel.setHash(hash);
        chanel.persist();
        return chanel;
               
    }

}
