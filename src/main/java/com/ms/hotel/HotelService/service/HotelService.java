package com.ms.hotel.HotelService.service;

import com.ms.hotel.HotelService.entities.Hotel;
import com.ms.hotel.HotelService.repository.HotelRepo;
import org.hibernate.type.descriptor.converter.spi.JpaAttributeConverter;

import java.util.List;

public interface HotelService {

    // create Hotel

    Hotel createHotel(Hotel hotel);

    // getAllHotel
    List<Hotel> getAllHotel();

    // getSingleHotel
    Hotel getHotelById(String hotelId);
}
