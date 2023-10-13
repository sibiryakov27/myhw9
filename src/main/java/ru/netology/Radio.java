package ru.netology;

public class Radio {

    private int radioStationNumber;
    private int currentVolume;
    private int numberOfStations = 10;

    public Radio() {
    }

    public Radio(int numberOfStations) {
        this.numberOfStations = numberOfStations;
    }

    public void next() {
        radioStationNumber++;
        if (radioStationNumber > numberOfStations - 1) {
            radioStationNumber = 0;
        }
    }

    public void prev() {
        radioStationNumber--;
        if (radioStationNumber < 0) {
            radioStationNumber = numberOfStations - 1;
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
        if (radioStationNumber >= 0 && radioStationNumber <= numberOfStations - 1) {
            this.radioStationNumber = radioStationNumber;
        }
    }

    public void setCurrentVolume(int volume) {
        if (volume >= 0 && volume <= 100) {
            this.currentVolume = volume;
        }
    }
}
