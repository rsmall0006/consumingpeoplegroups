package hello;

/**
 * Created by Merlin on 3/29/17.
 */
public class User {
    String address;
    String email;
    String groups;
    String username;
    int id;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGroups() {
        return groups;
    }

    public void setGroups(String groups) {
        this.groups = groups;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "User{" +
                "address='" + address + '\'' +
                "email='" + email + '\'' +
                "groups='" + groups + '\'' +
                "username='" + username + '\'' +
                ", id=" + id +
                '}';
    }
}
