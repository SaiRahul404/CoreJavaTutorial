package org.example;

public class SmartHomeDevice {

    String deviceName;

    String deviceType;

    boolean IsOn;

    int batteryLevel;

    static int totalDevices = 0; // static variable

    SmartHomeDevice() { // default Contructor
        deviceName = "Unnamed Device";
        deviceType = "Unknown";
        IsOn = false;
        batteryLevel = 100;
        totalDevices++;
    }

    SmartHomeDevice(String device, String type) { // Parameterized Contsructor
        deviceName = device;
        deviceType = type;
        IsOn = false;
        batteryLevel = 100;
        totalDevices++;
    }

    SmartHomeDevice(String device, String type, boolean isOn, int battery) { // // Parameterized Contsructor
        deviceName = device;
        deviceType = type;
        IsOn = isOn;
        batteryLevel = battery;
        totalDevices++;
    }

    void showStatus() {
        System.out.println("Device: " + deviceName);
        System.out.println("Type: " + deviceType);
        System.out.println("Power: " + (IsOn ? "On" : "Off"));
        System.out.println("Battery: " + batteryLevel + "%");
        System.out.println();
    } // normal Method

    static void smartHome() { // static methods
        System.out.println("Welcome to your Smart House");
    }

    static void showTotalDevices() { // static methods
        System.out.println(" The total number of devices :" + totalDevices);
    }

    // How to call a static method ? - > To call a static methods use the class Name insted of an Object

    // Think about a school where multiple students study.
    //Each student has a different name and different roll number.
    //But all students belong to the same school.
    //Instead of storing the school name separately for each student, we store it once as a static variable.

    // static String schoolName
    //  Each student has a unique roll number and name, but they share the same school name.
    //✔ The schoolName variable is stored once in memory instead of being repeated for every student
    // Static variables belong to the class, not the object.

    // class Student {
    //    String name;  // Instance variable (Each student has a different name)
    //    int rollNo;   // Instance variable (Each student has a different roll number)
    //    static String schoolName = "ABC High School";  // Static variable (Same for all students)
    // static String principalName = "latha";
// }
    // System.out.println(Student.schoolName);
    // Student.schoolName = "XYZ International School"; // Now all students belong to the new school

    // {
    // name : "Rahul"
    // roll no : "10"
//     }
    // {
    // name : "Venlat"
    // roll no : "11"
//     }
    // schoolName = "ABC High School
    // principalName = "Sunitha"
}
