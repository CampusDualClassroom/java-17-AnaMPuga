package com.campusdual.classroom;

public class Exercise17 {
	public static int[] createEmptyIntArray(int positions) {
		int [] nuevoArray = new int[positions];
		return nuevoArray;
	}

	public static String[] createInitializedStringArray() {
		String [] arrayDeCadena = {"1", "2", "3"};
		System.out.println(arrayDeCadena);
		return arrayDeCadena;
	}

	public static void populateArray(int[] array, int index, int value) {
		array [index]= value;


	}

	public static int arrayLength(int[] array) {

		int longitud= array.length;
		return longitud;
	}

	public static void showValue(int[] array, int index) {

		System.out.println(array[index]);

	}

	public static void main(String[] args) {
		int[] intArray = createEmptyIntArray(3);
        String[] stringArray = createInitializedStringArray();
		populateArray(intArray, 0, 10);
		populateArray(intArray, 1, 9);
		populateArray(intArray, 2, 8);
		showValue(intArray, 0);
		System.out.println(arrayLength(intArray));
		createInitializedStringArray();
	}
}
