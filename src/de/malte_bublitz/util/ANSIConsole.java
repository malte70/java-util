/*
 * ANSIConsole
 *
 * Copyright (c) 2013 Malte Bublitz, https://malte-bublitz.de
 * All rights reserved.
 *
 */

package de.malte_bublitz.util;

import java.util.Scanner;

public class ANSIConsole {
	public static int COLOR_BLACK = 0;
	public static int COLOR_RED = 1;
	public static int COLOR_GREEN = 2;
	public static int COLOR_YELLOW = 3;
	public static int COLOR_BLUE = 4;
	public static int COLOR_DARK_MAGENTA = 5;
	public static int COLOR_DARK_CYAN = 6;
	public static int COLOR_GREY = 7;
	public static int COLOR_DARK_GREY = 8;
	public static int COLOR_LIGHT_RED = 9;
	public static int COLOR_LIGHT_GREEN = 10;
	public static int COLOR_LIGHT_YELLOW = 11;
	public static int COLOR_LIGHT_BLUE = 12;
	public static int COLOR_MAGENTA = 13;
	public static int COLOR_CYAN = 14;
	public static int COLOR_WHITE = 15;
	public static int ATTR_BOLD = 100;
	public static int ATTR_UNDERLINE = 101;
	public static int ATTR_RESET = 102;
	
	public void escape(String code) {
		char ESC = 27;
		System.out.print(ESC + "[" + code);
	}
	public void clear() {
		escape("H");
		escape("2J");
	}
	public void setForegroundColor(int c) {
		switch (c) {
			case 0:
				escape("0;30m");
				break;
			case 1:
				escape("0;31m");
				break;
			case 2:
				escape("0;32m");
				break;
			case 3:
				escape("0;33m");
				break;
			case 4:
				escape("0;34m");
				break;
			case 5:
				escape("0;35m");
				break;
			case 6:
				escape("0;36m");
				break;
			case 7:
				escape("0;37m");
				break;
			case 8:
				escape("1;30m");
				break;
			case 9:
				escape("1;31m");
				break;
			case 10:
				escape("1;32m");
				break;
			case 11:
				escape("1;33m");
				break;
			case 12:
				escape("1;34m");
				break;
			case 13:
				escape("1;35m");
				break;
			case 14:
				escape("1;36m");
				break;
			case 15:
				escape("1;37m");
				break;
		}
	}
	public void setAttribute(int a) {
		switch (a) {
			case 100:
				escape("1m");
				break;
			case 101:
				escape("4m");
				break;
			case 102:
				escape("0m");
				break;
		}
	}
	public void print(String chars) {
		System.out.print(chars);
	}
	public void println(String line) {
		System.out.println(line);
	}
	public String readLine() {
		Scanner sc = new Scanner(System.in);
		String line;
		line = sc.nextLine();
		sc.close();
		return line;
	}
	public void printLine(String element, int length) {
		for (int i=0; i<length; i++)
			print(element);
	}
	public void printTux() {
		print(
			"    .--.\n" + 
			"   |o_o |\n" +
			"   |:_/ |\n" +
			"  //   \\ \\\n" +
			" (|     | )\n" +
			"/'\\_   _/`\\\n" +
			"\\___)=(___/\n"
		);
	}
	public ANSIConsole() {}
}
