package ru.netology.domain;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RadioTest {
    Radio radioStation = new Radio();

    @Test
    public void shouldCreateName() {
        String expectedName = "Radio FM";
        assertNull(radioStation.getName());
        radioStation.setName(expectedName);
        assertEquals(expectedName, radioStation.getName());
    }

    @Test
    public void shouldChangeCurrentChannel() {
        int current = 6;
        radioStation.newChannel(current);
        assertEquals(current, radioStation.getCurrentChannel());
    }

    @Test
    public void shouldChangeCurrentChannelOnUpperBounder() {
        int max = radioStation.getMaxChannel();
        radioStation.newChannel(max);
        assertEquals(max, radioStation.getCurrentChannel());
    }

    @Test
    public void shouldChangeCurrentChannelOnBottomBouner() {
        int min = radioStation.getMinChannel();
        radioStation.newChannel(min);
        assertEquals(min, radioStation.getCurrentChannel());
    }

    @Test
    public void shouldNotChangeCurrentChannelUpperMax() {
        int max = radioStation.getMaxChannel();
        int current = radioStation.getCurrentChannel();
        radioStation.newChannel((max + 10));
        assertEquals(current, radioStation.getCurrentChannel());
    }

    @Test
    public void shouldNotChangeCurrentChannelUnderMin() {
        int min = radioStation.getMinChannel();
        int current = radioStation.getCurrentChannel();
        radioStation.newChannel((min - 10));
        assertEquals(current, radioStation.getCurrentChannel());
    }

    @Test
    public void shouldChangeCurrentVolume() {
        int current = 7;
        radioStation.newVolume(current);
        assertEquals(current, radioStation.getCurrentVolume());
    }

    @Test
    public void shouldChangeCurrentVolumeOnUpperBounder() {
        int max = radioStation.getMaxVolume();
        radioStation.newVolume(max);
        assertEquals(max, radioStation.getCurrentVolume());
    }

    @Test
    public void shouldChangeCurrentVolumeOnBottomBounder() {
        int min = radioStation.getMinVolume();
        radioStation.newVolume(min);
        assertEquals(min, radioStation.getCurrentVolume());
    }

    @Test
    public void shouldNotChangeCurrentVolumeUpperMax() {
        int current = radioStation.getCurrentVolume();
        int max = radioStation.getMaxVolume();
        radioStation.newVolume((max + 10));
        assertEquals(current, radioStation.getCurrentVolume());
    }

    @Test
    public void shouldNotChangeCurrentVolumeUnderMin() {
        int min = radioStation.getMinVolume();
        radioStation.newVolume((min - 10));
        assertEquals(min, radioStation.getCurrentVolume());
    }

    @Test
    public void shouldChangeChannelToNext() {
        int current = 6;
        radioStation.newChannel(current);
        radioStation.nextChannel();
        assertEquals((current + 1), radioStation.getCurrentChannel());
    }

    @Test
    public void shouldChangeChannelToPrevious() {
        int current = 6;
        radioStation.newChannel(current);
        radioStation.previousChannel();
        assertEquals((current - 1), radioStation.getCurrentChannel());
    }

    @Test
    public void shouldReassignedCurrentChannelDown() {
        int max = radioStation.getMaxChannel();
        int min = radioStation.getMinChannel();
        radioStation.newChannel(max);
        radioStation.nextChannel();
        assertEquals(min, radioStation.getCurrentChannel());
    }

    @Test
    public void shouldReassignedCurrentChannelUp() {
        int min = radioStation.getMinChannel();
        int max = radioStation.getMaxChannel();
        radioStation.newChannel(min);
        radioStation.previousChannel();
        assertEquals(max, radioStation.getCurrentChannel());
    }

    @Test
    public void shouldChangeVolumeToNext() {
        int current = 6;
        radioStation.newVolume(current);
        radioStation.nextVolume();
        assertEquals((current + 1), radioStation.getCurrentVolume());
    }

    @Test
    public void shouldChangeVolumeToPrevious() {
        int current = 6;
        radioStation.newVolume(current);
        radioStation.previousVolume();
        assertEquals((current - 1), radioStation.getCurrentVolume());
    }

    @Test
    public void shouldNotIncreaseCurrentVolumeWhenMax() {
        radioStation.newVolume(radioStation.getMaxVolume());
        radioStation.nextVolume();
        assertEquals(radioStation.getMaxVolume(), radioStation.getCurrentVolume());
    }

    @Test
    public void shouldNotDecreaseCurrentVolumeWhenMin() {
        radioStation.newVolume(radioStation.getMinVolume());
        radioStation.previousVolume();
        assertEquals(radioStation.getMinVolume(), radioStation.getCurrentVolume());

    }

}