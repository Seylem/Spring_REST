package web.service;

import java.util.List;

public class TestServiceImpl {
    private List<String> list;

    public List<String> getList() {
        return list;
    }

    public void initList() {
        list.add("Один");
        list.add("Два");
        list.add("Три");
        list.add("Четыре");
        list.add("Пять");
        list.add("Шесть");
        list.add("Семь");
        list.add("Восемь");
        list.add("Девять");
        list.add("Десять");
        list.add("Одиннадцать");
        list.add("Двенадцать");
        list.add("Тринадцать");
    }
}
