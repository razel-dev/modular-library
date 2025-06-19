package com.modularlib.analysis.api;

/**
 * Interface représentant un analyseur de données générique.
 */
public interface IAnalyzer {

    /**
     * Analyse un tableau d'entiers et retourne une mesure (ex. moyenne, médiane...).
     *
     * @param data un tableau d'entiers à analyser
     * @return un résultat d'analyse sous forme de double
     */
    double analyze(int[] data);
}
