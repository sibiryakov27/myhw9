package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    private Radio radio = new Radio();
    private Radio customRadio = new Radio(33);

    @Test
    void shouldSwitchFromZeroToDefaultMax() {
        radio.setRadioStationNumber(0);
        radio.prev();

        int expected = 9;
        int actual = radio.getRadioStationNumber();

        assertEquals(expected, actual);
    }

    @Test
    void shouldSwitchFromDefaultMaxToZero() {
        radio.setRadioStationNumber(9);
        radio.next();

        int expected = 0;
        int actual = radio.getRadioStationNumber();

        assertEquals(expected, actual);
    }

    @Test
    void shouldSwitchFromCustomMaxToZero() {
        customRadio.setRadioStationNumber(32);
        customRadio.next();

        int expected = 0;
        int actual = customRadio.getRadioStationNumber();

        assertEquals(expected, actual);
    }

    @Test
    void shouldSwitchFromZeroToCustomMax() {
        customRadio.setRadioStationNumber(0);
        customRadio.prev();

        int expected = 32;
        int actual = customRadio.getRadioStationNumber();

        assertEquals(expected, actual);
    }

    @Test
    void shouldIncreaseStationNumber() {
        radio.setRadioStationNumber(5);
        radio.next();

        int expected = 6;
        int actual = radio.getRadioStationNumber();

        assertEquals(expected, actual);
    }

    @Test
    void shouldDecreaseStationNumber() {
        radio.setRadioStationNumber(5);
        radio.prev();

        int expected = 4;
        int actual = radio.getRadioStationNumber();

        assertEquals(expected, actual);
    }

    @Test
    void shouldIncreaseCurrentVolume() {
        radio.setCurrentVolume(50);
        radio.increaseVolume();

        int expected = 51;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    void shouldDecreaseCurrentVolume() {
        radio.setCurrentVolume(50);
        radio.decreaseVolume();

        int expected = 49;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    void shouldStayVolumeOnMaxLevel() {
        radio.setCurrentVolume(100);
        radio.increaseVolume();

        int expected = 100;
        int actual = radio.getCurrentVolume();;

        assertEquals(expected, actual);
    }

    @Test
    void shouldStayVolumeOnMinLevel() {
        radio.setCurrentVolume(0);
        radio.decreaseVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    void shouldNotSetVolumeOnUnacceptableLevel() {
        radio.setCurrentVolume(50);
        int expected = radio.getCurrentVolume();
        radio.setCurrentVolume(1000);
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);

        radio.setCurrentVolume(-1000);
        actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    void shouldNotSetStationOnUnacceptableNumber() {
        radio.setRadioStationNumber(5);
        int expected = radio.getRadioStationNumber();
        radio.setRadioStationNumber(1000);
        int actual = radio.getRadioStationNumber();

        assertEquals(expected, actual);

        radio.setRadioStationNumber(-1000);
        actual = radio.getRadioStationNumber();

        assertEquals(expected, actual);
    }

}