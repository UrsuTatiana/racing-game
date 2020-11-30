package com.racinggame;

import com.racinggame.utils.ScannerUtils;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;


public class Game {

    private Track[] tracks = new Track[3];

    public void start() {
        System.out.println("Welcome to the racing game!");

        initializeTrack();

        int playerCount = getPlayerCountFromUser();

        System.out.println("player count:" + playerCount);

        String vehicleName = getVehicleNameFromUser();

        System.out.println("Vehicle name: " + vehicleName);

    }

    private void initializeTrack() {
        Track track1 = new Track();
        track1.setName("Highway");
        track1.setLength(200);

        tracks[0] = track1;

        Track track2 = new Track();
        track2.setName("Street Circuit");
        track2.setLength(100);

        tracks[1] = track2;

        displayTracks();

    }

    private void displayTracks() {
        /*System.out.println("1. " + tracks[0].getName() + ":" + tracks[0].getLength());
        System.out.println("2. " + tracks[1].getName() + ":" + tracks[1].getLength());
        System.out.println("3. " + tracks[2].getName() + ":" + tracks[2].getLength());*/
        // Classic for
        for (int i = 0; i < tracks.length; i++) {
            if (tracks[i] != null) {
                System.out.println((i + 1) + ". " + tracks[i].getName() + ": " + tracks[i].getLength());

            }
        }


    }


    private int getPlayerCountFromUser() {
        System.out.println("Please enter number players:");
        return ScannerUtils.nextIntAndMovedToNextLine();


    }

    private String getVehicleNameFromUser() {
        System.out.println("Please enter vehicle name:");
        return ScannerUtils.nextLine();
    }
}
