package com.indramakers.notifications.notifications.services;

import com.indramakers.notifications.notifications.model.Notification;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.indramakers.notifications.notifications.repository.INotificationRepository;

import java.util.List;

@Service
public class NotificationServices {

    @Autowired
    private INotificationRepository devicesRepository;

    public void createNotification(Notification notification){

        List<Notification> devicesByState = devicesRepository.findByState(notification.getState());
        if (!devicesByState.isEmpty()){
            throw new RuntimeException("Notification with that name already exists");
        }

        devicesRepository.save(notification);
    }

    public List<Notification> getByType(String type) {
        return devicesRepository.findByType(type);
    }

}
