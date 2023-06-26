package com.example.tzpetrosoft.endpoints;

import com.example.tzpetrosoft.service.TestXmlToJsonService;
import com.tz_petrosoft.ConverterRequest;
import com.tz_petrosoft.ConverterResponse;
import com.tz_petrosoft.GetPersonNameRequest;
import com.tz_petrosoft.GetPersonNameResponse;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class PersonEndpoint {
    private static final String NAMESPACE_URI = "http://tz-petrosoft.com";

    private final TestXmlToJsonService service;

    public PersonEndpoint(TestXmlToJsonService service) {
        this.service = service;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getPersonNameRequest")
    @ResponsePayload
    public GetPersonNameResponse getName(@RequestPayload GetPersonNameRequest request) {
        String name = request.getPerson().getName();
        GetPersonNameResponse response = new GetPersonNameResponse();
        response.setName(name);
        return response;
    }
    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "converterRequest")
    @ResponsePayload
    public ConverterResponse converterXmlToJsonAndWriteToLog(
            @RequestPayload ConverterRequest request) {
        ConverterResponse response = new ConverterResponse();
        response.setLog(request.getPerson().toString());
            service.converter(request.getPerson());
            return response;
    }
}
