package com.exist.ecc.core.model.dto;

import java.util.*;
import com.exist.ecc.core.model.*;

public class PersonDto {

    private int id;

    private NameDto name;

    private AddressDto address;

    private Date birthDate;

    private Date dateHired;

    private boolean currentlyEmployed;

    private Double gwa;

    private List<RoleDto> roles;

    private List<ContactDto> contacts;

    public PersonDto() {}
    public PersonDto(NameDto name, AddressDto address, Date birthDate, Date dateHired,
                     boolean currentlyEmployed, double gwa, List<RoleDto> roles, List<ContactDto> contacts) {

        this.name = name;
        this.address = address;
        this.birthDate = birthDate;
        this.dateHired = dateHired;
        this.currentlyEmployed = currentlyEmployed;
        this.gwa = gwa;
        this.roles = roles;
        this.contacts = contacts;
    }

    // getters
    public int getId() {
        return id;
    }

    public NameDto getName() {
        return name;
    }

    public AddressDto getAddress() {
        return address;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public Date getDateHired() {
        return dateHired;
    }

    public boolean getCurrentlyEmployed() {
        return currentlyEmployed;
    }

    public Double getGwa() {
        return gwa;
    }

    public List<RoleDto> getRoles() {
        return roles;
    }

    public List<ContactDto> getContacts() {
        return contacts;
    }

    // setters
    public void setId(int id) {
        this.id = id;
    }

    public void setName(NameDto name) {
        this.name = name;
    }

    public void setAddress(AddressDto address) {
        this.address = address;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public void setDateHired(Date dateHired) {
        this.dateHired = dateHired;
    }

    public void setCurrentlyEmployed(boolean currentlyEmployed) {
        this.currentlyEmployed = currentlyEmployed;
    }

    public void setGwa(Double gwa) {
        this.gwa = gwa;
    }

    public void setRoles(List<RoleDto> roles) {
        this.roles = roles;
    }

    public void setContacts(List<ContactDto> contacts) {
        this.contacts = contacts;
    }

	public void addRole(RoleDto role) {
        if(roles == null) {
            roles = new ArrayList<RoleDto>();
        }
        roles.add(role);
        role.addPerson( this );
    }

    public void removeRole(RoleDto role) {
        roles.remove(role);
        role.removePerson( this );
    }

    public void addContact(ContactDto contact) {
        contacts.add(contact);
    }

    public String toString() {
        return "Person: " + name.toString();
    }
}
