package ru.netology.domain;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RadioTest {
   private Radio radioStation = new Radio();

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
        radioStation.setChannel(current);
        assertEquals(current, radioStation.getCurrentChannel());
    }

    @Test
    public void shouldChangeCurrentChannelOnUpperBounder() {
        int max = radioStation.getMaxChannel();
        radioStation.setChannel(max);
        assertEquals(max, radioStation.getCurrentChannel());
    }

    @Test
    public void shouldChangeCurrentChannelOnBottomBouner() {
        int min = radioStation.getMinChannel();
        radioStation.setChannel(min);
        assertEquals(min, radioStation.getCurrentChannel());
    }

    @Test
    public void shouldNotChangeCurrentChannelUpperMax() {
        int max = radioStation.getMaxChannel();
        int current = radioStation.getCurrentChannel();
        radioStation.setChannel((max + 10));
        assertEquals(current, radioStation.getCurrentChannel());
    }

    @Test
    public void shouldNotChangeCurrentChannelUnderMin() {
        int min = radioStation.getMinChannel();
        int current = radioStation.getCurrentChannel();
        radioStation.setChannel((min - 10));
        assertEquals(current, radioStation.getCurrentChannel());
    }

    @Test
    public void shouldChangeCurrentVolume() {
        int current = 7;
        radioStation.setVolume(current);
        assertEquals(current, radioStation.getCurrentVolume());
    }

    @Test
    public void shouldChangeCurrentVolumeOnUpperBounder() {
        int max = radioStation.getMaxVolume();
        radioStation.setVolume(max);
        assertEquals(max, radioStation.getCurrentVolume());
    }

    @Test
    public void shouldChangeCurrentVolumeOnBottomBounder() {
        int min = radioStation.getMinVolume();
        radioStation.setVolume(min);
        assertEquals(min, radioStation.getCurrentVolume());
    }

    @Test
    public void shouldNotChangeCurrentVolumeUpperMax() {
        int current = radioStation.getCurrentVolume();
        int max = radioStation.getMaxVolume();
        radioStation.setVolume((max + 10));
        assertEquals(current, radioStation.getCurrentVolume());
    }

    @Test
    public void shouldNotChangeCurrentVolumeUnderMin() {
        int min = radioStation.getMinVolume();
        radioStation.setVolume((min - 10));
        assertEquals(min, radioStation.getCurrentVolume());
    }

    @Test
    public void shouldChangeChannelToNext() {
        int current = 6;
        radioStation.setChannel(current);
        radioStation.nextChannel();
        assertEquals((current + 1), radioStation.getCurrentChannel());
    }

    @Test
    public void shouldChangeChannelToPrevious() {
        int current = 6;
        radioStation.setChannel(current);
        radioStation.previousChannel();
        assertEquals((current - 1), radioStation.getCurrentChannel());
    }

    @Test
    public void shouldReassignedCurrentChannelDown() {
        int max = radioStation.getMaxChannel();
        int min = radioStation.getMinChannel();
        radioStation.setChannel(max);
        radioStation.nextChannel();
        assertEquals(min, radioStation.getCurrentChannel());
    }

    @Test
    public void shouldReassignedCurrentChannelUp() {
        int min = radioStation.getMinChannel();
        int max = radioStation.getMaxChannel();
        radioStation.setChannel(min);
        radioStation.previousChannel();
        assertEquals(max, radioStation.getCurrentChannel());
    }

    @Test
    public void shouldChangeVolumeToNext() {
        int current = 6;
        radioStation.setVolume(current);
        radioStation.nextVolume();
        assertEquals((current + 1), radioStation.getCurrentVolume());
    }

    @Test
    public void shouldChangeVolumeToPrevious() {
        int current = 6;
        radioStation.setVolume(current);
        radioStation.previousVolume();
        assertEquals((current - 1), radioStation.getCurrentVolume());
    }

    @Test
    public void shouldNotIncreaseCurrentVolumeWhenMax() {
        radioStation.setVolume(radioStation.getMaxVolume());
        radioStation.nextVolume();
        assertEquals(radioStation.getMaxVolume(), radioStation.getCurrentVolume());
    }

    @Test
    public void shouldNotDecreaseCurrentVolumeWhenMin() {
        radioStation.setVolume(radioStation.getMinVolume());
        radioStation.previousVolume();
        assertEquals(radioStation.getMinVolume(), radioStation.getCurrentVolume());

    }

}