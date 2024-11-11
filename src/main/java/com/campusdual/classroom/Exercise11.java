package com.campusdual.classroom;

public class Exercise11 {
    public static void main(String[] args) {
        TVRemote redRemote = new TVRemote("Rojo");
        TVRemote blackRemote = new TVRemote("Negro");

        //Encender televisión
        redRemote.turnOn();
        blackRemote.turnOn();

        //Subir un canal
        redRemote.channelUp();
        blackRemote.channelUp();

        //Bajar un canal
        redRemote.channelDown();
        blackRemote.channelDown();

        //Establecer el canal en 0, intentar bajar un canal y comprobar que no se puede
        redRemote.channelDown();
        System.out.println("El canal actual del mando rojo es: " + redRemote.channel);
        blackRemote.channelDown();
        System.out.println("El canal actual del mando rojo es: " + blackRemote.channel);

        //Subir el volumen
        redRemote.volumeUp();
        blackRemote.volumeUp();

        //Bajar el volumen
        redRemote.volumeDown();
        blackRemote.volumeDown();

        //Establecer el volumen en 0, intentar bajar el volumen y comprobar que no se puede
        redRemote.volumeDown();
        System.out.println("El volumen actual del mando rojo es: " + redRemote.volume);
        blackRemote.volumeDown();
        System.out.println("El volumen actual del mando rojo es: " + blackRemote.volume);

        //Obtener el color del mando a distancia y mostrarlo por pantalla
        System.out.println(redRemote.getColor());
        System.out.println(blackRemote.getColor());

        //Apagar la TV
        redRemote.turnOff();
        blackRemote.turnOff();
    }

}