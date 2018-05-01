package edu.maryville.isys320;
/*
 * Class:    ISYS-320
 * Student:  Matthew Shelby
 * Date:     30-APR-2018
 */

import java.awt.Point;
import java.util.Scanner;

public class FinalExam {

	public static void main(String[] args) {
		System.out.println("Question 9");
		squaredDifference();
		System.out.println(" ");
		System.out.println("Question 10");
		distance();
		System.out.println(" ");
		System.out.println("Question 11");
		DistanceFinder();
		System.out.println(" ");
		System.out.println("Question 12");
		TriangleWorld();
		System.out.println(" ");
		System.out.println("Question 13");
		GolfTracker();
	}

	public static void squaredDifference() {
		Scanner console = new Scanner(System.in);
		System.out.print("a = ");
		double a = console.nextDouble();
		System.out.print("b = ");
		double b = console.nextDouble();
		System.out.println("(a - b) ^ 2 = " + Math.pow((a - b), 2));
	}

	public static void distance() {
		Point p1 = new Point();
		p1.x = 12;
		p1.y = 4;
		Point p2 = new Point();
		p2.x = 18;
		p2.y = 7;
		System.out.println("Distance = " + Math.sqrt((Math.pow((p1.x - p2.x), 2)) + Math.pow((p1.y - p2.y), 2)));
	}

	public static void DistanceFinder() {
		Scanner console = new Scanner(System.in);
		System.out.println("Enter x, y for first point:");
		System.out.print("x1 = ");
		double x1 = console.nextDouble();
		System.out.print("y1 = ");
		double y1 = console.nextDouble();
		System.out.println("Enter x, y for second point:");
		System.out.print("x2 = ");
		double x2 = console.nextDouble();
		System.out.print("y2 = ");
		double y2 = console.nextDouble();
		System.out.println("Distance = " + Math.sqrt((Math.pow((x1 - x2), 2)) + Math.pow((y1 - y2), 2)));
	}

	public static void TriangleWorld() {
		Scanner console = new Scanner(System.in);
		System.out.print("What is your word? ");
		String word = console.next();

	}

	public static void GolfTracker() {
		Scanner console = new Scanner(System.in);
		int totalscore = 0;
		System.out.print("What is par for the course? ");
		int par = console.nextInt();
		System.out.print("Enter your next round score: ");
		int score = console.nextInt();
		while (score != -1) {
			totalscore = score - par;
			System.out.print("Enter your next round score: ");
			score = console.nextInt();
		}
		System.out.println("On this course your total score is " + totalscore);
		if (totalscore > 0) {
			System.out.println("Over par, work on your short game");
		} else if (totalscore == 0) {
			System.out.println("Even par, not bad.");
		} else if (totalscore < 0) {
			System.out.println("Under par, nice!");
		}
	}
}
