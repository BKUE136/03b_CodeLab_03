package com.cc.java;

public class B_Mitarbeiter {

/* 
Class is Super Class extended by 
C_MA_Accouting, C_MA_Advertising, C_MA_Production
*/

    // field Super Class B_Mitarbeiter    
    private String familyName;
    private String firstName;
    private String birthYear;
    protected Integer workID;
    protected Integer department;
    protected String role;
    protected Integer hireYear;

    // Construtor for attributes in field
    public B_Mitarbeiter(String familyName, String firstName, String birthYear, Integer workID, Integer department,
        String role, Integer hireYear) {
        this.familyName = familyName;
        this.firstName = firstName;
        this.birthYear = birthYear;
        this.workID = workID;
        this.department = department;
        this.role = role;
        this.hireYear = hireYear;
    }

    // setter and getters for attributes in field
    public String getFamilyName() {
        return familyName;
    }
    protected void setFamilyName(String familyName) {
        this.familyName = familyName;
    }
    public String getFirstName() {
        return firstName;
    }
    protected void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getBirthYear() {
        return birthYear;
    }
    protected void setBirthYear(String birthYear) {
        this.birthYear = birthYear;
    }
    public Integer getWorkID() {
        return workID;
    }
    protected void setWorkID(Integer workID) {
        this.workID = workID;
    }
    public Integer getDepartment() {
        return department;
    }
    protected void setDepartment(Integer department) {
        this.department = department;
    }
    public String getRole() {
        return role;
    }
    protected void setRole(String role) {
        this.role = role;
    }
    public Integer getHireYear() {
        return hireYear;
    }
    protected void setHireYear(Integer hireYear) {
        this.hireYear = hireYear;
    }

    // switchcase
    public String getStringAttibutes(String op) {
        switch (op) {
            case "#familyName": 
                return this.familyName;
             case "#firstName":
                return this.firstName;    
            case "#birthYear":
                return this.birthYear;
            case "#workID":
                return Integer.toString(this.workID);
            case "#department":
                return Integer.toString(this.department);
            case "#role":
                return this.role;
            case "#hireYear":
                return Integer.toString(this.hireYear);
            default:
                return "Kenne ma nicht!";
            }
    
    }

    // method to get Departmentname
    private String getDepartmentName(int department) {
    switch (department) {
        case 1:
            return "Accounting";
        case 2:
            return "Accounting";
        case 3:
            return "Accounting";
        default:
            return "Sowas mache hia nicht!";
        }
    }

    // Methods used in Super Class B_Mitarbeiter
    public String hasLunch(String firstName){
        return ("Ich bin der " + this.firstName + ", " + "Mahlzeit! ");
    }

    public String startsWork(String firstName, String getAbteilungsNamen) {
        return "Guten Tag, mein Name ist " + this.firstName + " vom " + getDepartmentName(this.department) + ", gute Schicht!";
    }

    public String getEmployedTime(String hireYear, String firstNameString) {
        return "Ich bin " + this.firstName + ", und ich arbeite hier seit " + this.hireYear +"!";
    }

}

