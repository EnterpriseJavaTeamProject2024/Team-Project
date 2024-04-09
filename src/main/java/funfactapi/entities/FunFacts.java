package funfactapi.entities;


import jakarta.persistence.*;
import org.hibernate.annotations.GenericGenerator;

import java.util.HashMap;
import java.util.Map;

@Entity
public class FunFacts {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    private int ID;

    @Column(name = "FunFact")
    private String funFact;

    @Column(name = "Category")
    private String category;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getFunFact() {
        return funFact;
    }

    public void setFunFact(String funFact) {
        this.funFact = funFact;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "{" +
                "\"ID\":" + ID +
                ", \"funFact\":\"" + funFact.replace("\"", "\\\"") + "\"" +
                ", \"category\":\"" + category.replace("\"", "\\\"") + "\"" +
                '}';
    }

}
