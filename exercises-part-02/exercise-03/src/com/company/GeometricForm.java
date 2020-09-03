package com.company;

public class GeometricForm {
    Integer numberOfSides;

    public GeometricForm(Integer numberOfSides) {
        this.numberOfSides = numberOfSides;
    }

    String formType(Integer numberOfSides) {
        String type = "0";
        switch (numberOfSides) {
            case 3:
                type = "Triângulo";
                break;
            case 4:
                type = "Quadrilátero";
                break;
            case 5:
                type = "Pentágono";
                break;
            case 6:
                type = "Hexágono";
                break;
            case 7:
                type = "Heptágono";
                break;
            case 8:
                type = "Octágono";
                break;
        }

        return type;
    }
}
