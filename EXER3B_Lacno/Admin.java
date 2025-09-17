class Admin extends User {
    public Admin(String name, String username, String password) {
        super(name, username, password);
    }

    @Override
    public void showHome() {
        System.out.println("Welcome Admin " + getName() + "! You can manage complaints and announcements.");
    }

    public void makeAnnouncement(String content) {
        System.out.println("Admin " + getName() + " posted announcement: " + content);
    }

    public void updateComplaint(String complaint, String newStatus) {
        System.out.println("Admin " + getName() + " updated complaint '" + complaint + "' to status: " + newStatus);
    }
}