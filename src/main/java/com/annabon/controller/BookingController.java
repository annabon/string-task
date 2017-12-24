package com.annabon.controller;

import com.annabon.entity.Booking;
import com.annabon.entity.request.AddBookingRequest;
import com.annabon.repository.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping(value = "/bookings")
public class BookingController {

    private BookingRepository bookingRepository;


    @Autowired
    public BookingController(BookingRepository bookingRepository) {
        this.bookingRepository = bookingRepository;
    }


    @RequestMapping(method = RequestMethod.GET, value = "/all")
    public List<Booking> findAllBookings(){
        return bookingRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.POST, value = "/add")
    public void addBooking(@RequestBody AddBookingRequest addBookingRequest){
        bookingRepository.save(new Booking().withDeadline(addBookingRequest.getDeadline())
                                            .withDepertmentId(addBookingRequest.getDepartmentID())
                                            .withEmployeeId(addBookingRequest.getEmployeeId())
                                            .withItemId(addBookingRequest.getItemId()));
    }

    @RequestMapping(method = RequestMethod.GET, value = "{id}")
    public Booking getBookind(@PathVariable long id){
        return bookingRepository.getOne(id);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "{id}")
    public void deleteBooking(@PathVariable long id){
        bookingRepository.delete(id);
    }
}
