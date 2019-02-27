package draz.rosette.rosettetremp.data;

import java.util.Date;

public class MyRoute {
    private String key;// key: unique id for each object. have to be....
    private String owner;
    private String departure;
    private String Target;
    private Date dHour;
    private Date tHour;

    public MyRoute(String key, String owner, String departure, String target, Date dHour, Date tHour){
        this.key = key;
        this.owner = owner;
        this.departure = departure;
        Target = target;
        this.dHour = dHour;
        this.tHour = tHour;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getDeparture() {
        return departure;
    }

    public void setDeparture(String departure) {
        this.departure = departure;
    }

    public String getTarget() {
        return Target;
    }

    public void setTarget(String target) {
        Target = target;
    }

    public Date getdHour() {
        return dHour;
    }

    public void setdHour(Date dHour) {
        this.dHour = dHour;
    }

    public Date gettHour() {
        return tHour;
    }

    public void settHour(Date tHour) {
        this.tHour = tHour;
    }


    @Override
    public String toString() {
        return "MyRoute{" +
                "key='" + key + '\'' +
                ", owner='" + owner + '\'' +
                ", departure='" + departure + '\'' +
                ", Target='" + Target + '\'' +
                ", dHour=" + dHour +
                ", tHour=" + tHour +
                '}';
    }



}
