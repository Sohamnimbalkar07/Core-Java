package tester;

import java.util.Date;
import java.util.Scanner;

import com.app.vehicles.Category;
import com.app.vehicles.Vehicle;

import custom_excepptions.VehicleHandlingException;
import static utils.VehicleUtils.*;
import static com.app.vehicles.Category.*;
import static com.app.vehicles.Vehicle.sdf;

public class Showroom {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			// init
			System.out.println("Enter size of a showroom");
			Vehicle[] showroom = new Vehicle[sc.nextInt()];// Vehicle[] : size
			boolean exit = false;
			int counter = 0;
			while (!exit) {
				System.out.println("Options : 1 : Add new Vehicle 2.Display All 3. Purchase Vehicle 10.Exit");
				try {
					switch (sc.nextInt()) {
					case 1:
						if (counter < showroom.length) {
							System.out.println(
									"Enter vehicle details -- regNo,  color,  price,  category,  manufactureDate(yr-mon-day");
							Vehicle v = new Vehicle(checkForDup(sc.nextInt(), showroom), sc.next(), sc.nextDouble(),
									valueOf(sc.next().toUpperCase()), sdf.parse(sc.next()));
							//=>correct inputs
							showroom[counter++]=v;
							System.out.println("Vehicle added to the showroom");
						} else
							throw new VehicleHandlingException("Showroom Full!!!!");

						break;

					case 10:
						exit = true;
						break;
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
				// read off all pending tokens from the scanner : till new line
				sc.nextLine();

			}
		}
	}
}
