package staff.repo;

import staff.Model.Organization;

/**
 * Реализация Builder для класса Organization
 *
 * @author AAM
 **/
public class OrganizationBuilder {
    private String fullName;
    private String shortName;
    private String chief;
    private String contact;

    public OrganizationBuilder setFullName(String fullName) {
        this.fullName = fullName;
        return this;
    }

    public OrganizationBuilder setShortName(String shortName) {
        this.shortName = shortName;
        return this;
    }

    public OrganizationBuilder setChief(String chief) {
        this.chief = chief;
        return this;
    }

    public OrganizationBuilder setContact(String contact) {
        this.contact = contact;
        return this;
    }

    public Organization createOrganization() {
        return new Organization(fullName, shortName, chief, contact);
    }

}