package HW1;

public class Wall extends Obstacle{
    private int wallHeight;

    public Wall(int wallHeight) {
        this.wallHeight = wallHeight;
    }

    public int getWallHeight() {
        return wallHeight;
    }

    @Override
    public void run(Competitor competitor) {

    }

    @Override
    public void jump(Competitor competitor) {
        competitor.jump(wallHeight);
    }


}
