package com.cc.java;

public class C_MA_Advertising extends B_Mitarbeiter {

    // constructor
    public C_MA_Advertising(String familyName, String firstName, String birthYear, Integer workID, Integer department,
            String role, Integer hireYear) {
        super(familyName, firstName, birthYear, workID, department, role, hireYear);
    }


    // Methods of Class C_MA_Advertising
    public String doYourWork() {
        return "Advertising";
    }

}

