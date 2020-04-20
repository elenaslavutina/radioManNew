package ru.netology.domain;

public class Radio {
    private String name;
    private int maxChanel = 9;
    private int minChanel = 0;
    private int currentChanel;
    private int maxVolume = 10;
    private int minVolume = 0;
    private int currentVolume;
    private boolean on;


    public int getMaxVolume() {
        return maxVolume;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxChanel() {
        return maxChanel;
    }

    public int getMinChanel() {
        return minChanel;
    }

    public int getCurrentChanel() {
        return currentChanel;
    }

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

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }
}
