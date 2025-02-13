package dev.lanny.lisjava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class WeekDaysHandler {

    private List<String> days;
    public WeekDaysHandler() {
        this.days = new ArrayList<>();
    }
    public void createList() {
        days.clear();
        days.add("Lunes");
        days.add("Martes");
        days.add("Miercoles");
        days.add("Jueves");
        days.add("Viernes");
        days.add("Sabado");
        days.add("Domingo");
    }

    public List<String> getDays() {
        return new ArrayList<>(days);
    }

    public Integer getSizeList() {
        return days.size();
    }

    public void deleteDay(String day) {
        days.remove(day);
    }

    public String getSpecificDay(String day) {
        return days.contains(day) ? day : null;
    }

    public Boolean dayExists(String day) {
        return days.contains(day);
    }

    public void sortAlphabetically() {
        Collections.sort(days);
    }

    public void emptyList() {
        days.clear();
    }


}
