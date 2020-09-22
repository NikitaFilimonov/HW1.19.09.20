package HW1;

public class RunningTrack extends Obstacle {
    private int trackDistance;

    public RunningTrack(int trackDistance) {
        this.trackDistance = trackDistance;
    }


    public int getTrackDistance() {
        return trackDistance;
    }

    @Override
    public void jump(Competitor competitor) {

    }

    @Override
    public void run(Competitor competitor) {
        competitor.run(trackDistance);
    }




}


