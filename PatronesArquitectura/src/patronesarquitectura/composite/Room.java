/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package patronesarquitectura.composite;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class Room implements IStructure {

    public String name;

    public Room(String name) {
        this.name = name;
    }

    @Override
    public void enter() {
        System.out.println("Enter please ROOM...");
    }

    @Override
    public void exit() {
        System.out.println("Exit please  ROOM...");
    }

    @Override
    public void location() {
         System.out.println("Name location: " + this.getName());
    }

    public String getName() {
        return this.name;
    }
}
