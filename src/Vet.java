import java.util.ArrayList;
public class Vet {
    private String name;
    private ArrayList<Animal> clients;

    public Vet(String name){
        this.name = name;
        clients = new ArrayList<Animal>();
    }
    public void addClient(Animal animal){
        if(clients.indexOf(animal)>-1){
            System.out.println( animal.getName() + " is already a client of " + name + "!");
        }else{
            System.out.println("Welcome to " + name +" office, " + animal.getName() + "!");
            clients.add(animal);
        }
    }
    }

