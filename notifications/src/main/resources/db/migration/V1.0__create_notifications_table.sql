create table tb_notifications (
    id_notification serial primary key,
    date_notification timestamp,
    body_notification varchar(255) NOT NULL,
    type_notification varchar(40) NOT NULL,
    state_notification varchar (15) NOT NULL
)