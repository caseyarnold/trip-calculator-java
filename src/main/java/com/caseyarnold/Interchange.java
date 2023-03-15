package com.caseyarnold;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import com.caseyarnold.Route;
import java.util.List;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Interchange {
    private String name;
    private double lat;
    private double lng;
    private List<Route> routes;
    private String devcomment;
}
