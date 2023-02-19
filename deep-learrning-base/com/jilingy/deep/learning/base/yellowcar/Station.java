package com.jilingy.deep.learning.base.yellowcar;

import lombok.Data;

/**
 * @author: YangJiling
 * @Description:
 * @date: 2022-12-17
 */
@Data
public class Station {

    private String stationName;

    private int carNumber;

    private String currentPosition;

    public Station(String stationName, int carNumber, String currentPosition) {
        this.stationName = stationName;
        this.carNumber = carNumber;
        this.currentPosition = currentPosition;
    }

}
