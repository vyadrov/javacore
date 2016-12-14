package com.vyadrov.app.utils.classwork.lesson11;


public class Enigma {
    public static String stringEncode (String stringToEncode) {
        String plaiText = "1234567890ABCDEFGHIJKLMNOPRSTUVWXYZabcdefghijklmnoprstuvwxyz ";
        String cypherText = "QWERTYUIOPqwertyuiopASDFGHJKL 12345asdfghjklZXCVBNM67890zxcvbnm";
        StringBuilder stringBuilder = new StringBuilder(stringToEncode);
        String encodedString = "";
        for (int i = 0; i < stringBuilder.length(); i++) {
            for (int j = 0; j < plaiText.length(); j++) {
                if (stringBuilder.charAt(i) == plaiText.charAt(j)) {
                    stringBuilder.setCharAt(i, cypherText.charAt(j));
                    break;
                }
            }
        } System.out.println(stringBuilder.toString());
        return stringBuilder.toString();
    }
}
