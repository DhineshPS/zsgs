import java.util.Arrays;

class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        return birdsPerDay;
    }

    public int getToday() {
        return birdsPerDay[birdsPerDay.length - 1];
    }

    public void incrementTodaysCount() {
        ++birdsPerDay[birdsPerDay.length - 1];
    }

    public boolean hasDayWithoutBirds() {
        for(int n : birdsPerDay)
            if(n == 0)
                return true;
        return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int sum = 0;
        for(int i = 0; i < Math.min(numberOfDays, birdsPerDay.length); i++)
            sum += birdsPerDay[i];
        return sum;
    }

    public int getBusyDays() {
        int count = 0;
        for(int num : birdsPerDay)
            if(num >= 5)
                count++;
        return count;
    }

    public static void main(String[] args) {
        int[] birdsPerDay = {0, 2, 5, 3, 7, 8, 4};
        BirdWatcher birdWatcher = new BirdWatcher(birdsPerDay);

        System.out.println("Birds per day for last week: " + Arrays.toString(birdWatcher.getLastWeek()));
        System.out.println("Birds counted today: " + birdWatcher.getToday());
        birdWatcher.incrementTodaysCount();
        System.out.println("Birds counted today after increment: " + birdWatcher.getToday());
        System.out.println("Has any day without birds: " + birdWatcher.hasDayWithoutBirds());
        System.out.println("Total birds counted in first 4 days: " + birdWatcher.getCountForFirstDays(4));
        System.out.println("Number of busy days: " + birdWatcher.getBusyDays());
    }
}
