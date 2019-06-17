package me.hw0k.shoppingmall.services.implementations;

import me.hw0k.shoppingmall.services.TestService;
import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl implements TestService {

    @Override
    public String greeting() {
        return "Hello world!";
    }

}
