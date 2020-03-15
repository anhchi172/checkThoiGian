public class time {
    private int hour;
    private int min;
    private int sec;

    public time(int h, int m, int s) {
        hour = h;
        min = m;
        sec = s;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int h) {
        hour = h;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int m) {
        min = m;
    }

    public int getSec() {
        return sec;
    }

    public void setSec(int s) {
        sec = s;
    }
    public boolean checkValidHour(){
        return (hour>=0 && hour<=24);
    }

    public void decreaseOne() {
        if (sec > 0) {
            sec -= 1;
        } else if (min > 0) {
            sec = 59;
            min -= 1;
        } else {
            sec = 59;
            min = 59;
            hour -= 1;
        }
    }
}
