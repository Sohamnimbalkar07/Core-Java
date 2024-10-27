package utils;

import com.app.vehicles.Vehicle;

import custom_excepptions.VehicleHandlingException;

public class VehicleUtils {
//add a static method: for chking dup vehicle : based upon reg no
	// It should throw the custom exc , in case of dup vehicle
	// o.w : ret reg no
	// use case : in Tester , while adding a new vehicle
	public static int checkForDup(int regNo, Vehicle[] vehicles) throws VehicleHandlingException {
		// create a vehicle instance , having reg no inited
		Vehicle newVehicle = new Vehicle(regNo);
		for (Vehicle v : vehicles)
			if (v != null)
				if (v.equals(newVehicle))
					throw new VehicleHandlingException("Dup Reg No Found!!!!!!");

		// => no dup found
		return regNo;
	}

	// add a static finder method :
	// findByRegNo : i/p : regNo , o/p Vehicle ref , or custom exc , in case vehicle is
	// not found
	public static Vehicle findByRegNo(int regNo,Vehicle[] vehicles) throws VehicleHandlingException
	{
		// create a vehicle instance , having reg no inited
		Vehicle existingVehicle=new Vehicle(regNo);
		for(Vehicle v : vehicles)
			if(v != null)
				if(v.equals(existingVehicle))
					return v;
		//=>vehicle not found
		throw new VehicleHandlingException("Vehicle not found!!!!");
					
	}

}
