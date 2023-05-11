/*
 * File:MainController.java
 * Author:Szabó Szebasztián
 * Copyright:2023, Szebi:)
 * Group:SZOFT-I-1-N
 * Date:2023-05-11
 * Github: https://github.com/SzaboSzebasztian01
 * Licenc: GNU GPL
 */

package controllers;

import javafx.scene.control.Button;
import model.MainModel;
import views.MainPanel;

public class MainController {
    MainPanel mainPanel;
    MainModel mainModel;

    public MainController() {
        this.mainPanel = new MainPanel();
        this.mainModel = new MainModel();
        this.handleEvent();
    }

    public MainPanel getMainPanel() {
        return mainPanel;
    }

    private void handleEvent(){
        Button calcButton = this.mainPanel.getButtonPanel().getCalcButton();

        calcButton.setOnAction( e -> onClickCalcButton() );
    }

    public void onClickCalcButton(){
        double sideA = -1;
        double sideB = -1;
        double sideC = -1;

        String sideAStr = this.mainPanel.getsideA().getValue();
        if (inputCheck(sideAStr)) {
            sideA = Double.parseDouble(sideAStr);
    
            }

        String sideBStr = this.mainPanel.getsideB().getValue();

        if (inputCheck(sideBStr)) {
            sideB = Double.parseDouble(sideBStr);
    
            }

        String sideCStr = this.mainPanel.getsideC().getValue();

        if (inputCheck(sideCStr)) {
            sideC = Double.parseDouble(sideCStr);

        }

        Double volume = mainModel.calcVolume(sideA, sideB, sideC);
        String volumeStr = volume.toString();
        
        this.mainPanel.getVolumePanel().setValue(volumeStr);

    }

    public boolean inputCheck(String input) {

        return input.matches("[0-9.,]+")?true:false;
    }
    
}
