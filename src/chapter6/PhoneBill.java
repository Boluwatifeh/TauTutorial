package chapter6;

public class PhoneBill {

    private int id;
    private  double base_cost;
    private double allotted_minutes;
    private double minutes_used;

    public PhoneBill(){
    }
    public PhoneBill(int id){
        this.id = id;
    }

    public PhoneBill(int id, double base_cost, double allotted_minutes, double minutes_used) {
        this.id = id;
        this.base_cost = base_cost;
        this.allotted_minutes = allotted_minutes;
        this.minutes_used = minutes_used;
    }

    public static double calculateOverage(){

    }

}
