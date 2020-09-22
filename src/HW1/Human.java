package HW1;

public class Human implements Competitor {

    private int maxDist;
    private int maxHeight;


    public Human(int maxDist, int maxHeight) {
        this.maxDist = maxDist;
        this.maxHeight = maxHeight;

    }

    public int getMaxDist() {
        return maxDist;
    }

    public int getMaxHeight() {
        return maxHeight;
    }


    @Override
    public void run(int dist) {
        if (dist <= maxDist){
            System.out.println("Человек успешно пробежал");
        } else {
            System.out.println("Человек не смог пробежать");

        }
    }

    @Override
    public void jump(int height) {
        if (height <= maxHeight){
            System.out.println("Человек успешно перепрыгнул");
        } else {
            System.out.println("Человек не смог перепрыгнуть");

        }


    }


}
