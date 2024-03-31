package funfactapi.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Admin {

    @Id
    private int ID;

    @Column(name = "AdminKey")
    private String adminKey;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getAdminKey() {
        return adminKey;
    }

    public void setAdminKey(String adminKey) {
        this.adminKey = adminKey;
    }

    @Override
    public String toString() {
        return "Admin{" +
                "ID=" + ID +
                ", adminKey='" + adminKey + '\'' +
                '}';
    }
}
