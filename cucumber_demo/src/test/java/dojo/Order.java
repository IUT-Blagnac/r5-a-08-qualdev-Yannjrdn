package dojo;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private String owner;       // Le nom de la personne qui passe la commande
    private String target;      // Le nom de la personne pour qui la commande est destinée
    private List<String> cocktails; // Liste des cocktails dans la commande

    public Order() {
        this.cocktails = new ArrayList<>(); // Initialisation de la liste vide
    }

    public void declareOwner(String string) {
        // TODO Auto-generated method stub
        this.owner = string;
    }

    public void declareTarget(String string) {
        // TODO Auto-generated method stub
        this.target = string;
    }

    public List<String> getCocktails() {
        // TODO Auto-generated method stub
        return this.cocktails;
    }

}
