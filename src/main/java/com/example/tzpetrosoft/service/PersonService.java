package com.example.tzpetrosoft.service;

import com.example.tzpetrosoft.Person;
import org.springframework.stereotype.Service;

@Service
public class PersonService {

public String getPersonName(Person person) {
    return person.getName();
}
}
