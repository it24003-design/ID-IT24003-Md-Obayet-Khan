public class AdministrativeOfficer extends Employee {

    private String officeName;

    public AdministrativeOfficer(int memberId,
                                 String name,
                                 double salary,
                                 String officeName) {

        super(memberId, name, salary);
        this.officeName = officeName;
    }

    public void showOffice() {
        System.out.println("Office: " + officeName);
    }

    @Override
    public void performDuty() {
        System.out.println(name +" manages university administrative activities.");
    }
}
