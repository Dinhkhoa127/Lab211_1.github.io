/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PokemonZoo;

/**
 *
 * @author MSI VN
 */
public class Pokemon {
    private String name;
    private String type;
    private int level;

    public Pokemon() {
    }

    public Pokemon(String name, String type, int level) {
        this.name = name;
        this.type = type;
        this.level = level;
    }

    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) throws Exception {
        if(level<0){
            throw new Exception("The level must be >= 0!!");
        }
        this.level = level;
    }

    @Override
    public String toString() {
        return String.format("%-10s | %-10s | %d |", name, type, level);
    }
    
}
