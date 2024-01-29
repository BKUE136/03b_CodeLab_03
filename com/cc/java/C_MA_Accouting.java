package com.cc.java;

public class C_MA_Accouting extends B_Mitarbeiter {
    
    // constructor
    public C_MA_Accouting(String familyName, String firstName, String birthYear, Integer workID, Integer department,
            String role, Integer hireYear) {
        super(familyName, firstName, birthYear, workID, department, role, hireYear);
    }


    // Methods of Class C_MA_Accouting
    public String doYourWork() {
        return "KAFFEE TRINKEN";
    }

}

