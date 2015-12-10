package ru.spring.controllers.dao.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import ru.spring.controllers.model.HomeData;

@Component
public class HomeService {
    
    public List<HomeData> generateData() {
        List<HomeData> hDataList = new ArrayList<>();
        hDataList.add(new HomeData("Denis", 33, "Moscow", "Himki"));
        hDataList.add(new HomeData("Kolya", 12, "Vladivostok", "Gogolya"));
        hDataList.add(new HomeData("Sveta", 32, "Ufa", "Sochnogo"));
        return hDataList;
    }
}
