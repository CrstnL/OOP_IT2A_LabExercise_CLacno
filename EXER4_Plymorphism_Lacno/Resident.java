// Child Class: Resident
class Resident extends User {
    public Resident(String name, String username, String password) {
        super(name, username, password); 
    }

    public void register() {
        System.out.println(getName() + " has been registered as a resident.");
    }

    // Compile-time polymorphism (method overloading)
    public String submitComplaint(String description) {
        System.out.println(getName() + " submitted a complaint: " + description);
        return description;
    }

    public String submitComplaint(String description, String category) {
        System.out.println(getName() + " submitted a " + category + " complaint: " + description);
        return description;
    }

    public void reactToAnnouncement(String announcement, String reaction) {
        System.out.println(getName() + " reacted to announcement '" + announcement + "': " + reaction);
    }
}

