package com.modularlib.utils.api;

public interface IStringutils {
	/**
	 * Vérifie si une chaîne est nulle ou vide (après suppression des espaces).
	 * @param str represents character strings
	 * @return true or false if null or empty
	 */
	boolean isNullorEmpty (String str);
	
	/**
	 * Met en majuscule la première lettre de la chaîne, le reste en minuscule.
	 * @param str represents character strings
	 * @return formatage des chaines pour standardiser ("java" -> "Java" , "HELLO" -> "Hello")
	 */
	String capitalyze (String str);
	
	/**
	 *  Inverse les caractères d’une chaîne.
	 * @param str represents character strings
	 * @return caracteres inversés ("abc" -> "cba")
	 */
	String reverse (String str);
	
	  /**
     * Compte le nombre de mots dans la chaîne, séparés par des espaces.
     *
     * @param str la chaîne à analyser
     * @return le nombre de mots détectés
     */
    int countWords(String str);
    
    /**
     * Transforme une chaîne en snake_case :
     * - minuscules
     * - caractères spéciaux supprimés
     * - mots reliés par des underscores
     *
     * @param str la chaîne d’entrée
     * @return la version snake_case de la chaîne
     */
    String toSnakeCase(String str);
	
	

}
