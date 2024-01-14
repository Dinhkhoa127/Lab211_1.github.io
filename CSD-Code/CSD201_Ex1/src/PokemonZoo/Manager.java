/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PokemonZoo;

import Supporter.tl;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author MSI VN
 */
public class Manager {
    List<Trainer> dstr = new ArrayList<>();
    Trainer tr;
    public void addTrainer(){
        String name = tl.inputNonBlankStr("Please enter Trainer's name: ");
        name = name.trim().toUpperCase();
        tr = new Trainer(name);
        dstr.add(tr);
    }
    public void addPokemon(){
        tr.addPokemon();
    }
    public void showAllInfo(){
        if(dstr.isEmpty()){
            System.out.println("No data can be performed!!");
        }
        else{
            for(Trainer tr : dstr){
                tr.showInfo();
            }  
        }
    }
    public int searchTrainerName(String name){
        name = name.trim().toUpperCase();
        for(int i =0; i< dstr.size(); i++){
            if(dstr.get(i).getTrainerName().equals(name))
                return i;
        }
        return -1;
    }
    public void deletePokemon(){
        if(dstr.isEmpty())
            System.out.println("Empty list. No information can be performed!!!");
        else{
            String name = tl.inputNonBlankStr("Please enter the Trainer's name: ");
            int index = searchTrainerName(name);
            if(index>=0){
                dstr.get(index).deletePokemon();
            }
            else
                System.out.println("Can not find the Trainer's name!!");
        }
    }
    public void searchPokemonLevel(){
        if(dstr.isEmpty())
            System.out.println("Empty list. No information can be performed!!!");
        else{
            String name = tl.inputNonBlankStr("Please enter the Trainer's name: ");
            int index = searchTrainerName(name);
            if(index>=0){
                dstr.get(index).searchByLevel();
            }
            else
                System.out.println("Can not find the Trainer's name!!");
        }
    }
    public void autoAdd(){
        tr = new Trainer("ANH");
        tr.autoAdd("Po", "Fire", 5);
        tr.autoAdd("Bash", "Hydro", 555);
        tr.autoAdd("Lade", "Dat", 152);
        dstr.add(tr);
        tr = new Trainer("TAM");
        tr.autoAdd("Peos", "Fire", 453);
        tr.autoAdd("Bosi", "Nham", 52);
        tr.autoAdd("Lako", "Dat", 158);
        dstr.add(tr);
    }
}
