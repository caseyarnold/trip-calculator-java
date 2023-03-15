package com.caseyarnold;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Route {
    private int toId;
    private double distance;
    private boolean exit;
    private boolean enter;
    private String startDate;
}
