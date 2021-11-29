package com.song.jsf.example;

import java.io.Serializable;

public class Persona implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;
    private String name;
    private String lastName;
    private String typeDocument;
    private String document;
    private String birthDate;

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }
    

    public String getTypeDocument() {
        return typeDocument;
    }

    public void setTypeDocument(String typeDocument) {
        this.typeDocument = typeDocument;
    }
    

    public Persona() {
    }

    public Persona(Long id, String name, String lastName, String typeDocument, String document, String birthDate) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.typeDocument = typeDocument;
        this.document = document;
        this.birthDate = birthDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public Persona clone() {
        return new Persona(id, name, lastName, typeDocument, document, birthDate);
    }

    public void restore(Persona persona) {
        this.id = persona.getId();
        this.name = persona.getName();
        this.lastName = persona.getLastName();
        this.typeDocument = persona.getTypeDocument();
        this.document = persona.getDocument();
        this.birthDate = persona.getBirthDate();
    }
}
