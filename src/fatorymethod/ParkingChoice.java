package fatorymethod;

public class ParkingChoice {
    public Parking parkingChoice(int  noOfWheels){
        if (noOfWheels==0){
            return null;
        }
        if(noOfWheels==2){
            return new TwoWheelerParking();
        }
        else if(noOfWheels==4){
            return new FourWheelerParking();
        }
        return null;
    }
}
