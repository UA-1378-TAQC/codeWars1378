package org.academy.kata.implementation.RomanKmet;

import org.academy.kata.Base;
import org.academy.kata.ISeven;

import java.util.List;

public class SevenImpl extends Base implements ISeven {
    @Override
    public long newAvg(double[] arr, double navg) {
        return 0;
    }

    @Override
    public String seriesSum(int n) {
        return "";
    }

    @Override
    public List<String> getTasks() {
        return List.of(
                "newAvg (Calculate the required donation to achieve the target average)",
                "seriesSum (Calculate the sum of a series of numbers)"

        );
    }
}
