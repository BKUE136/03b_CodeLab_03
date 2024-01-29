package com.cc.java;

public class C_MA_Production extends B_Mitarbeiter {
    
    // constructor
    public C_MA_Production(String familyName, String firstName, String birthYear, Integer workID, Integer department,
            String role, Integer hireYear) {
        super(familyName, firstName, birthYear, workID, department, role, hireYear);
    }


    // Methods of Class C_MA_Production
    public String doYourWork() {
        return "Production";
    }
    
}

