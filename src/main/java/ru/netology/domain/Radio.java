package ru.netology.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Radio {
    private String name;
    private int maxChannel = 9;
    private int minChannel = 0;
    private int currentChannel;
    private int maxVolume = 100;
    private int minVolume = 0;
    private int currentVolume;
    private boolean on;

    public void setChannel(int newChannel) {
        if ((newChannel < minChannel) | (newChannel > maxChannel))
            return;
        currentChannel = newChannel;
    }

    public void  setVolume(int newVolume) {
        if ((newVolume < minVolume) | (newVolume > maxVolume))
            return;
        currentVolume = newVolume;
    }

    public void nextChannel() {
        if (currentChannel == maxChannel)
            currentChannel = minChannel;
        else
            ++ currentChannel;
    }

    public void previousChannel() {
        if (currentChannel == minChannel)
            currentChannel = maxChannel;
        else
           -- currentChannel;
    }

    public void nextVolume() {
        if (currentVolume == maxVolume)
            return;
        ++ currentVolume;
    }

    public void previousVolume() {
        if (currentVolume == minVolume)
            return;
        -- currentVolume;
    }

}
