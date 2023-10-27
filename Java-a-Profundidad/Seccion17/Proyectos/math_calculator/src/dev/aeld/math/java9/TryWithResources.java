package dev.aeld.math.java9;

import java.io.InputStreamReader;

public class TryWithResources {

	public static void main(String[] args) {
		InputStreamReader isr = new InputStreamReader(System.in);
		try (isr){
			
		} catch (Exception e) {
			System.out.println(isr.toString());
		}

	}

}
