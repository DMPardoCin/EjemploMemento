
public class Mario { //Originator

    private int level;
    private int lives;
    private String power;

    public Mario(int level, int lives, String power) {
        this.level=level;
        this.lives=lives;
        this.power=power;
    }
    public Checkpoint saveCheckpoint(){
        System.out.println("saved game");
        return new Checkpoint(this.level, this.lives, this.power);
    }
    public void restoreCheckpoint(Checkpoint checkpoint){
        //modifica los atributos de mario segun lo que traiga el checkpoint
        this.level=checkpoint.getLevel();
        this.lives=checkpoint.getLives();
        this.power=checkpoint.getPower();
        System.out.println("Estado restaurado");
    }
    public int getLevel() {
        return level;
    }
    public void setLevel(int level) {
        this.level = level;
    }
    public int getLives() {
        return lives;
    }
    public void setLives(int lives) {
        this.lives = lives;
    }
    public String getPower() {
        return power;
    }
    public void setPower(String power) {
        this.power = power;
    }
    @Override
    public String toString() {
        return "Mario [level=" + level + ", lives=" + lives + ", power=" + power + "]";
    }
   
}
