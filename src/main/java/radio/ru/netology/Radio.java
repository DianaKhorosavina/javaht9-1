package radio.ru.netology;
public class Radio {
    public int currentVolume;
    public int currentStation;
    public int getCurrentVolume() {
        return currentVolume;
    }
    public void setCurrentVolume (int newCurrentVolume) {
        if (newCurrentVolume > 100) {
            return;
        }
        if (newCurrentVolume < 0) {
            return;
        }
        currentVolume = newCurrentVolume;
    }
    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        } else {currentVolume = 100;}
    }
    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
        if (currentVolume <=0 ){
            currentVolume = 0;
        }
    }

    public int getCurrentStation (){
        return currentStation;
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation > 9) {
            return;
        }
        if (newCurrentStation < 0) {
        return;
        }
        currentStation = newCurrentStation;
    }

    public void increaseStation(){
        if (currentStation < 9){
            currentStation = currentStation + 1;
        }
        if (currentStation == 9) {
            currentStation = 0;
        }
    }

    public void decreaseStation(){
        if (currentStation > 0){
            currentStation = currentStation - 1;
        }
        if (currentStation == 0) {
            currentStation = 9;
        }
    }


}

