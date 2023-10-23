package raddio.ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import radio.ru.netology.Radio;

public class RadioTest {

    @Test
    public void shouldNotSetVolumeAboveMax() {
        Radio cond = new Radio();

        cond.setCurrentVolume(101);
        int expected = 0;
        int actual = cond.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldSetMaxVolume() {
        Radio cond = new Radio();

        cond.setCurrentVolume(100);
        int expected = 100;
        int actual = cond.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetMaxVolumeWithinBorders() {
        Radio cond = new Radio();

        cond.setCurrentVolume(99);
        int expected = 99;
        int actual = cond.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetVolumeLessThenMinimum() {
        Radio cond = new Radio();

        cond.setCurrentVolume(-1);
        int expected = 0;
        int actual = cond.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetMinimumVolume() {
        Radio cond = new Radio();

        cond.setCurrentVolume(0);
        int expected = 0;
        int actual = cond.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetMinimumVolumeWithinBorders() {
        Radio cond = new Radio();

        cond.setCurrentVolume(1);
        int expected = 1;
        int actual = cond.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolume() {
        Radio cond = new Radio();

        cond.setCurrentVolume(15);
        int expected = 15;
        int actual = cond.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolume() {
        Radio cond = new Radio();

        cond.setCurrentVolume(45);

        cond.increaseVolume();
        int expected = 46;
        int actual = cond.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldNotIncreaseVolume() {
        Radio cond = new Radio();

        cond.setCurrentVolume(100);
        cond.setCurrentVolume(101);
        cond.increaseVolume();

        int expected = 100;
        int actual = cond.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReduceVolume() {
        Radio cond = new Radio();

        cond.setCurrentVolume(50);

        cond.decreaseVolume();
        int expected = 49;
        int actual = cond.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotReduceVolume() {
        Radio cond = new Radio();

        cond.setCurrentVolume(-1);
        cond.decreaseVolume();
        int expected = 0;
        int actual = cond.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetStationAboveMax() {
        Radio cond = new Radio();

        cond.setCurrentStation(10);
        int expected = 0;
        int actual = cond.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetMaxStation() {
        Radio cond = new Radio();

        cond.setCurrentStation(9);
        int expected = 9;
        int actual = cond.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetMaxStationWithinBorders() {
        Radio cond = new Radio();

        cond.setCurrentStation(8);
        int expected = 8;
        int actual = cond.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetStationLessThenMinimum() {
        Radio cond = new Radio();

        cond.setCurrentStation(-1);
        int expected = 0;
        int actual = cond.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetMinimumStationWithinBorders() {
        Radio cond = new Radio();

        cond.setCurrentStation(1);
        int expected = 1;
        int actual = cond.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetMinimumStation() {
        Radio cond = new Radio();

        cond.setCurrentStation(0);
        int expected = 0;
        int actual = cond.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetMediumStation() {
        Radio cond = new Radio();

        cond.setCurrentStation(5);
        int expected = 5;
        int actual = cond.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseStation() {
        Radio cond = new Radio();

        cond.setCurrentStation(4);

        cond.increaseStation();
        int expected = 5;
        int actual = cond.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchStationToZero() {
        Radio cond = new Radio();

        cond.setCurrentStation(9);

        cond.increaseStation();
        int expected = 0;
        int actual = cond.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldDecreaseStation() {
        Radio cond = new Radio();

        cond.setCurrentStation(7);

        cond.decreaseStation();
        int expected = 6;
        int actual = cond.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchStationToNine() {
        Radio cond = new Radio();

        cond.setCurrentStation(0);

        cond.decreaseStation();
        int expected = 9;
        int actual = cond.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

}


