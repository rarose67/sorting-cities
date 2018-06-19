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

        int result =0;

        for (int i=0; i < comparators.size(); i++)
        {
            result = comparators.get(i).compare(o1, o2);

            if (result != 0)
            {
                return result;
            }
        }

        return result;
    }
}
