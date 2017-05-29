/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tennisgame;

/**
 *
 * @author nhatnk
 */
public interface TennisGame {

    void wonPoint(String playerName);
    String getScore();
}