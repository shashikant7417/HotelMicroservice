package com.ms.hotel.HotelService.repository;

import com.ms.hotel.HotelService.entities.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HotelRepo extends JpaRepository<Hotel, String > {
}
