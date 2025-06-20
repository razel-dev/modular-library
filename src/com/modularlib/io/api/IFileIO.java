package com.modularlib.io.api;

import java.io.IOException;
import java.util.List;

public interface IFileIO {

    /**
     * Écrit une chaîne dans un fichier, en écrasant le contenu existant.
     * @param content Le texte à écrire.
     * @param filePath Le chemin du fichier.
     * @throws IOException si une erreur d'écriture survient.
     */
    void writeToFile(String content, String filePath) throws IOException;

    /**
     * Ajoute une chaîne à la fin du fichier sans supprimer le contenu existant.
     * @param content Le texte à ajouter.
     * @param filePath Le chemin du fichier.
     * @throws IOException si une erreur d'écriture survient.
     */
    void appendToFile(String content, String filePath) throws IOException;

    /**
     * Lit toutes les lignes d'un fichier texte.
     * @param filePath Le chemin du fichier.
     * @return Une liste de lignes du fichier.
     * @throws IOException si une erreur de lecture survient.
     */
    List<String> readLines(String filePath) throws IOException;

    /**
     * Vérifie si un fichier existe à un chemin donné.
     * @param filePath Le chemin du fichier.
     * @return true si le fichier existe, false sinon.
     */
    boolean fileExists(String filePath);
}
