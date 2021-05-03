package fatorymethod;

class FourWheelerParking extends Parking{


    FourWheelerParking() {
        super.setChargesPerHour(50.00f);
    }

    @Override
    public int typeOfVehicle() {
        return 4;
    }

}
