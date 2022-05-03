package com.indramakers.notifications.notifications.controller;


import com.indramakers.notifications.notifications.model.Notification;
import com.indramakers.notifications.notifications.services.NotificationServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/notification")
public class NotificacionController {

    @Autowired
    private NotificationServices notificationServices;

    @PostMapping
    public void create(@RequestBody Notification notification){
        notificationServices.createNotification(notification);
    }

    @GetMapping
    public List<Notification> getNotificationByType(@RequestParam(name = "type") String type) {
        return notificationServices.getByType(type);
    }

}
