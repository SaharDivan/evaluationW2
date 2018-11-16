package evaluationW2.exe1;

public class Letter {

    private String address;
    private Boolean isStamped=false;

    public Letter(String address) {
        this.address = address;
    }


    public String getAddress() {
        return address;
    }

    public Boolean isStamped() {
        return isStamped;
    }

    public void stamped() {
        isStamped = true;
    }


}
