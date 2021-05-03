package fatorymethod;

class TwoWheelerParking extends Parking {

    TwoWheelerParking() {
        super.setChargesPerHour(25.00f);
    }

    @Override
    public int typeOfVehicle() {
        return 2;
    }
}
