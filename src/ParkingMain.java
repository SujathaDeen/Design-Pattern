import com.google.common.base.Preconditions;
import fatorymethod.*;
import java.util.logging.Logger;
import java.util.Scanner;


class ParkingMain {
    public static void main(String args[]){
        Logger log=Logger.getLogger(ParkingMain.class.getName());
        Scanner input=new Scanner(System.in);

        try{
            log.info("Enter the type of vehicle( 2 Wheeler or 4 Wheeler ) : ");
            int wheeler=input.nextInt();

            ParkingChoice parkingChoice=new ParkingChoice();
            Parking totalParkingCharges=parkingChoice.parkingChoice(wheeler);
            Preconditions.checkNotNull(totalParkingCharges," This must not be Null");

            log.info("Enter No of Hours : ");
            float hours=input.nextFloat();

            totalParkingCharges.setNoOfHours(hours);

            log.info("Type of Vehicle : "+totalParkingCharges.typeOfVehicle()+" Wheeler");
            log.info("Parking Charges per Hour : "+totalParkingCharges.getChargesPerHour());
            log.info("No of Hours Parked : "+totalParkingCharges.getNoOfHours());
            log.info("Total Charges : "+totalParkingCharges.parkingCharges());

        }
        catch (Exception e){
            log.info("Error Message"+e.getMessage());
        }
    }
}
