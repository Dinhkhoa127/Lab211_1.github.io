/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PokemonZoo;

import Supporter.tl;
import java.util.ArrayList;
import java.util.List;
import java.lang.String;
/**
 *
 * @author MSI VN
 */
public class Trainer {
    List<Pokemon> toList = new ArrayList<>();
    private String trainerName;
    
    public List<Pokemon> toList(){
        return toList;
    }
    public Trainer(String trainerName) {
        this.trainerName = trainerName;
    }

    public String getTrainerName() {
        return trainerName;
    }

    public void setTrainerName(String trainerName) {
        this.trainerName = trainerName;
    }

    
    public void showInfo(){
        System.out.println("The Pokemon's owner name: "+trainerName);
        System.out.println("The owner List: ");
        for(Pokemon ds : toList){
        System.out.println(ds);
    }
    }
    public void addPokemon(){
        String newPokemonName, newType;
        int newLevel;
        int count = tl.inputInt("How many Pokemons do you want to add ?");
        for(int i = 0; i< count; i++){
        newPokemonName = tl.inputNonBlankStr("Please enter the Pokemon name: ");
        newType = tl.inputNonBlankStr("Please enter type: ");
        newLevel = tl.inputInt("Please enter Pokemon'level: ");
        Pokemon po = new Pokemon(newPokemonName, newType, newLevel);
        toList.add(po);
        }
    }
    public void deletePokemon(){
        if(toList.isEmpty()){
            System.out.println("No data can be performed!!");
        }
        else{
            String name = tl.inputNonBlankStr("Please enter the Pokemon's name: ");
            for (Pokemon po : toList) {
                if(po.getName().equalsIgnoreCase(name))
                    System.out.println(po);
                    int choice = tl.inputInt("Do you want to remove ? 1-Yes : Others-No");
                    if(choice==1){
                        toList.remove(po);
                        System.out.println("Remove successfully!");
                        return;
                    }
                    else{
                    System.out.println("Remove failed!!");
                    return;
                    }
            }
        }
    }
    public void searchByLevel(){
        if(toList.isEmpty()){
            System.out.println("No data can be performed!!");
        }
        else{
            int level = tl.inputInt("Please enter the Pokemon's level: ");
            int count=0;
            for (Pokemon po : toList) {
                if(po.getLevel() == level){
                    System.out.println(po);
                    count++;
                }
            }
            if(count == 0){
                System.out.println("Can not find the Pokemon with the same level!!");
            }
        }
    }
    public void autoAdd(String name, String type, int level){
        Pokemon pk = new Pokemon(name, type, level);
        toList.add(pk);
    }
}
