package org.launchcode.comparators;

import org.launchcode.City;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * Created by LaunchCode
 */
public class CompoundComparator implements Comparator<City> {

    List<Comparator<City>> comparators = new ArrayList<>();

    public void add(Comparator<City> cityComparator)
    {
        comparators.add(cityComparator);
    }

    @Override
    public int compare(City o1, City o2) {

        Comparator<City> cityComparator;
        int index = 0;


    }


}
