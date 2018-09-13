import java.util.*;
public class Rental {
    private int kind;
    private int days;


    public Rental(int kind, int days){
        this.kind = kind;
        this.days = days;
    }
    public int getKind(){
        return kind;
    }
    public void setKind(int kind){
        this.kind = kind;
    }
    public void setDays(int days){
        this.days = days;
    }
    public int getDays(){
        return days;
    }
    public double getBasePrice(){
        //TODO Some program code
        return days + kind;
    }
    private double amountFor(){
        double result;
        int choice;
        result = this.days*(this.days + this.kind);
        switch (this.kind){
            case 1:
                result = result*1.5;
            case 2:
                result = result*2;
            case 3:
                result = result*2.5;

        }
        if(this.days > 7)
            result = result*3;

        return result;

    }
}
