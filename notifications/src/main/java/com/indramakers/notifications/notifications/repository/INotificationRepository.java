package com.indramakers.notifications.notifications.repository;

import com.indramakers.notifications.notifications.model.Notification;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface INotificationRepository extends CrudRepository<Notification, Long> {
    List<Notification> findByState (String state);

    List<Notification> findByType(String type);

    List<Notification> findByBody(String body);

    List<Notification> findByDate(Date date);

}
