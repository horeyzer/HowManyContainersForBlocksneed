public class Main {
    public static void main(String[] args) {
        int amountOfBricks = 63;
        int containerCapacity = 8;

        int fContainers = amountOfBricks / containerCapacity; // calculate the number of full containers

        int rBlocks = amountOfBricks % containerCapacity; // calculate the remaining blocks in the partially filled container

        int tContainers = fContainers + (rBlocks > 0 ? 1 : 0); // calculate the total number of containers

        System.out.println("We have " + amountOfBricks + " Lego bricks.");
        System.out.println("Each container max capacity " + containerCapacity + " Lego blocks.");
        System.out.println("Number of full containers: " + fContainers);
        System.out.println("Number of total containers: " + tContainers);
        System.out.println("Blocks in the partially filled container: " + rBlocks);
    }
}