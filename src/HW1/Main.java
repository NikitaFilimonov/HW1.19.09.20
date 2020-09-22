package HW1;

import HW1.Competitor;
import HW1.Human;
import HW1.Obstacle;
import HW1.RunningTrack;

import java.util.Objects;


public class Main {

    public static void main(String[] args) {


        Competitor[] competitors = new Competitor[]{new Human(1000, 1),
                new Human(800, 1), new Robot(5000, 5), new Robot(4000, 4),
                new Cat(500, 2), new Cat(250, 1)};
        Obstacle[] obstacles = new Obstacle[]{new RunningTrack(800), new Wall(1),
                new RunningTrack(1000), new Wall(2)};

        for (int i = 0; i < obstacles.length; i++) {
            for (int j = 0; j < competitors.length; j++) {
                if (obstacles[i].equals()) {
                    obstacles[i].run(competitors[j]);
                } else {
                    obstacles[i].jump(competitors[j]);
                }
            }

        }

    }

}

