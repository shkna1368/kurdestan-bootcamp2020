package com.kurdestanbootcamp.quarksdemo.exception;

import org.eclipse.microprofile.config.inject.ConfigProperty;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

@Provider
public class CustomExceptionHandler
        implements ExceptionMapper<CustomException> {

    @ConfigProperty(name = "custom.error.msg.usernotfound")
    String userNotFound;



    @ConfigProperty(name = "custom.error.msg.duplicate")
    String duplicateException;



    @Override
    public Response toResponse(CustomException e) {

        if (e.getMessage().equalsIgnoreCase(userNotFound)) {
            return Response.status(Response.Status.NOT_FOUND).
                    entity(new ErrorMessage(e.getMessage(), false)).build();
        }

        else   if (e.getMessage().equalsIgnoreCase(duplicateException)) {
            return Response.status(Response.Status.CONFLICT).
                    entity(new ErrorMessage(e.getMessage(), false)).build();
        }


        else  {

            return Response.status(Response.Status.BAD_REQUEST).
                    entity(new ErrorMessage(e.getMessage(), false)).build();
        }


    }
}