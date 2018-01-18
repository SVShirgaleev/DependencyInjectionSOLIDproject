package com.sshirgaleev.didemo.services;


import org.springframework.stereotype.Service;

@Service
public class GetterGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello!  (it was injected by the getter)";
    }
}
