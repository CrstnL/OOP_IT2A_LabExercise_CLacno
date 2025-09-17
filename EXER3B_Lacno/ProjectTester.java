public class ProjectTester {
    public static void main(String[] args) {
        Admin admin = new Admin("Kap. Reyes", "kapreyes", "12345");
        Resident resident = new Resident("Juan Dela Cruz", "juanDC", "67890");

        
        admin.login();
        admin.showHome();

        System.out.println();

        resident.login();
        resident.showHome();

        System.out.println();
        resident.register();

        System.out.println();
        String complaint = resident.submitComplaint("Street light not working.");

        System.out.println();
        admin.updateComplaint(complaint, "In Progress");

        System.out.println();
        String announcement = "Community clean-up drive this Saturday!";
        admin.makeAnnouncement(announcement);

        System.out.println();
        resident.reactToAnnouncement(announcement, "Will join!");
    }
}