package com.softserve.homework14;

public enum ManufactureCategory {

    PHONE {
        @Override
        public String getName() {
            return "Phone";
        }
    },
    FOOD {
        @Override
        public String getName() {
            return "Food";
        }
    },
    TEXTILE {
        @Override
        public String getName() {
            return "Textile";
        }
    },
    BEVERAGE {
        @Override
        public String getName() {
            return "Beverage";
        }
    };

    public abstract String getName();

}
