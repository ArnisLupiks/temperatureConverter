/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package converter;

import javax.ws.rs.ClientErrorException;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.WebTarget;

/**
 * Jersey REST client generated for REST resource:TemperatureConverter
 * [temperatureconverter]<br>
 * USAGE:
 * <pre>
 *        ConverterApp client = new ConverterApp();
 *        Object response = client.XXX(...);
 *        // do whatever with response
 *        client.close();
 * </pre>
 *
 * @author Arnis
 */
public class ConverterApp {
    private WebTarget webTarget;
    private Client client;
    private static final String BASE_URI = "http://localhost:8080/temperatureConverter/webresources";

    public ConverterApp() {
        client = javax.ws.rs.client.ClientBuilder.newClient();
        webTarget = client.target(BASE_URI).path("temperatureconverter");
    }

    public String getHtml(String TemperatureConverter) throws ClientErrorException {
        
        webTarget = client.target(BASE_URI).path("temperatureconverter").queryParam("TemperatureConverter", TemperatureConverter);
        WebTarget resource = webTarget;
        if (TemperatureConverter != null) {
            resource = resource.queryParam("TemperatureConverter", TemperatureConverter);
        }
        return resource.request(javax.ws.rs.core.MediaType.TEXT_HTML).get(String.class);
    }

    public void putHtml(Object requestEntity) throws ClientErrorException {
        webTarget.request(javax.ws.rs.core.MediaType.TEXT_HTML).put(javax.ws.rs.client.Entity.entity(requestEntity, javax.ws.rs.core.MediaType.TEXT_HTML));
    }

    public void close() {
        client.close();
    }
    
}
