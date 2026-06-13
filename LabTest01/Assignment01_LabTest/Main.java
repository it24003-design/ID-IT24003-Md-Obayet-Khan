package Java_Program.JuneEight.Assignment01_LabTest;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<UniversityMember> members = new ArrayList<>();

        members.add(
                new Professor(
                        100006,
                        "Dr. XYZ",
                        130000,
                        "CSE",
                        "CyberSecurity",
                        45
                )
        );

        members.add(
                new AdministrativeOfficer(
                        50001,
                        "Mr. Karim",
                        60000,
                        "Registrar Office"
                )
        );

        System.out.println("===== Professor's Details =====");

        for (UniversityMember member : members) {

            if (member instanceof Professor) {

                Professor p = (Professor) member;

                p.displayBasicInfo();
                p.showSalary();
                p.showDepartment();
                p.showResearchProfile();
                p.performDuty();

                System.out.println();
            }
        }

        System.out.println("===== Administrative Officer Details =====");

        for (UniversityMember member : members) {

            if (member instanceof AdministrativeOfficer) {

                AdministrativeOfficer ao =
                        (AdministrativeOfficer) member;

                ao.displayBasicInfo();
                ao.showSalary();
                ao.showOffice();
                ao.performDuty();

                System.out.println();
            }
        }
    }
}