class Admin extends User {
    public Admin(String name, String username, String password) {
        super(name, username, password); 
    }

    // Compile-time polymorphism (method overloading)
    public void makeAnnouncement(String content) {
        System.out.println("Admin " + getName() + " posted announcement: " + content);
    }

    public void makeAnnouncement(String content, String date) {
        System.out.println("Admin " + getName() + " posted announcement on " + date + ": " + content);
    }

    public void updateComplaint(String complaint, String newStatus) {
        System.out.println("Admin " + getName() + " updated complaint '" + complaint + "' to status: " + newStatus);
    }
}