package org.puralsight;

import org.puralsight.model.Asset;
import org.puralsight.model.House;
import org.puralsight.model.Vehicle2;

import java.util.ArrayList;

public class AssetMain {

    static void main() {

        ArrayList<Asset> myAssets = new ArrayList<>();

        // Add houses
        myAssets.add(new House(
                "My House",
                "2020-05-10",
                350000,
                "123 Main St",
                2000,
                5000,
                1));

        myAssets.add(new House(
                "Vacation Home",
                "2021-08-15",
                500000,
                "456 Beach Rd",
                3000,
                8000,
                2));

        // Add vehicles
        myAssets.add(new Vehicle2(
                "Tom's Truck",
                "2018-03-20",
                40000,
                "Ford F-150",
                2019,
                120000));

        myAssets.add(new Vehicle2(
                "Family Car",
                "2022-07-01",
                30000,
                "Toyota Camry",
                2021,
                90000));

        // Loop through assets
        for (Asset asset : myAssets)
        {
            System.out.println("Description: " + asset.getDescription());
            System.out.println("Date Acquired: " + asset.getDateAcquired());
            System.out.println("Original Cost: $" + asset.getOriginalCost());
            System.out.println("Current Value: $" + asset.getValue());

            // Determine asset type
            if (asset instanceof House)
            {
                House house = (House) asset;

                System.out.println("House Address: "
                        + house.getAddress());
            }
            else if (asset instanceof Vehicle2)
            {
                Vehicle2 car = (Vehicle2) asset;

                System.out.println("Vehicle: "
                        + car.getYear() + " "
                        + car.getMakeModel());
            }

            System.out.println("--------------------------------");
        }
    }
}
