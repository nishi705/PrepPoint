package com.contact.contact_service.service;

import com.contact.contact_service.entity.Contact;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ContactServiceImpl implements ContactService{


    List<Contact> list = List.of(
new Contact(1L,"saurav@gmail.com","Saurav",1L),
            new Contact(2L,"suman@gmail.com","Suman",1L),
            new Contact(3L,"nishi@gmail.com","Nishi",2L),
            new Contact(4L,"chotii@gmail.com","Choti",2L)
    );

    @Override
    public List<Contact> getContactsOfUser(Long userId) {
        //return list .stream().filter(contact ->  Objects.equals(user.getUserId(), id)).findAny().orElse(null);
        return list.stream().filter(contact -> contact.getUserId().equals(userId)).collect(Collectors.toList());
                //(collectors.toList());

    }
}
