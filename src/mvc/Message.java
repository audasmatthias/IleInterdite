package mvc;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import enumerations.TypeMessage;
import game.Grille;

/**
 *
 * @author turbetde
 */
public class Message {

    public Message(TypeMessage type) {
        this.type = type;
    }

    public TypeMessage type;
    public String vue;
    public int nbJoueur;
    public Grille grille;
}
