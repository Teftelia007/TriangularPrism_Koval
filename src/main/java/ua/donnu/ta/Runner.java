package ua.donnu.ta;

import ua.donnu.ta.TriangularPrism.TriangularPrism;

import java.util.ArrayList;
import java.util.List;

public class Runner {

    public static void main(String[] args) {
        double result = TriangularPrism.surfaceArea(2,2,2,5);
        System.out.println(result);

        double result1 = TriangularPrism.Volume(2,2,2,5);
        System.out.println(result1);




    }

}