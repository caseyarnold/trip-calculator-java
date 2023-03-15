package com.caseyarnold;
import com.caseyarnold.TollCalculator;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.IOException;

public class TollCalculatorTest
{
    TollCalculator tollCalculator;

    @BeforeEach
    void setUp() throws IOException {
        tollCalculator = new TollCalculator();
    }

    @Test
    @DisplayName("Testing distance QEW->400")
    void testDistanceQEW400() throws IOException {
        assertEquals(67.75, tollCalculator.calculateDistance("QEW", "Highway 400"));
    }

    @Test
    @DisplayName("Testing distance QEW->400")
    void testDistance400QEW() throws IOException {
        assertEquals(67.75, tollCalculator.calculateDistance("Highway 400", "QEW"));
    }
    @Test
    @DisplayName("Testing distance QEW == 400")
    void testDistance400EqualsQEW() throws IOException {
        assertEquals(tollCalculator.calculateDistance("QEW", "Highway 400"), tollCalculator.calculateDistance("Highway 400", "QEW"));
    }
    @Test
    @DisplayName("Testing cost QEW->400")
    void testCostQEW400() throws IOException {
        assertEquals(16.94, tollCalculator.costOfTrip("QEW", "Highway 400"));
    }

    @Test
    @DisplayName("Testing cost QEW->400")
    void testCost400QEW() throws IOException {
        assertEquals(16.94, tollCalculator.costOfTrip("Highway 400", "QEW"));
    }
    @Test
    @DisplayName("Testing cost QEW == 400")
    void testCost400EqualsQEW() throws IOException {
        assertEquals(tollCalculator.costOfTrip("QEW", "Highway 400"), tollCalculator.costOfTrip("Highway 400", "QEW"));
    }

    @Test
    @DisplayName("Testing distance QEW->Salem")
    void testDistanceQEWSalem() throws IOException {
        assertEquals(115.28, tollCalculator.calculateDistance("QEW", "Salem Road"));
    }

    @Test
    @DisplayName("Testing distance QEW->Salem")
    void testDistanceSalemQEW() throws IOException {
        assertEquals(115.28, tollCalculator.calculateDistance("Salem Road", "QEW"));
    }
    @Test
    @DisplayName("Testing distance QEW == Salem")
    void testDistanceSalemEqualsQEW() throws IOException {
        assertEquals(tollCalculator.calculateDistance("QEW", "Salem Road"), tollCalculator.calculateDistance("Salem Road", "QEW"));
    }
    @Test
    @DisplayName("Testing cost QEW->Salem")
    void testCostQEWSalem() throws IOException {
        assertEquals(28.82, tollCalculator.costOfTrip("QEW", "Salem Road"));
    }

    @Test
    @DisplayName("Testing cost QEW->Salem")
    void testCostSalemQEW() throws IOException {
        assertEquals(28.82, tollCalculator.costOfTrip("Salem Road", "QEW"));
    }
    @Test
    @DisplayName("Testing cost QEW == Salem")
    void testCostSalemEqualsQEW() throws IOException {
        assertEquals(tollCalculator.costOfTrip("QEW", "Salem Road"), tollCalculator.costOfTrip("Salem Road", "QEW"));
    }
    @Test
    @DisplayName("Testing distance Keele Street->404")
    void testDistanceKeeleStreet404() throws IOException {
        assertEquals(12.89, tollCalculator.calculateDistance("Keele Street", "Highway 404"));
    }

    @Test
    @DisplayName("Testing distance Keele Street->404")
    void testDistance404KeeleStreet() throws IOException {
        assertEquals(12.89, tollCalculator.calculateDistance("Highway 404", "Keele Street"));
    }
    @Test
    @DisplayName("Testing distance Keele Street == 404")
    void testDistance404EqualsKeeleStreet() throws IOException {
        assertEquals(tollCalculator.calculateDistance("Keele Street", "Highway 404"), tollCalculator.calculateDistance("Highway 404", "Keele Street"));
    }
    @Test
    @DisplayName("Testing cost Keele Street->404")
    void testCostKeeleStreet404() throws IOException {
        assertEquals(3.22, tollCalculator.costOfTrip("Keele Street", "Highway 404"));
    }

    @Test
    @DisplayName("Testing cost Keele Street->404")
    void testCost404KeeleStreet() throws IOException {
        assertEquals(3.22, tollCalculator.costOfTrip("Highway 404", "Keele Street"));
    }
    @Test
    @DisplayName("Testing cost Keele Street == 404")
    void testCost404EqualsKeeleStreet() throws IOException {
        assertEquals(tollCalculator.costOfTrip("Keele Street", "Highway 404"), tollCalculator.costOfTrip("Highway 404", "Keele Street"));
    }

}
