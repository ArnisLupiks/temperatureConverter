/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package temperatureConverter;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.QueryParam;

/**
 * REST Web Service
 *
 * @author Arnis
 */
@Path("temperatureconverter")
public class TemperatureConverter {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of TemperatureConverter
     */
    public TemperatureConverter() {
    }

    /**
     * Retrieves representation of an instance of temperatureConverter.TemperatureConverter
     * @return an instance of java.lang.String
     */
    @GET
    @Produces("text/html")
    public String getHtml(@QueryParam("TemperatureConverter") int TemperatureConverter) {
        int fTempVal = (9*TemperatureConverter )/5+32;
        return "Fahrenheit :" + fTempVal;
    }

    /**
     * PUT method for updating or creating an instance of TemperatureConverter
     * @param content representation for the resource
     * @return an HTTP response with content of the updated or created resource.
     */
    @PUT
    @Consumes("text/html")
    public void putHtml(String content) {
    }
}
