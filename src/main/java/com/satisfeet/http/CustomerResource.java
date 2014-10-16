package com.satisfeet.http;

import java.util.List;

import javax.inject.Inject;
import javax.enterprise.context.RequestScoped;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;

import com.satisfeet.core.Customer;
import com.satisfeet.core.CustomerRepository;

@Path("/customers")
@RequestScoped
public class CustomerResource {

    @Inject
    private CustomerRepository repo;

    @GET
    public List<Customer> list() {
        return repo.findAll();
    }

    @POST
    public Customer create() {
        return new Customer();
    }

    @GET
    @Path("/{id:[0-9][0-9]*}")
    public Customer show() {
        return new Customer();
    }

    @PUT
    @Path("/{id:[0-9][0-9]*}")
    public void update() {

    }

    @DELETE
    @Path("/{id:[0-9][0-9]*}")
    public void destroy() {

    }

}
