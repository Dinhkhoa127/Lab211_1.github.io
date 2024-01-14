/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Menu;
import PokemonZoo.Manager;
import Supporter.tl;
/**
 *
 * @author MSI VN
 */
public class MainMenu {
    public static void main (String[] args){
        Manager ma = new Manager();
        int kq=0;
        ma.autoAdd();
        do {
            kq = menu();
            switch (kq) {
                case 1:
                    //Add a pokemon
                    ma.addTrainer();
                    ma.addPokemon();
                    break;
                case 2:
                    //Delete a pokemon
                    ma.deletePokemon();
                    break;
                case 3:
                    //Display Trainer name
                    ma.showAllInfo();
                    break;
                case 4:
                    //Search for pokemon by level
                    ma.searchPokemonLevel();
                    break;
                default:
                    System.out.println("Thank you!!");
            }
        } while (kq<5);
        
}

    private static int menu() {
        int kq = tl.inputInt("1- Add a pokemon \n"
                           + "2- Delete a pokemon \n"
                           + "3- Display Trainer \n"
                           + "4- Search for Pokemon by level \n"
                           + "5- Exit! \n");
        return kq;
    }
}