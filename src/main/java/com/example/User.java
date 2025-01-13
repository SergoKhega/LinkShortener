package com.example;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class User {
    private UUID id;
    private List<Link> links;

    public User() {
        this.id = UUID.randomUUID();
        this.links = new ArrayList<>();
    }

    public UUID getId() {
        return id;
    }

    public List<Link> getLinks() {
        return links;
    }

    public void addLink(Link link) {
        links.add(link);
    }
}
