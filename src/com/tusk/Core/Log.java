package com.tusk.Core;

/**
 * Created by William on 4/12/15.
 */
public class Log {
    public static void main() {
        printHeader();
        log("Logger Initialized", 1);
    }
    public static void main(boolean writeToFile) {
        printHeader();
        //ADD another function for log file path and also add copyright display in this function
        log("Logger Initialized", 1);
        if (writeToFile) {
            log("No File Path Given, Writing To \"./Logs/Year/Month/Day/SERVER_PORT.log\"", 1);
        } else {
            log("Please Enable Data Log Saving", 5);
        }
    }

    public static void log(String outgoing, int ltype) {
        //Make a color implantation
        String stype;
        switch (ltype) {
            case 1:     stype = "Initialization";   break;
            case 2:     stype = "Default";          break;
            case 3:     stype = "Warning";          break;
            case 4:     stype = "Error";            break;
            case 5:     stype = "Suggestion";       break;
            default:    stype = "General";
        }
        System.out.println(new java.util.Date() + ">>" + outgoing);
    }
    private static void printHeader() {
        Short length = 70;
        System.out.print("\n");
        System.out.println(centerText("=", 70));
        System.out.println(centerText("TuskServer", 70));
        System.out.println(centerText("-", 70));
        System.out.println(centerText("Version 0.1-TESTING", 70));
        System.out.println(centerText("-", 70));
        System.out.println(centerText("Created By William Y", 70));
        System.out.println(centerText("-", 70));
        System.out.println(centerText("Copyright (c) 2015, Fluffy Robot Alpaca", 70));
        System.out.println(centerText("Licensed Under the BSD Simplified License", 70));
        System.out.println(centerText("-", 70));
        System.out.println(centerText("=", 70));



    }

    private static String centerText (String input, int length) {
        String buffer = "";
        String spaceBuffer1 = "";
        if(input.length() == 1){
            String inputNew = input;
            input = "";
            for(int i = 0; i < length; i++)input += inputNew;
        }
        for(int i = 0; i < ((length - input.length())/2); i++) spaceBuffer1 += " ";
        String spaceBuffer2 = spaceBuffer1;
        if ((input.length() + ( spaceBuffer1.length() * 2 ) ) != length)spaceBuffer2 += " ";
        buffer = "|" + spaceBuffer1 + input + spaceBuffer2 + "|";
        return buffer;
    }

}
