class Resident extends User {
    public Resident(String name, String username, String password) {
        super(name, username, password);
    }

    @Override
    public void showHome() {
        System.out.println("Welcome Resident " + getName() + "! You can register, submit complaints, and react to announcements.");
    }

    public void register() {
        System.out.println(getName() + " has been registered as a resident.");
    }

    public String submitComplaint(String description) {
        System.out.println(getName() + " submitted a complaint: " + description);
        return description; // return so Admin can update it
    }

    public void reactToAnnouncement(String announcement, String reaction) {
        System.out.println(getName() + " reacted to announcement '" + announcement + "': " + reaction);
    }
}