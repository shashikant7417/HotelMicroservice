package com.ms.hotel.HotelService.impl;

import com.ms.hotel.HotelService.entities.Hotel;
import com.ms.hotel.HotelService.exception.ResourceNotFoundException;
import com.ms.hotel.HotelService.repository.HotelRepo;
import com.ms.hotel.HotelService.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class HotelServiceImpl implements HotelService {

    @Autowired
    private HotelRepo hotelRepo;

    @Override
    public Hotel createHotel(Hotel hotel) {
        String random = UUID.randomUUID().toString();
        hotel.setHotelId(random);
        return  hotelRepo.save(hotel);

    }

    @Override
    public List<Hotel> getAllHotel() {
        return hotelRepo.findAll();
    }

    @Override
    public Hotel getHotelById(String hotelId) {
        Hotel hotel = hotelRepo.findById(hotelId).orElseThrow(() -> new ResourceNotFoundException("Hotel with given id not found" + hotelId));
        return hotel;
    }
}
