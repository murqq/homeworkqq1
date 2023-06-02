import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void setCurrentStation_ValidStation_Success() {
        Radio radio = new Radio();
        radio.setCurrentStation(5);
        int currentStation = radio.getCurrentStation();
        Assertions.assertEquals(5, currentStation);
    }

    @Test
    public void setCurrentStation_InvalidStation_NoChange() {
        Radio radio = new Radio();
        radio.setCurrentStation(15);
        int currentStation = radio.getCurrentStation();
        Assertions.assertEquals(0, currentStation);
    }

    @Test
    public void next_CurrentStationNotMax_ChangeToNextStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(3);
        radio.next();
        int currentStation = radio.getCurrentStation();
        Assertions.assertEquals(4, currentStation);
    }

    @Test
    public void next_CurrentStationIsMax_ChangeToFirstStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        radio.next();
        int currentStation = radio.getCurrentStation();
        Assertions.assertEquals(0, currentStation);
    }

    @Test
    public void prev_CurrentStationNotMin_ChangeToPrevStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(7);
        radio.prev();
        int currentStation = radio.getCurrentStation();
        Assertions.assertEquals(6, currentStation);
    }

    @Test
    public void prev_CurrentStationIsMin_ChangeToLastStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        radio.prev();
        int currentStation = radio.getCurrentStation();
        Assertions.assertEquals(9, currentStation);
    }

    @Test
    public void setVolume_ValidVolume_Success() {
        Radio radio = new Radio();
        radio.setVolume(50);
        int volume = radio.getVolume();
        Assertions.assertEquals(50, volume);
    }

    @Test
    public void setVolume_InvalidVolume_NoChange() {
        Radio radio = new Radio();
        radio.setVolume(150);
        int volume = radio.getVolume();
        Assertions.assertEquals(0, volume);
    }

    @Test
    public void increaseVolume_VolumeNotMax_IncreaseByOne() {
        Radio radio = new Radio();
        radio.setVolume(80);
        radio.increaseVolume();
        int volume = radio.getVolume();
        Assertions.assertEquals(81, volume);
    }

    @Test
    public void increaseVolume_VolumeIsMax_NoChange() {
        Radio radio = new Radio();
        radio.setVolume(100);
        radio.increaseVolume();
        int volume = radio.getVolume();
        Assertions.assertEquals(100, volume);
    }

    @Test
    public void decreaseVolume_VolumeNotMin_DecreaseByOne() {
        Radio radio = new Radio();
        radio.setVolume(40);
        radio.decreaseVolume();
        int volume = radio.getVolume();
        Assertions.assertEquals(39, volume);
    }

    @Test
    public void decreaseVolume_VolumeIsMin_NoChange() {
        Radio radio = new Radio();
        radio.setVolume(0);
        radio.decreaseVolume();
        int volume = radio.getVolume();
        Assertions.assertEquals(0, volume);
    }

    @Test
    public void setCurrentStation_MinStationValue_Success() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        int currentStation = radio.getCurrentStation();
        Assertions.assertEquals(0, currentStation);
    }

    @Test
    public void setCurrentStation_MaxStationValue_Success() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        int currentStation = radio.getCurrentStation();
        Assertions.assertEquals(9, currentStation);
    }

    @Test
    public void setCurrentStation_NegativeStationValue_NoChange() {
        Radio radio = new Radio();
        radio.setCurrentStation(-1);
        int currentStation = radio.getCurrentStation();
        Assertions.assertEquals(0, currentStation);
    }

    @Test
    public void setCurrentStation_InvalidStationValue_NoChange() {
        Radio radio = new Radio();
        radio.setCurrentStation(15);
        int currentStation = radio.getCurrentStation();
        Assertions.assertEquals(0, currentStation);
    }

    @Test
    public void setVolume_MinVolumeValue_Success() {
        Radio radio = new Radio();
        radio.setVolume(0);
        int volume = radio.getVolume();
        Assertions.assertEquals(0, volume);
    }

    @Test
    public void setVolume_MaxVolumeValue_Success() {
        Radio radio = new Radio();
        radio.setVolume(100);
        int volume = radio.getVolume();
        Assertions.assertEquals(100, volume);
    }

    @Test
    public void setVolume_NegativeVolumeValue_NoChange() {
        Radio radio = new Radio();
        radio.setVolume(-1);
        int volume = radio.getVolume();
        Assertions.assertEquals(0, volume);
    }

    @Test
    public void setVolume_InvalidVolumeValue_NoChange() {
        Radio radio = new Radio();
        radio.setVolume(150);
        int volume = radio.getVolume();
        Assertions.assertEquals(0, volume);
    }
}
