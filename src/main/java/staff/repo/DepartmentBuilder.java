package staff.repo;

import staff.Model.Department;

/**
 * Реализация Buildet для класса Организация
 *
 * @author AAM
 **/
public class DepartmentBuilder {
    private String fullName;
    private String shortName;
    private String chief;
    private String contact;

    public DepartmentBuilder setFullName(String fullName) {
        this.fullName = fullName;
        return this;
    }

    public DepartmentBuilder setShortName(String shortName) {
        this.shortName = shortName;
        return this;
    }

    public DepartmentBuilder setChief(String chief) {
        this.chief = chief;
        return this;
    }

    public DepartmentBuilder setContact(String contact) {
        this.contact = contact;
        return this;
    }

    public Department createDepartment() {
        return new Department(fullName, shortName, chief, contact);
    }
}