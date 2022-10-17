package pro.sky.java.course2.filippovaT.homework21;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.List;

@org.springframework.stereotype.Service
@SessionScope
public class ServiceImpl implements Service {
    private final List <Integer> basket;

    public ServiceImpl() {
        this.basket = new ArrayList<>();
    }

    @Override
    public void add(List<Integer> IDs) {
        basket.addAll (IDs);
    };



    @Override
    public List<Integer> get() {
        return basket;
    }
}