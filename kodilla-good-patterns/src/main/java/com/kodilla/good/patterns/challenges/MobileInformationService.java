package com.kodilla.good.patterns.challenges;

public class MobileInformationService implements InformationService {

    @Override
    public void inform (final User user){
        System.out.println("Product order"+ user.getName());
    }

    @Override
    public void informByEmail(User user) {
        System.out.println("Product order"+ user.getName());
    }
}
