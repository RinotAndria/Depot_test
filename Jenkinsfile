pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Étape 1 : Compilation du projet...'
                sh 'mvn clean install'  // Compilation du projet avec Maven
            }
        }

        stage('Tests unitaires') {
            steps {
                echo 'Étape 2 : Exécution des tests unitaires...'
                sh 'mvn test'  // Exécution des tests unitaires avec Maven
            }
        }

        stage('Tests d\'intégration') {
            steps {
                echo 'Étape 3 : Tests d\'intégration...'
                sh 'mvn verify'  // Lancement des tests d'intégration avec Maven
            }
        }
    }
}
