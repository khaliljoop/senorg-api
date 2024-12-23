package com.ikbs.senorgapi.entities;

public record User(
        int id,
        String nom,
        String prenom,
        int etat
) {
}
