public class User {
    private String name;
    private String username;
    private String password;

    public User(String name, String username, String password) {
        this.name = name;
        this.username = username;
        this.password = password;
    }

    public void login() {
        System.out.println(name + " logged in successfully!");
    }

    public void showHome() {
        System.out.println("Welcome " + name + "! This is the default home page.");
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}