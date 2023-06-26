package com.example.tzpetrosoft;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlElement;

@JacksonXmlRootElement(
        namespace = "http://localhost:8080/person",
        localName = "person"
)
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class Person {
    @XmlElement(name = "name")
    private String name;
    @XmlElement(name = "age")
    private int age;
}
