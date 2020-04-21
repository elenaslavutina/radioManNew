package ru.netology.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Radio {
    private String name;
    private int maxChanel = 9;
    private int minChanel = 0;
    private int currentChanel;
    private int maxVolume = 100;
    private int minVolume = 0;
    private int currentVolume;
    private boolean on;


    public void setCurrentChanel(int currentChanel) {
        if (currentChanel < minChanel)
            return;
        if (currentChanel > maxChanel)
            return;
        this.currentChanel = currentChanel;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < minVolume)
            return;
        if (currentVolume > maxVolume)
            return;
        this.currentVolume = currentVolume;
    }

    public void increaseCurrentChanelByArrow() {
        int current = currentChanel;
        if (current == maxChanel) {
            this.currentChanel = minChanel;
        } else
            this.currentChanel = current + 1;
    }

    public void decreaseCurrentChanelByArrow() {
        int current = currentChanel;
        if (current == minChanel) {
            this.currentChanel = maxChanel;
        } else
            this.currentChanel = current - 1;
    }

    public void increaseCurrentVolumeByArrow() {
        int volume = currentVolume;
        if (volume == maxVolume)
            return;
        this.currentVolume = volume + 1;
    }

    public void decreaseCurrentVolumeByArrow() {
        int volume = currentVolume;
        if (volume == minVolume)
            return;
        this.currentVolume = volume - 1;
    }


    }
