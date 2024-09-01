package org.wolwire.server.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class User {
    @JsonProperty
    private String name;

    public User(String name){
        this.name = name;
    }
}
