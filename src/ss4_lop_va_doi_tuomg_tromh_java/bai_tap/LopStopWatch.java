package ss4_lop_va_doi_tuomg_tromh_java.bai_tap;

public class LopStopWatch {
    private long starTime;
    private long endTime;

    public LopStopWatch() {

    }

    public long getStarTime() {

        return this.starTime;
    }

    public long getEndTime() {
        return this.endTime;
    }

    public long getStop() {
        return this.endTime = System.currentTimeMillis();

    }

    public long getStar() {
        return this.starTime = System.currentTimeMillis();

    }

    public long getElapsedTime() {
        return this.endTime - this.starTime;
    }

    public static void main(String[] args) {
        LopStopWatch st = new LopStopWatch();
        System.out.println(st.getStar());
        for (int i = 0; i < 1000000; i++) {
            System.out.println(st.getStop());
        }

        System.out.println(st.getElapsedTime());
    }

}
