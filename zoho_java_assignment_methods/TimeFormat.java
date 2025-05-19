public class TimeFormat {
    public static void main(String[] args) {
        int secs = 3800;
        printTimeFormat(secs);   

    }

    private static void printTimeFormat(int secs) {
        int mins = secs / 60;
        secs = secs % 60;
        int hrs = mins / 60;
        mins = mins % 60;

        System.out.println(pad(hrs) + " : " + pad(mins) + " : " + pad(secs));
    }

    private static String pad(int time) {
        if(time < 10)
            return "0" + time;
        return "" + time;
    }
}
