package com.example.tzpetrosoft.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.tz_petrosoft.Person;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class TestXmlToJsonService {
    private static final Logger logger = LoggerFactory.getLogger(TestXmlToJsonService.class);

    public void converter(Person xml) {
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            String s = objectMapper.writeValueAsString(xml);
            logger.info("xml: " + s);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }

    }
}
