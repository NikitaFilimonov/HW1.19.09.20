package HW1;

public class Cat implements Competitor{

    private int maxDist;
    private int maxHeight;

    public Cat(int maxDist, int maxHeight) {
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
            System.out.println("Кот успешно пробежал");
        } else {
            System.out.println("Кот не смог пробежать");
        }
    }

    @Override
    public void jump(int height) {
        if (height <= maxHeight){
            System.out.println("Кот перепрыгнул");
        } else {
            System.out.println("Кот не смог перепрыгнуть");
        }
    }


}
