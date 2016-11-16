/**
 * Created by donalmaher on 16/11/2016.
 */
public class Job {

    private String position;
    private int range;

    public Job(String position, int range) {
        this.position = position;
        this.range = range;
    }

    public int getRange() {
        return range;
    }

    public void setRange(int range) {
        this.range = range;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}
