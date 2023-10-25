package ra.data.models;

public class Mark {
    private String subject;
    private double point;

    public Mark() {
    }

    public Mark(String subject, double point) {
        this.subject = subject;
        this.point = point;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public double getPoint() {
        return point;
    }

    public void setPoint(double point) {
        this.point = point;
    }
}
