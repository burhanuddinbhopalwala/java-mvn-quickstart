package org.example.patterns.gof.creational.prototype;

public class Game implements Cloneable {
    private int id;
    private String name;
    private Membership membership;

    public Game() {
    }

    public Game(int id, String name, Membership membership) {
        this.id = id;
        this.name = name;
        this.membership = membership;
    }

    // Copy Constructor - Deep copy + Create Public Empty constructor along with as above!
    Game(Game game) {
        this.id = game.id;
        this.name = game.name;
        this.membership = new Membership();
    }
    // Game game = new Game(oldGame);

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Shallow copy
//    @Override
//    protected Object clone() throws CloneNotSupportedException {
//        return super.clone();
//    }

    public Membership getMembership() {
        return membership;
    }

    public void setMembership(Membership membership) {
        this.membership = membership;
    }

    // Deep copy
    @Override
    protected Object clone() throws CloneNotSupportedException {
        Game game = (Game) super.clone();
        game.setMembership(new Membership());
        return game;
    }
    // Game game = oldGame.clone();
}

// Pros: We can create as many clone as we want with same state.
// Cons: Take care of Inheritance + Circular dependency handling;