<h2> Jpa, Hibernate Spring Data  </h2>
# Projet de Gestion de Patients
<h4>Réaliser par Lablaida IKram </h4>
Ce projet vise à mettre en place un système de gestion de patients utilisant Spring Boot et JPA. Suivez les étapes ci-dessous pour configurer et exécuter le projet.

## Étapes d'installation

1. **Créer un projet Spring Initializer** :
    - Choisissez "Spring Initializr".
    - Configurez votre projet en ajoutant les dépendances suivantes : JPA, H2 Database, Spring Web, et Lombok.

2. **Créer l'entité JPA Patient** :
    - Créez une classe `Patient` avec les attributs requis : `id` (Long), `nom` (String), `dateNaissance` (Date), `malade` (boolean), et `score` (int).

3. **Configurer l'unité de persistance** :
    - Configurez l'unité de persistance dans le fichier `application.properties`.

4. **Créer l'interface JPA Repository** :
    - Créez une interface `PatientRepository` basée sur Spring Data JPA pour effectuer des opérations de CRUD sur les patients.

5. **Tester les opérations de gestion de patients** :
    - Implémentez des méthodes pour ajouter, consulter, chercher, mettre à jour et supprimer des patients dans mon service.

6. **Migration vers MySQL** :
    - Une fois le développement initial terminé, migrez la base de données de H2 vers MySQL en modifiant la configuration de l'unité de persistance et en ajustant les dépendances Maven si nécessaire.
      <img src="captures/img4.png">
      <img src="captures/img2.png">
      <img src="captures/img3.png">
      <img src="captures/img1.png">
