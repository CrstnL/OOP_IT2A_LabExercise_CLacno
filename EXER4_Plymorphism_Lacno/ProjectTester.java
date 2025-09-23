// Tester Class
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
        // Using overloaded methods
        String complaint1 = resident.submitComplaint("Street light not working.");
        String complaint2 = resident.submitComplaint("Garbage collection delayed", "Sanitation");

        System.out.println();
        admin.updateComplaint(complaint1, "In Progress");

        System.out.println();
        admin.makeAnnouncement("Community clean-up drive this Saturday!");
        admin.makeAnnouncement("Barangay meeting tomorrow", "September 24, 2025");

        System.out.println();
        resident.reactToAnnouncement("Community clean-up drive this Saturday!", "Will join!");
    }
}
