package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class MobileOrderService implements OrderService  {

    public boolean order(final User user,final LocalDateTime ordTime){
        System.out.println("Order"+ user.getName()+ " "+user.getLastName()+" date: "+ ordTime.toString());
            return true;
        }

    }

