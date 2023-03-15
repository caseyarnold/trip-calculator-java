package com.caseyarnold;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import com.caseyarnold.Route;

public class TollCalculator
{
    private File JSONFile;
    private ObjectMapper objectMapper;
    private double ratePerKilometre = 0.25;
    Locations locations;

    public TollCalculator() throws IOException {
        this.JSONFile = new File("src/main/resources/interchanges.json");
        this.objectMapper = new ObjectMapper();
        this.locations = this.objectMapper.readValue(this.JSONFile, Locations.class);
    }
    public static void main(String[] args) throws IOException {
        TollCalculator tollCalculator = new TollCalculator();
        System.out.println(tollCalculator.costOfTrip("QEW", "Highway 400"));
        System.out.println(tollCalculator.calculateDistance("QEW", "Highway 400"));
    }

    private ArrayList<String> generateList(String enter, String exit) {
        ArrayList<String> listIds = new ArrayList<>();
        boolean foundEnter = false;
        boolean foundExit = false;
        boolean foundExitFirst = false;

        for (Map.Entry<String, Interchange> interchange : locations.getLocations().entrySet()) {
            String interchangeName = interchange.getValue().getName();
            if(interchangeName.equals(enter)) foundEnter = true;
            if(interchangeName.equals(exit)) {
                if(!foundEnter) foundExitFirst = true;

                foundExit = true;
            }

            if(foundEnter || foundExit) {
                listIds.add(interchange.getKey());
                if (foundEnter && foundExit) break;
            }
        }

        // We are traversing list east to west, thus reverse list
        if(foundExitFirst) {
            Collections.reverse(listIds);
        }

        return listIds;
    }
    public double costOfTrip(String enter, String exit) throws IOException {
        double finalCost = this.calculateDistance(enter, exit) * this.ratePerKilometre;

        return this.roundDouble(finalCost);
    }
    public double calculateDistance(String enter, String exit) throws IOException {
        double distance = 0.0;

        ArrayList<String> listIds = this.generateList(enter, exit);
        while(listIds.size() >= 2) {
            String key = listIds.remove(0);
            String nextKey = listIds.get(0);
            List<Route> routes = this.locations.getLocations().get(key).getRoutes();

            for(Route route : routes) {
                if(route.getToId() == Integer.parseInt(nextKey)) {
                    distance += route.getDistance();
                }
            }
        }

        return this.roundDouble(distance);
    }

    private double roundDouble(double number) {
        final DecimalFormat df = new DecimalFormat("0.00");
        return Double.parseDouble(df.format(number));
    }
}
