package com.stringsproject.application;
import java.util.Scanner;


public class AppStringsProject {

	public static void main(String[] args) {
		//Scanner entrada=new Scanner(System.in);
		String cadena="This Southern Operation would seal off China from outside help, thus underwriting victory in Japan's frustrating four-year war against Chiang Kai-shek's feckless but tenacious Chinese army. —David M. Kennedy,  Atlantic,  March 1999 ";
		String cadena2="This Southern Operation would seal off China from outside help, thus underwriting victory in Japan's frustrating four-year war against Chiang Kai-shek's feckless but tenacious Chinese army. —David M. Kennedy,  Atlantic,  March 1999 ";
		String cadena3=" Mundo";
		String cadena4="Hola";
		String[] cadena6=new String[50];
		
		System.out.println("La cantidad de caracteres es "+ cadena.length());
		System.out.println("El cuarto caracter de la cadena es "+cadena.charAt(5));
		
		if(cadena.compareTo(cadena2)==0)
		{
			System.out.println("Las cadenas son iguales");
		}
		else
		{
			System.out.println("Las cadenas son diferentes");
		}
		
		System.out.println(cadena4.concat(cadena3));
		cadena=cadena4.concat(cadena3);
		System.out.println(cadena);
		
		if (cadena2.contains("This"))
		{
			System.out.println("Si existe la frase");
		}
		else
		{
			System.out.println("No existe la frase");
		}
		
		if(cadena.endsWith("undo"))
		{
			System.out.println("Termina en Mundo");
		}
		else
		{
			System.out.println("No termina en Mundos");
		}
		
		if(cadena.equals("Hola Mu5ndo"))
		{
			System.out.println("Cadenas son iguales");
		}
		else
		{
			System.out.println("Cadenas no son iguales");
		}
		
		System.out.println("Encontró el caracter en la posicion :"+cadena2.indexOf('e'));
		
		System.out.println("Encontró el caracter en la posicion :"+cadena2.indexOf('e',100));
		
		System.out.println("Encontró el caracter en la posicion :"+cadena2.indexOf("war",100));
	
		System.out.println("Encontró el caracter en la posición :"+cadena2.lastIndexOf('e'));
		
		System.out.println("La cadena con el caracter remplazado: "+cadena2.replace('e', 'o'));
		
		cadena6=cadena2.split("o");
		for(int i=0;i<cadena6.length;i++)
		{
			System.out.println("Cadena["+i+"]:"+cadena6[i]);
		}
		
		
	}

}
