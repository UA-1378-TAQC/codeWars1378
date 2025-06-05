package org.academy.kata.dataproviders;


import java.util.List;

public abstract class BaseDataProvider {
    protected Object[][] combineDataProviders(Object[][] data, List<?> implementations) {
        Object[][] combined = new Object[data.length * implementations.size()][data[0].length + 1];
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < implementations.size(); j++) {
                System.arraycopy(data[i], 0, combined[i * implementations.size() + j], 0, data[i].length);
                combined[i * implementations.size() + j][data[i].length] = implementations.get(j);
            }
        }
        return combined;
    }

    protected Object[][] combineDataProviderForSquareRoot(Object[][] data, List<?> implementations) {
        Object[][] combined = new Object[data.length * implementations.size()][data[0].length + 1];
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < implementations.size(); j++) {
                int index = i * implementations.size() + j;

                int[] input = ((int[]) data[i][0]).clone();
                int[] expected = ((int[]) data[i][1]).clone();

                combined[index][0] = input;
                combined[index][1] = expected;
                combined[index][2] = implementations.get(j);
            }
        }
        return combined;
    }

}
