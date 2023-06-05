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
    public void radioConstructor_DefaultTotalStations() {
        Radio radio = new Radio();
        int totalStations = radio.getTotalStations();
        Assertions.assertEquals(10, totalStations);
    }

    @Test
    public void radioConstructor_CustomTotalStations() {
        Radio radio = new Radio(20);
        int totalStations = radio.getTotalStations();
        Assertions.assertEquals(20, totalStations);
    }

    @Test
    public void setCurrentStation_OutOfBounds_NoChange() {
        Radio radio = new Radio(5);
        radio.setCurrentStation(10);
        int currentStation = radio.getCurrentStation();
        Assertions.assertEquals(0, currentStation);
    }

    @Test
    public void setCurrentStation_ValidStationWithinTotalStations_Success() {
        Radio radio = new Radio(10);
        radio.setCurrentStation(5);
        int currentStation = radio.getCurrentStation();
        Assertions.assertEquals(5, currentStation);
    }

    @Test
    public void setCurrentStation_InvalidStationWithinTotalStations_NoChange() {
        Radio radio = new Radio(10);
        radio.setCurrentStation(15);
        int currentStation = radio.getCurrentStation();
        Assertions.assertEquals(0, currentStation);
    }

    @Test
    public void setCurrentStation_ValidStationWithinTotalStations_CustomTotalStations_Success() {
        Radio radio = new Radio(20);
        radio.setCurrentStation(15);
        int currentStation = radio.getCurrentStation();
        Assertions.assertEquals(15, currentStation);
    }

    @Test
    public void setCurrentStation_InvalidStationWithinTotalStations_CustomTotalStations_NoChange() {
        Radio radio = new Radio(20);
        radio.setCurrentStation(25);
        int currentStation = radio.getCurrentStation();
        Assertions.assertEquals(0, currentStation);
    }

    @Test
    public void setVolume_ValidVolumeWithinRange_Success() {
        Radio radio = new Radio();
        radio.setVolume(50);
        int volume = radio.getVolume();
        Assertions.assertEquals(50, volume);
    }

    @Test
    public void setVolume_InvalidVolumeWithinRange_NoChange() {
        Radio radio = new Radio();
        radio.setVolume(150);
        int volume = radio.getVolume();
        Assertions.assertEquals(0, volume);
    }

    @Test
    public void setCurrentStation_ValidStationAtLowerBound_Success() {
        Radio radio = new Radio(10);
        radio.setCurrentStation(0);
        int currentStation = radio.getCurrentStation();
        Assertions.assertEquals(0, currentStation);
    }

    @Test
    public void setCurrentStation_ValidStationAtUpperBound_Success() {
        Radio radio = new Radio(10);
        radio.setCurrentStation(9);
        int currentStation = radio.getCurrentStation();
        Assertions.assertEquals(9, currentStation);
    }

    @Test
    public void setCurrentStation_InvalidStationBelowLowerBound_NoChange() {
        Radio radio = new Radio(10);
        radio.setCurrentStation(-1);
        int currentStation = radio.getCurrentStation();
        Assertions.assertEquals(0, currentStation);
    }

    @Test
    public void setCurrentStation_InvalidStationAboveUpperBound_NoChange() {
        Radio radio = new Radio(10);
        radio.setCurrentStation(10);
        int currentStation = radio.getCurrentStation();
        Assertions.assertEquals(0, currentStation);
    }

    @Test
    public void setVolume_ValidVolumeAtLowerBound_Success() {
        Radio radio = new Radio();
        radio.setVolume(0);
        int volume = radio.getVolume();
        Assertions.assertEquals(0, volume);
    }

    @Test
    public void setVolume_ValidVolumeAtUpperBound_Success() {
        Radio radio = new Radio();
        radio.setVolume(100);
        int volume = radio.getVolume();
        Assertions.assertEquals(100, volume);
    }

    @Test
    public void setVolume_InvalidVolumeBelowLowerBound_NoChange() {
        Radio radio = new Radio();
        radio.setVolume(-1);
        int volume = radio.getVolume();
        Assertions.assertEquals(0, volume);
    }

    @Test
    public void setVolume_InvalidVolumeAboveUpperBound_NoChange() {
        Radio radio = new Radio();
        radio.setVolume(101);
        int volume = radio.getVolume();
        Assertions.assertEquals(0, volume);
    }
}
