package com.journaldev.util;

import java.util.regex.*;

public class PatternExample {

    public static void main(String[] args) {
        Pattern pattern = Pattern.compile(".xx.");
        Matcher matcher = pattern.matcher("MY");
        System.out.println("Input String matches regex - "+matcher.matches());
        // bad regular expression
      //  pattern = Pattern.compile("*xx*");

    }
    
    /*
     x?      x occurs once or not at all
     X*      X occurs zero or more times
     X+      X occurs one or more times
     X{n}    X occurs exactly n times
     X{n,}   X occurs n or more times
     X{n,m}  X occurs at least n times but not more than m times
     */
    
    /*
\d   Any digits, short of [0-9]
\D  Any non-digit, short for [^0-9]
\s  Any whitespace character, short for [\t\n\x0B\f\r]
\S  Any non-whitespace character, short for [^\s]
\w  Any word character, short for [a-zA-Z_0-9]
\W  Any non-word character, short for [^\w]
\b  A word boundary
\B  A non word boundary
     */


}