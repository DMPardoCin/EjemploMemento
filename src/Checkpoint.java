public class Checkpoint { //Memento
    
    private int level;
    private int lives;
    private String power;
    
    public Checkpoint(int level, int lives, String power) {
        this.level=level;
        this.lives=lives;
        this.power=power;
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

    
}
