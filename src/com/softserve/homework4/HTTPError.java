package com.softserve.homework4;

public enum HTTPError {

    $400{
        @Override
        public String getName() {
            return "Bad Request";
        }

        @Override
        public int getStatusCode() {
            return 400;
        }
    },
    $401{
        @Override
        public String getName() {
            return "Unauthorized";
        }

        @Override
        public int getStatusCode() {
            return 401;
        }
    },

    $402{
        @Override
        public String getName() {
            return "Payment Required";
        }

        @Override
        public int getStatusCode() {
            return 402;
        }
    };

    public abstract String getName();
    public abstract int getStatusCode();

}
