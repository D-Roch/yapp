/* Generated By:JavaCC: Do not edit this line. ESLLParserByJavaCCConstants.java */
package com.github.kmizu.esll.parser;

public interface ESLLParserByJavaCCConstants {

  int EOF = 0;
  int NUMBER = 5;
  int PLUS = 6;
  int MINUS = 7;
  int ASTER = 8;
  int SLASH = 9;
  int PERC = 10;
  int LPAREN = 11;
  int RPAREN = 12;
  int LB = 13;
  int RB = 14;
  int EQ = 15;
  int SEMI = 16;
  int COMMA = 17;
  int DQUOTE1 = 18;
  int PRINT = 19;
  int IF = 20;
  int ELSE = 21;
  int FUN = 22;
  int VAR = 23;
  int IDENT = 24;
  int BEGIN_EXPR = 25;
  int DQUOTE2 = 26;
  int CONTENT = 27;

  int DEFAULT = 0;
  int IN_STRING = 1;

  String[] tokenImage = {
    "<EOF>",
    "\" \"",
    "\"\\t\"",
    "\"\\r\"",
    "\"\\n\"",
    "<NUMBER>",
    "\"+\"",
    "\"-\"",
    "\"*\"",
    "\"/\"",
    "\"%\"",
    "\"(\"",
    "\")\"",
    "\"{\"",
    "\"}\"",
    "\"=\"",
    "\";\"",
    "\",\"",
    "\"\\\"\"",
    "\"print\"",
    "\"if\"",
    "\"else\"",
    "\"fun\"",
    "\"var\"",
    "<IDENT>",
    "\"#{\"",
    "\"\\\"\"",
    "<CONTENT>",
  };

}
