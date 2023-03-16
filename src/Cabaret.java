import java.util.ArrayList;
public class Cabaret {

    private String name;
    private ArrayList<Performer>  performers;

    public Cabaret(String name){
        this.name = name;
        performers = new ArrayList<Performer>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Performer> getPerformers(){
        return performers;
    }

    public boolean addPerformer(Performer performer1){
        if(performers.indexOf(performer1)>-1){
            return false;
        }else{
            performers.add(performer1);
            return true;
        }
    }

    public boolean removePerformer(Performer performer1){
        if(performers.indexOf(performer1)>-1){
           performers.remove(performers.indexOf(performer1));
            return true;
        }else{
            return false;
        }
    }

    public double averagePerformerAge(){
        int i =0;
        double avg = 0;
        for(Performer p : performers){
            avg += p.getAge();
            i++;
        }
        return avg/i;
    }

    public ArrayList<Performer> performersOverAge(int age){
        ArrayList<Performer> l = new ArrayList<Performer>();
        for(int i = 0; i<performers.size(); i++){
            if(performers.get(i).getAge()>= age){
                l.add(performers.get(i));
            }
        }
        return l;
    }

    public void groupRehearsal(){
        for(int i = 0; i<performers.size(); i++){
            System.out.println("REHEARSAL CALL! " + performers.get(i).getName());
            if(performers.get(i) instanceof Comedian){
                ((Comedian) performers.get(i)).perform();
                ((Comedian) performers.get(i)).rehearse(false);
            }else{
                    performers.get(i).perform();
            }
        }
    }
}
