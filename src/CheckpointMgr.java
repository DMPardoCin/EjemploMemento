import java.util.ArrayList;
import java.util.List;

public class CheckpointMgr {  //Caretaker
    private List<Checkpoint> checkpoints;

    public CheckpointMgr(){
        this.checkpoints=new ArrayList<>();
    }
    public void save(Checkpoint checkpoint){
        checkpoints.add(checkpoint);
    }

    public Checkpoint restore(int slot){
        //verifica si el stack de mementos esta vacio
        if(checkpoints.isEmpty()){
            System.out.println("no hay checkpoints para cargar");
            return null;
        }else{
            return checkpoints.get(slot); 
        }
    }

    public Checkpoint restore(){
        if(checkpoints.isEmpty()){
            System.out.println("no hay partidas para cargar");
            return null;
        }else{
            return checkpoints.get(checkpoints.size()-1); //devuelve el guardado mas reciente
        }
    }

    public List<Checkpoint> getCheckpoints() {
        return checkpoints;
    }

}
