package net.konic.methods;

class CountryName {

    String getCountry() {
        return "India";
    }

    public static void main(String[] args) {

        CountryName obj = new CountryName();

        String countryName = obj.getCountry();

        System.out.println("Which Country: " + countryName);
    }
}
