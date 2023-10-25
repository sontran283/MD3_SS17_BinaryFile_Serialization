package Th1;

import java.io.Serializable;
import java.util.List;

public class Employee implements Serializable {
    private int id;
    private String name;
    private boolean status;

    List<Skill> skill;

    public Employee() {
    }

    public Employee(int id, String name, boolean status, List<Skill> skill) {
        this.id = id;
        this.name = name;
        this.status = status;
        this.skill = skill;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public List<Skill> getSkill() {
        return skill;
    }

    public void setSkill(List<Skill> skill) {
        this.skill = skill;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", status=" + status +
                ", skill=" + skill +
                '}';
    }
}
