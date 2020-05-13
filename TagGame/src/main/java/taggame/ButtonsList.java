package taggame;

import java.awt.*;
import java.util.ArrayList;

public class ButtonsList {
    private int[] buttonsList;

    public ButtonsList() {
        buttonsList = new int[16];
    }

    public void setButtonsList(int[] buttonsList) {
        this.buttonsList = buttonsList;
    }

    public int[] getButtonsList() {
        return buttonsList;
    }


    public void shuffle() {
        GamePlay gamePlay = new GamePlay();
        buttonsList = gamePlay.shuffleList();
    }


}
