package com.shubham.lil.sbet.bootingweb.service;

import java.util.List;

import com.shubham.lil.sbet.bootingweb.data.RoomRepository;
import com.shubham.lil.sbet.bootingweb.models.Room;
import org.springframework.stereotype.Service;

@Service
public class RoomService {

    private final RoomRepository roomRepository;

    public RoomService(RoomRepository roomRepository) {
        this.roomRepository = roomRepository;
    }

    public List<Room> getAllRooms(){
        return roomRepository.findAll();
    }

    public Room getById(long id) {
        return roomRepository.findById(id).get();
    }

}