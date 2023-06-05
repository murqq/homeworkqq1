public class Radio {
    private int currentStation;
    private int totalStations;
    private int volume;

    public Radio() {
        this.totalStations = 10;
        this.currentStation = 0;
        this.volume = 0;
    }

    public Radio(int totalStations) {
        this.totalStations = totalStations;
        this.currentStation = 0;
        this.volume = 0;
    }

    public void setCurrentStation(int station) {
        if (station >= 0 && station < totalStations) {
            currentStation = station;
        }
    }

    public void next() {
        currentStation = (currentStation + 1) % totalStations;
    }

    public void prev() {
        currentStation = (currentStation - 1 + totalStations) % totalStations;
    }

    public void setVolume(int volume) {
        if (volume >= 0 && volume <= 100) {
            this.volume = volume;
        }
    }

    public void increaseVolume() {
        if (volume < 100) {
            volume++;
        }
    }

    public void decreaseVolume() {
        if (volume > 0) {
            volume--;
        }
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public int getTotalStations() {
        return totalStations;
    }

    public int getVolume() {
        return volume;
    }
}
