package web.service;

import java.util.List;

public class TestServiceImpl {
    private List<String> list;

    public List<String> getList() {
        return list;
    }

    public void initList() {
        list.add("один");
        list.add("два");
        list.add("три");
        list.add("четыре");
        list.add("пять");
        list.add("шесть");
        list.add("семь");
        list.add("восемь");
        list.add("девять");
    }
}
