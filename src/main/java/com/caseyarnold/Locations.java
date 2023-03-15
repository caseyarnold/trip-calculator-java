package com.caseyarnold;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import java.util.Map;
import com.caseyarnold.Route;
import com.caseyarnold.Interchange;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Locations {
    private Map<String, Interchange> locations;

}
