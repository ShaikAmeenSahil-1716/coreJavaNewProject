package net.konic.methods;

public class NameCheck {

    String checkName(String firstName, String lastName) {

        String fullName = firstName + " " + lastName;

        if(fullName.length() > 10) {
            return "Long Name";
        } else {
            return "Short Name";
        }
    }

    public static void main(String[] args) {
        NameCheck obj = new NameCheck();

        String result = obj.checkName("Sahil", "Ameen");
        System.out.println(result);
    }

	public void readFullName() {
		
	}

	public boolean isLongName() {
		return false;
	}
}
