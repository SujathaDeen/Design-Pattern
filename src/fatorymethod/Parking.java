package fatorymethod;

public abstract class Parking {
    private float chargesPerHour;
    private float noOfHours;

    public float getChargesPerHour() {
        return chargesPerHour;
    }

    public void setChargesPerHour(float chargesPerHour) {
        this.chargesPerHour = chargesPerHour;
    }

    public float getNoOfHours() {
        return noOfHours;
    }

    public void setNoOfHours(float noOfHours) {
        this.noOfHours = noOfHours;
    }

    public abstract int typeOfVehicle();

    public float parkingCharges(){
        float totalParkingCharges=noOfHours*chargesPerHour;
        return totalParkingCharges;
    }
}
