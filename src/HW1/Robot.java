package HW1;

public class Robot implements Competitor{
    private int maxDist;
    private int maxHeight;

    public Robot(int maxDist, int maxHeight) {
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
            System.out.println("Робот успешно пробежал");
        } else {
            System.out.println("Робот не смог пробежать");
        }
    }

    @Override
    public void jump(int height) {
        if (height <= maxHeight){
            System.out.println("Робот успешно перепрыгнул");
        } else {
            System.out.println("Робот не смог перепрыгнуть");
        }
    }

    //
//    @Override
//    public void run() {
//        System.out.println("Робот бежит.");
//    }
//
//    @Override
//    public void jump() {
//        System.out.println("Робот прыгает.");
//    }
//
//    public int getRunDist() {
//        return runDist;
//    }
//
//    public int getJumpH() {
//        return jumpH;
//    }
}
