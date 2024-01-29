package com.cc.java;


public class App {
  
    public static void main(String[] args) {

        B_Mitarbeiter b_Mitarbeiter1 = new B_Mitarbeiter(
            "Hubertus",
            "Heinz",
            "1964",
            101,
            01,
            "DOA",
            2018
        );
    
        B_Mitarbeiter b_Mitarbeiter2 = new B_Mitarbeiter(
            "Kaufmann",
            "Stefan",
            "1952",
            201,
            02,
            "CSA",
            2004
        );

        B_Mitarbeiter b_Mitarbeiter3 = new B_Mitarbeiter(
            "Krampe-Melankovic",
            "Betina" ,
            "2010",
            304,
            03,
            "Produktionhelfer",
            2023
        );

    //test1
    // output("---------------------------------");
    // output(b_Mitarbeiter1.getStringAttibutes("#familyName"));
    // output(b_Mitarbeiter2.getStringAttibutes("#firstName"));
    // output(b_Mitarbeiter3.getStringAttibutes("#hireYear"));
    // output(b_Mitarbeiter3.getStringAttibutes(""));
    output("---------------------------------");
    // output(b_Mitarbeiter1.getFirstName());
    // output(b_Mitarbeiter1.getBirthYear());
    // output(b_Mitarbeiter1.getWorkID());
    // output(b_Mitarbeiter1.getDepartment());
    // output(b_Mitarbeiter1.getRole());
    // output(b_Mitarbeiter1.getHireYear());
    // output("---------------------------------");
    // output(b_Mitarbeiter2.getFamilyName());
    // output(b_Mitarbeiter3.getFamilyName());
    // output("---------------------------------");
    //test2
    output(b_Mitarbeiter1.hasLunch(null));
    output(b_Mitarbeiter2.startsWork(null, null));
    output(b_Mitarbeiter3.getEmployedTime(null, null));
    output("---------------------------------");

    }
    
    // method output
    private static void output(String outStr) {
        System.out.println(outStr);
    }
   // method output overload: Integer
//    private static void output(Integer outStr) {
//     System.out.println(outStr);
//     }
    
}

