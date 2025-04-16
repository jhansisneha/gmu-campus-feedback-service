pipeline {
    agent any

    environment {
        // Docker image name and tag used for pushing to DockerHub
        IMAGE = 'jhansisneha/swe645-hw3:latest'
    }

    stages {
        stage('Checkout') {
            steps {
                // Pulls the latest code from the GitHub repository
                checkout scm
            }
        }

        stage('Build') {
            steps {
                // Builds the Spring Boot project and skips tests to speed up the build
                sh './mvnw clean package -DskipTests'
            }
        }

        stage('Docker Build & Push') {
            steps {
                // Uses saved DockerHub credentials (ID: docker) to authenticate and push image
                withCredentials([usernamePassword(credentialsId: 'docker', usernameVariable: 'DOCKER_USER', passwordVariable: 'DOCKER_PASS')]) {
                    sh """
                        // Build the Docker image using the Dockerfile
                        docker build -t $IMAGE .
                        
                        // Log in to DockerHub using saved credentials
                        echo "$DOCKER_PASS" | docker login -u "$DOCKER_USER" --password-stdin
                        
                        // Push the image to DockerHub
                        docker push $IMAGE
                    """
                }
            }
        }

        stage('Deploy to Kubernetes') {
            steps {
                // Uses Kubeconfig file (ID: kube_config) to authenticate and connect to the Rancher-managed cluster
                withCredentials([file(credentialsId: 'kube_config', variable: 'KUBECONFIG_FILE')]) {
                    sh """
                        // Setup kube config directory and copy credentials
                        mkdir -p ~/.kube
                        cp \$KUBECONFIG_FILE ~/.kube/config
                        chmod 600 ~/.kube/config

                        // Apply the Kubernetes deployment and service files
                        kubectl apply -f k8s/survey-deployment.yaml
                        kubectl apply -f k8s/survey-service.yaml
                    """
                }
            }
        }
    }
}
