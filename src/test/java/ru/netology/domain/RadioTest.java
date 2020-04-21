package ru.netology.domain;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class RadioTest {

    @Test
    public void shouldCreateName() {
        Radio radioStation = new Radio();
        String expectedName = "Radio FM";
        assertNull(radioStation.getName());
        radioStation.setName(expectedName);
        assertEquals(expectedName, radioStation.getName());
        System.out.println(radioStation.getName());
    }


    @Test
    public void shouldSetMaxChanel() {
        Radio radioStation = new Radio();
        int max = 20;
        radioStation.setMaxChanel(max);
        assertEquals(max, radioStation.getMaxChanel());
    }


    @Test
    public void shouldGetMinChanel() {
        Radio radioStation = new Radio();
        int min = radioStation.getMinChanel();
        assertEquals(min, radioStation.getMinChanel());
    }

    @Test
    public void shouldGetMaxChanel() {
        Radio radioStation = new Radio();
        int max = radioStation.getMaxChanel();
        assertEquals(max, radioStation.getMaxChanel());
    }

    @Test
    public void shouldGetMinVolume() {
        Radio radioStation = new Radio();
        int min = radioStation.getMinVolume();
        assertEquals(min, radioStation.getMinVolume());
    }

    @Test
    public void shouldGetmaxVolume() {
        Radio radioStation = new Radio();
        int max = radioStation.getMaxVolume();
        assertEquals(max, radioStation.getMaxVolume());
    }

    @Test
    public void shouldChangeCurrentChanel() {
        Radio radioStation = new Radio();
        int current = 6;
        radioStation.setCurrentChanel(current);
        assertEquals(current, radioStation.getCurrentChanel());
    }

    @Test
    public void shouldChangeCurrentChanelOnUpperBounder() {
        Radio radioStation = new Radio();
        int max = radioStation.getMaxChanel();
        radioStation.setCurrentChanel(max);
        assertEquals(max, radioStation.getCurrentChanel());
    }

    @Test
    public void shouldChangeCurrentChanelOnBottomBouner() {
        Radio radioStation = new Radio();
        int min = radioStation.getMinChanel();
        radioStation.setCurrentChanel(min);
        assertEquals(min, radioStation.getCurrentChanel());
    }

    @Test
    public void shouldNotChangeCurrentChanelUpperMax() {
        Radio radioStation = new Radio();
        int max = radioStation.getMaxChanel();
        int current = radioStation.getCurrentChanel();
        radioStation.setCurrentChanel(max + 10);
        assertEquals(current, radioStation.getCurrentChanel());
    }

    @Test
    public void shouldNotChangeCurrentChanelUnderMin() {
        Radio radioStation = new Radio();
        int min = radioStation.getMinChanel();
        int current = radioStation.getCurrentChanel();
        radioStation.setCurrentChanel(min - 10);
        assertEquals(current, radioStation.getCurrentChanel());
    }

    @Test
    public void shouldChangeCurrentVolume() {
        Radio radioStation = new Radio();
        int current = 7;
        radioStation.setCurrentVolume(current);
        assertEquals(current, radioStation.getCurrentVolume());
    }

    @Test
    public void shouldChangeCurrentVolumeOnUpperBounder() {
        Radio radioStation = new Radio();
        int max = radioStation.getMaxVolume();
        radioStation.setCurrentVolume(max);
        assertEquals(max, radioStation.getCurrentVolume());
    }

    @Test
    public void shouldChangeCurrentVolumeOnBottomBounder() {
        Radio radioStation = new Radio();
        int min = radioStation.getMinVolume();
        radioStation.setCurrentVolume(min);
        assertEquals(min, radioStation.getCurrentVolume());
    }

    @Test
    public void shouldNotChangeCurrentVolumeUpperMax() {
        Radio radioStation = new Radio();
        int current = radioStation.getCurrentVolume();
        int max = radioStation.getMaxVolume();
        radioStation.setCurrentVolume(max + 10);
        assertEquals(current, radioStation.getCurrentVolume());
    }

    @Test
    public void shouldNotChangeCurrentVolumeUnderMin() {
        Radio radioStation = new Radio();
        int min = radioStation.getMinVolume();
        radioStation.setCurrentVolume(min - 10);
        assertEquals(min, radioStation.getCurrentVolume());
    }

    @Test
    public void shouldIncreaseCurrentChanelByArrow() {
        Radio radioStation = new Radio();
        int current = 6;
        radioStation.setCurrentChanel(current);
        radioStation.increaseCurrentChanelByArrow();
        assertEquals((current + 1), radioStation.getCurrentChanel());
    }

    @Test
    public void shouldDecreaseCurrentChanelByArrow() {
        Radio radioStation = new Radio();
        int current = 6;
        radioStation.setCurrentChanel(current);
        radioStation.decreaseCurrentChanelByArrow();
        assertEquals((current - 1), radioStation.getCurrentChanel());
    }

    @Test
    public void shouldReassignedCurrentChanelDown() {
        Radio radioStation = new Radio();
        int max = radioStation.getMaxChanel();
        int min = radioStation.getMinChanel();
        radioStation.setCurrentChanel(max);
        radioStation.increaseCurrentChanelByArrow();
        assertEquals(min, radioStation.getCurrentChanel());
    }

    @Test
    public void shouldReassignedCurrentChanelUp() {
        Radio radioStation = new Radio();
        int min = radioStation.getMinChanel();
        int max = radioStation.getMaxChanel();
        radioStation.setCurrentChanel(min);
        radioStation.decreaseCurrentChanelByArrow();
        assertEquals(max, radioStation.getCurrentChanel());
    }

    @Test
    public void shouldIncreaseCurrentVolumeByArrow() {
        Radio radioStation = new Radio();
        int current = 6;
        radioStation.setCurrentVolume(current);
        radioStation.increaseCurrentVolumeByArrow();
        assertEquals((current + 1), radioStation.getCurrentVolume());
    }

    @Test
    public void shouldDecreaseCurrentVolumeByArrow() {
        Radio radioStation = new Radio();
        int current = 6;
        radioStation.setCurrentVolume(current);
        radioStation.decreaseCurrentVolumeByArrow();
        assertEquals((current - 1), radioStation.getCurrentVolume());
    }

    @Test
    public void shouldNotIncreaseCurrentVolumeWhenMax() {
        Radio radioStation = new Radio();
        radioStation.setCurrentVolume(radioStation.getMaxVolume());
        radioStation.increaseCurrentVolumeByArrow();
        assertEquals(radioStation.getMaxVolume(), radioStation.getCurrentVolume());
    }

    @Test
    public void shouldNotDecreaseCurrentVolumeWhenMin() {
        Radio radioStation = new Radio();
        radioStation.setCurrentVolume(radioStation.getMinVolume());
        radioStation.decreaseCurrentVolumeByArrow();
        assertEquals(radioStation.getMinVolume(), radioStation.getCurrentVolume());

    }

}