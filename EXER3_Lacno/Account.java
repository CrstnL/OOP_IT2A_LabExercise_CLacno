
class Account {
    private String username;
    private String password;

    public Account(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }
    

    public boolean login(String username, String password) {
        return this.username.equals(username) && this.password.equals(password);
    }

    public void setPassword(String oldPassword, String newPassword) {
        if (this.password.equals(oldPassword)) {
            this.password = newPassword;
            System.out.println("Password changed successfully!");
        } else {
            System.out.println("Old password is incorrect!");
        }
    }
}
