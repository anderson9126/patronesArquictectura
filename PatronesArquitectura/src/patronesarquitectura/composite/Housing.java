/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package patronesarquitectura.composite;

import java.util.ArrayList;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class Housing implements IStructure {

    private ArrayList<IStructure> structures;
    private String address;

    public Housing(String address) {
        this.structures = new ArrayList<IStructure>();
        this.address = address;
    }

    @Override
    public String getName() {
        return this.address;
    }


    public int addStructure(IStructure component) {
        this.structures.add(component);
        return this.structures.size() - 1;
    }

    public IStructure getStructure(int componentNimber) {
        return this.structures.get(componentNimber);
    }

    @Override
    public void location() {
        System.out.println("Name location: " + this.getName());
        for (IStructure structure : this.structures) {
            System.out.println(structure.getName());
        }
    }

    @Override
    public void enter() {
        System.out.println("Enter please...");
    }

    @Override
    public void exit() {
        System.out.println("Exit please...");
    }
}
