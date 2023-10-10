package ru.netology;

public class Radio {

    private int radioStationNumber;
    private int currentVolume;

    public void next() {
        radioStationNumber++;
        if (radioStationNumber > 9) {
            radioStationNumber = 0;
        }
    }

    public void prev() {
        radioStationNumber--;
        if (radioStationNumber < 0) {
            radioStationNumber = 9;
        }
    }

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume++;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume--;
        }
    }

    public int getRadioStationNumber() {
        return radioStationNumber;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setRadioStationNumber(int radioStationNumber) {
        if (radioStationNumber >= 0 && radioStationNumber <= 9) {
            this.radioStationNumber = radioStationNumber;
        }
    }

    public void setCurrentVolume(int volume) {
        if (volume >= 0 && volume <= 100) {
            this.currentVolume = volume;
        }
    }
}
