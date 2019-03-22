package person;

import person.consciousness.Knowledge;

public class Student {

    private String name;
    private Knowledge knowledgeLevel;

    public Student(String name, Knowledge knowledgeLevel) {
        this.name = name;
        this.knowledgeLevel = knowledgeLevel;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setKnowledgeLevel(Knowledge knowledgeLevel) {
        this.knowledgeLevel = knowledgeLevel;
    }

    public Knowledge getKnowledgeLevel() {
        return knowledgeLevel;
    }
}
