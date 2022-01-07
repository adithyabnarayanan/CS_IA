/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cs_ia;

/**
 *
 * @author Rony
 */
public class Entry {
    private String name;
    private String subject;
    private String rq;
    private String topic;
    private String description;
    private int priority;

    public Entry(String name, String subject, String rq, String topic, int priority, String description) {
        this.name = name;
        this.subject = subject;
        this.rq = rq;
        this.topic = topic;
        this.priority = priority;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getSubject() {
        return this.subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getRq() {
        return this.rq;
    }

    public void setRq(String rq) {
        this.rq = rq;
    }

    public String getTopic() {
        return this.topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPriority() {
        return this.priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public String getPriorityText() {
        switch (this.priority) {
            case 1:
                return "Low";
            case 2:
                return "Medium";
            case 3:
                return "High";
            default:
                return "Unknown";
        }
    }

    @Override
    public String toString() {
        return name + "," + subject + "," + topic + "," + rq + "," + priority + "," + description;
    }

}
