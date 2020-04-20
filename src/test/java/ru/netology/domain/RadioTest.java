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
        assertEquals(expectedName,radioStation.getName());
        System.out.println(radioStation.getName());
    }

    @Test
    public void shouldGetMinChanel() {
        Radio radioStation = new Radio();
        int min = radioStation.getMinChanel();
        assertEquals(min,radioStation.getMinChanel());
    }

    @Test
    public void shouldGetMaxChanel() {
        Radio radioStation = new Radio();
        int max = radioStation.getMaxChanel();
        assertEquals(max,radioStation.getMaxChanel());
    }

    @Test
    public void shouldGetMinVolume() {
        Radio radioStation = new Radio();
        int min = radioStation.getMinVolume();
        assertEquals(min,radioStation.getMinVolume());
    }

    @Test
    public void shouldGetmaxVolume() {
        Radio radioStation = new Radio();
        int max = radioStation.getMaxVolume();
        assertEquals(max,radioStation.getMaxVolume());
    }

    @Test
    public void shouldChangeCurrentChanel() {
        Radio radioStation = new Radio();
        radioStation.setCurrentChanel(6);
        assertEquals(6, radioStation.getCurrentChanel());
    }

    @Test
    public void shouldChangeCurrentChanelOnUpperBounder() {
        Radio radioStation = new Radio();
        radioStation.setCurrentChanel(9);
        assertEquals(9, radioStation.getCurrentChanel());
    }

    @Test
    public void shouldChangeCurrentChanelOnBottomBouner() {
        Radio radioStation = new Radio();
        radioStation.setCurrentChanel(0);
        assertEquals(0, radioStation.getCurrentChanel());
    }

    @Test
    public void shouldNotChangeCurrentChanelUpperMax() {
        Radio radioStation = new Radio();
        radioStation.setCurrentChanel(100);
        assertEquals(0, radioStation.getCurrentChanel());
    }

    @Test
    public void shouldNotChangeCurrentChanelUnderMin() {
        Radio radioStation = new Radio();
        radioStation.setCurrentChanel(-100);
        assertEquals(0, radioStation.getCurrentChanel());
    }

    @Test
    public void shouldChangeCurrentVolume() {
        Radio radioStation = new Radio();
        radioStation.setCurrentVolume(7);
        assertEquals(7, radioStation.getCurrentVolume());
    }

    @Test
    public void shouldChangeCurrentVolumeOnUpperBounder() {
        Radio radioStation = new Radio();
        radioStation.setCurrentVolume(10);
        assertEquals(10, radioStation.getCurrentVolume());
    }

    @Test
    public void shouldChangeCurrentVolumeOnBottomBounder() {
        Radio radioStation = new Radio();
        radioStation.setCurrentVolume(0);
        assertEquals(0, radioStation.getCurrentVolume());
    }

    @Test
    public void shouldNotChangeCurrentVolumeUpperMax() {
        Radio radioStation = new Radio();
        radioStation.setCurrentVolume(100);
        assertEquals(0, radioStation.getCurrentVolume());
    }

    @Test
    public void shouldNotChangeCurrentVolumeUnderMin() {
        Radio radioStation = new Radio();
        radioStation.setCurrentVolume(-100);
        assertEquals(0, radioStation.getCurrentVolume());
    }

    @Test
    public void shouldIncreaseCurrentChanelByArrow() {
        Radio radioStation = new Radio();
        radioStation.setCurrentChanel(6);
        radioStation.increaseCurrentChanelByArrow();
        assertEquals(7, radioStation.getCurrentChanel());
    }

    @Test
    public void shouldDecreaseCurrentChanelByArrow() {
        Radio radioStation = new Radio();
        radioStation.setCurrentChanel(6);
        radioStation.decreaseCurrentChanelByArrow();
        assertEquals(5, radioStation.getCurrentChanel());
    }

    @Test
    public void shouldReassignedCurrentChanelDown() {
        Radio radioStation = new Radio();
        radioStation.setCurrentChanel(9);
        radioStation.increaseCurrentChanelByArrow();
        assertEquals(0, radioStation.getCurrentChanel());
    }

    @Test
    public void shouldReassignedCurrentChanelUp() {
        Radio radioStation = new Radio();
        radioStation.setCurrentChanel(0);
        radioStation.decreaseCurrentChanelByArrow();
        assertEquals(9, radioStation.getCurrentChanel());
    }

    @Test
    public void shouldIncreaseCurrentVolumeByArrow() {
        Radio radioStation = new Radio();
        radioStation.setCurrentVolume(6);
        radioStation.increaseCurrentVolumeByArrow();
        assertEquals(7, radioStation.getCurrentVolume());
    }

    @Test
    public void shouldDecreaseCurrentVolumeByArrow() {
        Radio radioStation = new Radio();
        radioStation.setCurrentVolume(6);
        radioStation.decreaseCurrentVolumeByArrow();
        assertEquals(5, radioStation.getCurrentVolume());
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