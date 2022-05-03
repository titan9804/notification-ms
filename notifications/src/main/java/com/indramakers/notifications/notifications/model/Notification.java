package com.indramakers.notifications.notifications.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "tb_notifications")
public class Notification implements Serializable {
    @Id
    @Column(name= "id_notification")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "date_notification")
    private Date date;

    @Column(name = "body_notification")
    private String body;

    @Column(name = "type_notification")
    private String type;

    @Column(name = "state_notification")
    private String state;

    public Notification(){
    }

    public Notification(Long id, String body, String type, String state) {
        this.id = id;
        //this.date = date;
        this.body = body;
        this.type = type;
        this.state = state;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}


