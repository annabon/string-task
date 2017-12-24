//package com.annabon.controller;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.RestController;
//
//    @RequestMapping(method = RequestMethod.GET, value = "/orders")
//    public List<Order> findAllOrders(){
//        return orderRepository.findAll();
//    }
//
//    @Autowired
//    public OrderController(OrderRepository orderRepository) {
//        this.orderRepository = orderRepository;
//    }
//
//    @RequestMapping(method = RequestMethod.POST)
//    public void addOrder(@RequestBody AddOrderRequest addOrderRequest){
////        orderRepository.save(new Order().withDeadiine(addOrderRequest.getDeadline())
////                                        .withDepartmentId(addOrderRequest.getDepartmentId())
////                                        .withEmployeeId(addOrderRequest.getEmployeeId())
////                                        .withItemId(addOrderRequest.getItemId())
////        );
//    }
