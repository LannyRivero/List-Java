package dev.lanny.lisjava;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class WeekDaysHandlerTest {

    private WeekDaysHandler weekDayHandler;
    @BeforeEach
    void setUp(){
        weekDayHandler = new WeekDaysHandler();
        weekDayHandler.createList();
    }

     @Test
    @DisplayName("Debe crear una lista con 7 dias")
    void testCreateList() {
      assertEquals(7, weekDayHandler.getSizeList());      
    }
    @Test
    @DisplayName("Debe retornar correctamente todos los días de la semana")
    void testGetDays() {
        assertEquals(7, weekDayHandler.getDays().size());
        assertTrue(weekDayHandler.getDays().contains("Lunes"));
    }
    @Test
    @DisplayName("Debe retornar el tamaño correcto de la lista de días")
    void testGetSizeList() {
        assertEquals(7, weekDayHandler.getSizeList());
    }
    @Test
    @DisplayName("Debe eliminar correctamente un día de la semana")
    void testDeleteDay() {
        weekDayHandler.deleteDay("Lunes");
        assertEquals(6, weekDayHandler.getSizeList());
        assertFalse(weekDayHandler.getDays().contains("Lunes"));
    }
    @Test
    @DisplayName("Debe retornar correctamente un día específico por su nombre")
    void testGetSpecificDayByName() {
        assertEquals("Lunes", weekDayHandler.getSpecificDay("Lunes"));
        assertNull(weekDayHandler.getSpecificDay("NoExiste"));
    }
   
    @Test
    @DisplayName("Debe verificar si un día existe en la lista")
    void testDayExists() {
        assertTrue(weekDayHandler.dayExists("Martes"));
        assertFalse(weekDayHandler.dayExists("InvalidDay"));
    }
    @Test
    @DisplayName("Debe ordenar correctamente la lista de días en orden alfabético")
    void testSortAlphabetically() {
        weekDayHandler.sortAlphabetically();
        assertEquals("Domingo", weekDayHandler.getDays().get(0));
        assertEquals("Viernes", weekDayHandler.getDays().get(6));
    }
    @Test
    @DisplayName("Debe vaciar correctamente la lista de días")
    void testEmptyList() {
        weekDayHandler.emptyList();
        assertEquals(0, weekDayHandler.getSizeList());
    }

}
